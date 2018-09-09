package package_base;

public class ReferenceDemo_Assignment18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyClass1 c1=new MyClass1();
Myclass2 c2=new Myclass2();
Myclass3 c3=new Myclass3();


//c2=c3;
//c3=c2;
Myinterface Iref=c3;
System.out.println("Interface ref pointing to the object of implementing class");
//c3=(Myclass3)c2;
//c2=c1;

/*
 * Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Type mismatch: cannot convert from Myclass3 to Myclass2
	Type mismatch: cannot convert from Myclass2 to Myclass3
	Cannot cast from Myclass2 to Myclass3
	Type mismatch: cannot convert from MyClass1 to Myclass2

	at package_base.ReferenceDemo_Assignment18.main(ReferenceDemo_Assignment18.java:12)

 * 
 * 
  */
 
	}

}
