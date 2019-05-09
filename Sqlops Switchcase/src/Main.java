import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int ch;
		Scanner s=new Scanner(System.in);
		Operations o=new Operations();
		do{
			System.out.println("\nWeclome to MYSQL");
		System.out.println("\n1.Insert 2.Delete 3.Update 4.Display 5.Exit");
		System.out.println("\nEnter your choice");
		ch=s.nextInt();
		switch (ch) {
		case 1:
			o.insert();
			break;
		case 2:
			o.delete();
			break;
		case 3:
			o.update();
			break;
		case 4:
			o.display();
			break;
		default:
			
		}
		}while(ch<5);
System.out.println("\nProgramme Terminated");
	}

}
