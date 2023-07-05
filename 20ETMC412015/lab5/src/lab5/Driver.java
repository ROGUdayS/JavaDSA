package lab5;
public class Driver{
	public static void main(String args[]) {
		Shape[]shape=new Shape[2];
		shape[0]=new Triangle(3,7);
		shape[1]=new Rectangle(1,7);
		System.out.println("The Area of the Triangle is :"+shape[0].getArea());
		System.out.println("The Area of the Rectangle is :"+shape[1].getArea());
	}
}