
import java.util.Scanner;
import java.sql.*;

public class TestDynamic {
	public static void main() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("\nDrivers loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test" , "root", "");
		System.out.println("\nConnection Established ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter id:");
		int id=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Name:");
		String name=scan.nextLine();
		
		System.out.println("Enter Address:");
		String address=scan.nextLine();
		
		String sql="insert into stud values(?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1,id);
		pst.setString(2,name);
		pst.setString(3, address);
		
		int i=pst.executeUpdate();
		System.out.println("Rows affected:" +i);
	}


}
