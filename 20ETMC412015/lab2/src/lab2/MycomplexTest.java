package lab2;
class MycomplexTest{
	public static void main(String[] args) {
		MyComplex C1=new MyComplex(10.03,20.00);
		MyComplex C2=new MyComplex(20.07,20.01);
		MyComplex ans=C1.Addcomp(C1,C2);
		MyComplex subs=C1.subcomp(C1,C2);
		MyComplex multi=C1.multicomp(C1,C2);
		System.out.println("The sum of the two complex numbers is "+ans.getReal()+"+i"+ans.getImag());
		System.out.println("The difference of two comlex numbers is "+subs.getReal()+"+i"+subs.getImag());
		System.out.println("The product of two complex number is "+multi.getReal()+"+i"+multi.getImag());
	}
}