package lab5;
public class Shape{
	public double getArea() {
		return 0;
	}
}
class Rectangle extends Shape{
	public double width;
	public double height;
	public Rectangle(double width,double height) {
		this.width=width;
		this.height=height;
	}
	public double getArea() {
		return width*height;
	}
}
class Triangle extends Shape{
	public double base;
	public double height;
	public Triangle(double height,double base) {
		this.height=height;
		this.base=base;
	}
	public double getArea() {
		return 0.5*base*height;
	}
}