package lab4;
public class rectangle{
	public double length=1.0;
	public double width=1.0;
	static int flag=0;
	public void CondCheck(double num)throws IllegalArgumentException{
		if((num<0.0)||(num>=20.0)) {
			throw new IllegalArgumentException("Input out of range. Please enter a number in range 0.0 and 20.0");
			}
	}
	public double getLength() {
		return length;
	}
	public void setlength(double length) {
		try {
			CondCheck(length);
			this.length=length;
		}
		catch(IllegalArgumentException ex) {
			flag=1;
			System.out.println("Caught the Exception");
			System.out.println("Exception Occured "+ex);
		}
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		try {
			CondCheck(width);
			this.width=width;
		}
		catch(IllegalArgumentException ex) {
			flag=1;
			System.out.println("Caught the Exception");
			System.out.println("Exception Occured "+ex);
		}
	}
	public double perimeter() {
		return 2*(this.length+this.width);
	}
	public double area() {
		return this.length*this.width;
	}
}