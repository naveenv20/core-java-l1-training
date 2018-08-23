package package_base;

public class Student_Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Studentmarks studentmarks=new Studentmarks();
studentmarks.setSubject1(90);
double subject1=studentmarks.getSubject1();
studentmarks.setSubject2(15);
double subject2=studentmarks.getSubject2();
studentmarks.setSubject3(95);
double subject3=studentmarks.getSubject3();
studentmarks.getResults(subject1, subject2, subject3);
	}

}

class Studentmarks{
	
	
	
	double subject1;
	double subject2;
	double subject3;
	
	public double getSubject1() {
		return subject1;
	}
	public void setSubject1(double subject1) {
		this.subject1 = subject1;
	}
	public double getSubject2() {
		return subject2;
	}
	public void setSubject2(double subject2) {
		this.subject2 = subject2;
	}
	public double getSubject3() {
		return subject3;
	}
	public void setSubject3(double subject3) {
		this.subject3 = subject3;
	}
	
	public void getResults(double subject1, double subject2,double subject3) {
		double total_marks;
		total_marks=subject1+subject2+subject3;
		System.out.println("Marks of the student are ");
		System.out.println("Subject 1:  "+subject1 +" Subject 2: "+subject2+" Subject 3: "+ subject3);
		double Average_marks=total_marks/3;
		if(80<= Average_marks && Average_marks<=100) {
			System.out.println("Grade of the students is : A  and the Average marks are : "+Average_marks);
		}
			else if (73<=Average_marks & Average_marks<=79) {
				System.out.println("Grade of the students is : B+  and the Average marks are : "+Average_marks);
		}
			else if (65<=Average_marks & Average_marks<=72) {
				System.out.println("Grade of the students is : B  and the Average marks are : "+Average_marks);
		}
			else if (55<=Average_marks & Average_marks<=64) {
				System.out.println("Grade of the students is : C  and the Average marks are : "+Average_marks);
		}
			else if (0<=Average_marks & Average_marks<=54) {
				System.out.println("Grade of the students is : D  and the Average marks are : "+Average_marks);
		}
			
		}
		
		
		
	}
	

