import java.sql.*;
import java.util.Scanner;

public class Operations {
	Scanner s=new Scanner(System.in);
	Connection con;
	public Operations() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("\nDrivers Loaded");
		con=DriverManager.getConnection("jdbc:mysql://localhost/test", "root","");
		System.out.println("\nConnection established");
	}
public void insert() throws SQLException{
	System.out.println("\nEnter the id:");
	int i=s.nextInt();
	s.nextLine();
	System.out.println("\nEnter the name:");
	String name=s.nextLine();
	System.out.println("\nEnter the address :");
	String address=s.nextLine();
	String q="insert into student values(?,?,?)";
	PreparedStatement ps=con.prepareStatement(q);
	ps.setInt(1, i);
	ps.setString(2, name);
	ps.setString(3, address);
	int j=ps.executeUpdate();
	System.out.println("\nRows affected :" +j);
}
public void delete() throws SQLException {
	System.out.println("\nEnter the id of the student you want to delete");
	int i=s.nextInt();
	s.nextLine();
	String q="delete from student where id= ?";
	PreparedStatement ps=con.prepareStatement(q);
	ps.setInt(1, i);
	int j=ps.executeUpdate();
}
public void update() throws SQLException {
	String name,address;
	System.out.println("\nEnter the id of the student you want to update");
	int id=s.nextInt();
	s.nextLine();
	System.out.println("\n1.Name 2.Address");
	int ch=s.nextInt();
	s.nextLine();
	switch(ch) {
	case 1:
		String q="update student set name=? where id=?";
		System.out.println("\nEnter the new name");
		name=s.nextLine();
		PreparedStatement ps=con.prepareStatement(q);
		ps.setString(1,name);
		ps.setInt(2, id);
		int k=ps.executeUpdate();
		System.out.println("\nRows Affected :"+k);
		break;
	case 2:
		String q2="update student set address=? where id=?";
		System.out.println("\nEnter the new address");
		address=s.nextLine();
		PreparedStatement ps1=con.prepareStatement(q2);
		ps1.setString(1,address);
		int j=ps1.executeUpdate();
		System.out.println("\nRows affected :" +j);
		
		break;
	default :
		}
	
	}
public void display() throws SQLException {
	System.out.println("\nEnter the id of the student you want to display data");
	int id=s.nextInt();
	s.nextLine();
	String q="select * from student where id=?";
	PreparedStatement ps=con.prepareStatement(q);
	ps.setInt(1,id);
	ResultSet rs=ps.executeQuery();
	while(rs.next()) {
		System.out.println(rs.getInt(1)+"," +rs.getString(2)+","+rs.getString(3));
	}
}
}



