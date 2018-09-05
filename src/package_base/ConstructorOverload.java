package package_base;

public class ConstructorOverload {

	int i1,i2;
	
	public ConstructorOverload(int inum) {
		i1=inum;
		System.out.println("Constructor with one argument");
		System.out.println("num i1 is :"+i1+" num i2 is :"+i2);
	}
	
	public ConstructorOverload(int inum1, int inum2) {
		i1=inum1;
		i2=inum2;
		System.out.println("Constructor with Two arguments");
		System.out.println("num i1 is :"+i1+" num i2 is :"+i2);
	}
	
	public ConstructorOverload() {
		
		
		System.out.println("Default Constructor");
		System.out.println("num i1 is :"+i1+" num i2 is :"+i2);
	}
	
	
}
