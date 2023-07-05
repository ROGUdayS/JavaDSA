package lab3;
public class marksbook{
	String coursename;
	int[] marksbook = new int[5];
	void setcoursename(String a) {
		this.coursename=a;
	}
	void setarray(int[] arr) {
		this.marksbook=arr;
	}
	void diplaymarks() {
		System.out.println("The maks of all the students are");
		for(int i=0;i<this.marksbook.length;i++) {
			System.out.println(this.marksbook[i]+"");
		}
	}
	double average() {
		double total=0;
		for(int i=0;i<this.marksbook.length;i++) {
			total+=this.marksbook[i];
		}
		return total/(this.marksbook.length);
	}
	int highest() {
		int max=this.marksbook[0];
		for(int i=0;i<this.marksbook.length;i++) {
			if(max<this.marksbook[i]) {
				max=marksbook[i];
			}
		}
		return max;
	}
}