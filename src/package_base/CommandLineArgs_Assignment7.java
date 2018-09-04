package package_base;

public class CommandLineArgs_Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
if(args.length<2||args.length>2) {
	System.out.println("Invalid no.of arguments- Supple exactly 2 arguments");
	System.exit(0);	
	
	
	
}
System.out.println("With out Wrapper class::");
System.out.println(args[0]+"   "+args[1]);
System.out.println("Concat is :"+args[0]+args[1]);
System.out.println("With Wrapper class::");
Integer i=Integer.valueOf(args[0]);
Integer j=Integer.valueOf(args[1]);
System.out.println("Sum is : "+(i+j));
	
	}

}
