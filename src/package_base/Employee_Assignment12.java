package package_base;

public class Employee_Assignment12 extends Person{
	int empno;
	double salary;
	
	public Employee_Assignment12 (int empid,String name, int day, int month, int year, double sal) {
		super(name,day,month,year);
		empno=empid;
		salary=sal;
	}
	
	public void displaydetails() {
		super.displaydetails();
		System.out.println("Employee id :"+ empno);
		System.out.println("Salary : "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person objperson= new Person("Kiran",10,11,1995);
objperson.displaydetails();

Employee_Assignment12 objemployee= new Employee_Assignment12(12345, "Rama", 21, 03, 2001, 55000);
objemployee.displaydetails();

objperson=objemployee;
objperson.displaydetails();
	}

}
