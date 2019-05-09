import java.sql.*;
public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("\nDrivers loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test" , "root", "");
		System.out.println("\nConnection Established ");
		String query="insert into students values(4,'Yogesh', 'pune')";
		Statement st=con.createStatement();
		int res=st.executeUpdate(query);
		System.out.println("Rows affected are :" +res);
	}

}
