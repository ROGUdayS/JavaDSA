package lab3;
public class gradebook{
	public static void main(String[] args) {
		marksbook m=new marksbook();
		m.coursename="PP";
		int[] a= {20,40,70,50,60};
		m.marksbook=a;
		System.out.println("The coursename "+m.coursename);
		m.diplaymarks();
		System.out.println("The average of the class "+m.average());
		System.out.println("The highest mark in the class "+m.highest());
	}
}