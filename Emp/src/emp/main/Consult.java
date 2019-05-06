package emp.main;

public class Consult extends Employee {
	float hrs;
	float ratePerHr;
	public Consult(int id,String name,float hrs,float ratePerHr) {
		this.hrs=hrs;
		this.ratePerHr=ratePerHr;
		this.id=id;
		this.name=name;
	}
	void calcSal() {
		salary = hrs * ratePerHr;
	}

	void print() {
		super.print();
		System.out.println("No of hrs is :" + hrs);
		System.out.println("Rate per hr is :" + ratePerHr);

	}
}
