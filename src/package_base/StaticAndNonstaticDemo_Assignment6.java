package package_base;

public class StaticAndNonstaticDemo_Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Before Creating Objects");
StaticandNonstatic_Assignment6.displayObjectcount();
System.out.println();
System.out.println("After Creating Objects");
StaticandNonstatic_Assignment6 object=new StaticandNonstatic_Assignment6('N');
StaticandNonstatic_Assignment6.displayObjectcount();
//accessing the non static method using the object
object.displayUserchoice();




	}

}
