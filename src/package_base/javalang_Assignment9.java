package package_base;

public class javalang_Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<1||args.length>1) {
			System.out.println("Invalid no.of arguments- Supple exactly 1 arguments");
			System.exit(0);	
			
		}
		Double d=Double.valueOf(args[0]);
		
		javalang_Assignment9 obj=new javalang_Assignment9();
		obj.getabsvalue(d);
		obj.getroundedvalue(d);
		obj.getsquareroot(d);
		
		
	}
	
	public void getabsvalue(double d) {
		System.out.println("Absolute value of the given number is  = " + Math.abs(d));
	}
	
	public void getroundedvalue(double d) {
		System.out.println("Rounded value of the given number is  = " + Math.round(d));
	}
	
	public void getsquareroot(double d) {
		System.out.println("Squareroot value of the given number is  = " + Math.sqrt(d));
	}

}
