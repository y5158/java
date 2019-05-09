
import java.util.Scanner;
import java.util.Vector;

public class Vctor {
	public static void main(String[] args) {
	int count;
	int ch;
	Scanner s=new Scanner(System.in);
	Vector<Integer> v=new Vector<Integer>();
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
			v.addElement(s.nextInt());
			s.nextLine();
		}
		System.out.println("\nDone Adding elements ");
		break;
	case 2:
		System.out.println("\nEnter the index of element you want to remove \nNote : Index starts from zero ");
		v.remove(s.nextInt());
		s.nextLine();
		System.out.println("\nElement Deleted Successfully");
		break;
		
	case 3:
		System.out.println("\nPrinting the whole list please wait");
		System.out.println(v);
		break;
	default :
		
	}
	}while(ch<4);
		

}
}
