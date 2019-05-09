import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		int ch;
		int count=0;
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> a1=new ArrayList<Integer>();
		do {
		System.out.println("\nEnter Your Choice :");
		System.out.println("\n1.Add Element \n2.Remove Element \n3.Display list");
		ch=s.nextInt();
		s.nextLine();
		switch(ch) {
		case 1:
			System.out.println("\nHow many elements do you want to insert ");
			int j=s.nextInt();
			s.nextLine();
			System.out.println("\nEnter the elements one by one");
			if(ch==0) {
				for (int i=0;i<j;i++) {
					a1.add(s.nextInt());
					s.nextLine();
					count++;
				}
				System.out.println("\nDone Adding elements ");
			break;	
			}
			
			else {
				for(int i=count;i<count+j;i++)
					a1.add(s.nextInt());
					s.nextLine();
					count++;
			break;
			}
			
		case 2:
			System.out.println("\nEnter the index of element you want to remove \nNote : Index starts from zero ");
			a1.remove(s.nextInt());
			s.nextLine();
			System.out.println("\nElement Deleted Successfully");
			count--;
			break;
			
		case 3:
			System.out.println("\nPrinting the whole list please wait");
			System.out.println(a1);
			break;
		default :
			
		}
		}while(ch<4);
System.out.println("\nProgramm Terminated..");		

	}

}
