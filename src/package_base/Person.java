package package_base;

public class Person {

	String sname;
	int day,month,year;
	
	public Person(String stemp, int d,int m, int y) {
		sname=stemp;
		day=d;
		month=m;
		year=y;
		
		
	}
	
	public void displaydetails() {
		System.out.println("Name : "+sname);
		System.out.println("DOJ: "+day+"-"+month+"-"+year);
	}
	
}
