import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Linkedlist {

	public static void main(String[] args) {
		int ch;
		Scanner s=new Scanner(System.in);
		LinkedList<Integer> l1=new LinkedList<Integer>();
		System.out.println("\nWelcome to Linkedlist ");
		do {
		System.out.println("Enter Your Choice :");
		System.out.println("\n1.Add Element \n2.Remove Element \n3.Display list");
		ch=s.nextInt();
		s.nextLine();
		switch(ch) {
		case 1:
			System.out.println("\nHow many elements do you want to insert ");
			int j=s.nextInt();
			s.nextLine();
			System.out.println("\nEnter the elements one by one");
			for (int i=0;i<j;i++) {
				l1.add(s.nextInt());
				s.nextLine();
			}
			System.out.println("\nDone Adding elements ");
			break;
		case 2:
			System.out.println("\nEnter the index of element you want to remove \nNote : Index starts from zero ");
			l1.remove(s.nextInt());
			s.nextLine();
			System.out.println("\nElement Deleted Successfully");
			break;
			
		case 3:
			System.out.println("\nPrinting the whole list please wait");
			ListIterator liter=l1.listIterator();
			while(liter.hasNext()) {
				System.out.println(liter.next());
			}
				
			break;
		default :
			
		}
		}while(ch<4);
			

	}
}
