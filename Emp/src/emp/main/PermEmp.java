package emp.main;

public class PermEmp extends Employee {
	 final float bSal;
	float da;
	float hra;

	public PermEmp(int id, String name,float bSal) {
		this.bSal = bSal;
		this.id=id;
		this.name=name;
	}

	void calcSal() {
		da = (20 * bSal) / 100;
		hra = (10 * bSal) / 100;
		salary = bSal + da + hra;
	}

	void print() {
		super.print();
		System.out.println("DA is :" + da);
		System.out.println("HRA is :" + hra);
		System.out.println("Basic Sal is :" + bSal);

	}
}
