package emp.main;

import java.util.Scanner;

public class MainEmp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("/********enter the choice*****/");
		System.out.println("1.Permanent\n");
		System.out.println("2.Consultant");
		int choice = s.nextInt();
		switch (choice) {
		case 1:
			System.out.println("\nEnter the id :");
			int id = s.nextInt();
			s.nextLine();
			System.out.println("\nEnter the name");
			String name = s.nextLine();
			System.out.println("\nEnter the basic salary");
			float salary = s.nextFloat();
			PermEmp per = new PermEmp(id, name, salary);
			per.calcSal();
			per.print();
			break;
		case 2:
			System.out.println("\n Enter the id ");
			int id2 = s.nextInt();
			s.nextLine();
			System.out.println("\nEnter the name");
			String name2 = s.nextLine();
			System.out.println("\n Enter no of hours");
			float hrs = s.nextFloat();
			System.out.println("\n Enter rate per hout");
			float perhr = s.nextFloat();
			Consult con = new Consult(id2,name2,hrs,perhr);
			con.calcSal();
			con.print();
			break;
			
			
		default:
			break;
		}

	
		

	}

}
