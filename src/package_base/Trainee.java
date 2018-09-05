package package_base;

public class Trainee extends Employee{
	
	public Trainee(int i1, int i2, int i3) {
		super(i1,i2,i3);
	}

	public void displaygradepointavg() {
		double avg;
		avg=(tgrade1+tgrade2+tgrade3)/3;
		System.out.println("Grade average is :"+avg);
	}
	
}
