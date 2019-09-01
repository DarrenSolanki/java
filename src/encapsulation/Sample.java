package encapsulation;

class Employee{
	private double empSalary;
	
	Employee(double salary){
		empSalary = salary;
	}
	
	double getSalary(){
		return empSalary;
	}
	
	void setSalary(double empHike){
		empSalary = empHike;
	}
}

public class Sample {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1000.50);
		
		System.out.println("Emp salary is "+e1.getSalary());
		e1.setSalary(20000.0);
		System.out.println("Emp salary is "+ e1.getSalary());
	}

}
