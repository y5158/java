package emp.main;

public class Employee {
	int id;
	String name;
	float salary;
	public Employee(){
		
	}
	public Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	 void calcSal() {
		
	}
	void print() {
		System.out.println("Id is :" +id);
		System.out.println("Name is :" +name);
		System.out.println("Salary is :" +salary);
	}

}
