package lab2;
public class MyComplex{
	private double real;
	private double imag;
	public MyComplex(double real,double imag) {
		this.real=real;
		this.imag=imag;
	}
	public double getReal() {
		return real;
	}
	public double getImag() {
		return imag;
	}
	public MyComplex Addcomp(MyComplex C1,MyComplex C2) {
		MyComplex C3=new MyComplex(0.0,0.0);
		C3.real=C1.real+C2.real;
		C3.imag=C1.imag+C2.imag;
		return C3;
	}
	public MyComplex subcomp(MyComplex C1,MyComplex C2) {
		MyComplex C4=new MyComplex(0.0,0.0);
		C4.real=C2.real-C1.real;
		C4.imag=C2.imag-C1.imag;
		return C4;
	}
	public MyComplex multicomp(MyComplex C1,MyComplex C2) {
		MyComplex C5=new MyComplex(0.0,0.0);
		C5.real=(C2.real*C1.real)-(C2.imag*C1.imag);
		C5.real=(C2.imag*C1.real)-(C2.real*C1.imag);
		return C5;
	}
	
}