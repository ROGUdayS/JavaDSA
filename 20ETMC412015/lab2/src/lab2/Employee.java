package lab2;
public class Employee {
	private String first_name;
	private String last_name;
	private double m_salary;
	
	public Employee(String first,String last){
		this.first_name=first;
		this.last_name=last;
	}
	public void set_value(double salary) {
		if(salary>0) {
			this.m_salary=salary;
		}
	}
	public double get_value() {
		return this.m_salary;
	}
	public double increment() {
		double updated_yearly_salary;
		updated_yearly_salary=12*m_salary*10/100+12*m_salary;
		return updated_yearly_salary;
	}
	public static void main(String[] args) {
		Employee e1=new Employee("Uday","Kumar");
		Employee e2=new Employee("James","Bond");
		e1.set_value(21000.0);
		e2.set_value(20000.0);
		System.out.println("The incremented Salary for Employee 1 is :"+e1.increment());
		System.out.println("The incremented Salary for Employee 2 is :"+e2.increment());
		System.out.println(e1.first_name);
	}
}