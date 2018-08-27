package package_base;
import java.lang.Math;
import java.text.DecimalFormat;

public class usingMath_Assignment5 {

		public static double getrandom() {
		double randomnum=Math.random();
		DecimalFormat newFormat = new DecimalFormat("#.##");
		double twoDecimal =  Double.valueOf(newFormat.format(randomnum));
		return twoDecimal;
		
	}
	
	
	public static void usingifelse(double number) {
		System.out.println("*************Using If Else****************");
		if(number<=0.5) {
			System.out.println("Obtained Random number :"+ number+"  is Less than 0.5");
		}
		else {
			System.out.println("Obtained Random number :"+number+" is Greater than 0.5");
		}
		System.out.println();
	}
	
	
	public static void usingternary(double number) {
		System.out.println("*************Using ternary****************");
		String result;
		result=(number<0.5)?"Lesser":"Greater";
		System.out.println("Obtained Random number :"+number+" is "+result +" than 0.5");		
	}
	
	
	
	public static void main(String[] args) {
		double randomNumber=getrandom();
		// TODO Auto-generated method stub
		usingifelse(randomNumber);
		usingternary(randomNumber);
	}

}
