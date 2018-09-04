package package_base;

public class Methodoverload_Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<1||args.length>1) {
			System.out.println("Invalid no.of arguments- Supple exactly 1 arguments");
			System.exit(0);	
			
		}
		
		Double d=Double.valueOf(args[0]);
		//Integer i=Integer.valueOf(args[0]);
		int i=(int)((double)d); 
		Methodoverload_Assignment10 obj=new Methodoverload_Assignment10();
		
		System.out.println("Suare value using the overloaded method for int variables : "+obj.findsquare(i));
		System.out.println("Suare value using the overloaded method for int variables : "+obj.findsquare(d));
		
	}
	
	public int findsquare(int i) {
		return (i*i);
	}
	
	public double findsquare(double d) {
		return (d*d);
	}

}
