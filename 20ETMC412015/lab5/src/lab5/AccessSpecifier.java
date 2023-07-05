package lab5;
public class AccessSpecifier{
	public static int num1=10;
	private static int num2=20;
	protected static int num3=30;
	static int num4=40;
	public static void main(String[] args) {
		System.out.println("num 1 :"+num1);
		System.out.println("num 2 :"+num2);
		System.out.println("num 3 :"+num3);
		System.out.println("num 4 :"+num4);
	}
}