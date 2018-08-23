package package_base;

class Base{
	
	
	public void printtable(int i) {
		System.out.println("Printing the table of : "+i);
		for(int j=1; j<=10;j++) {
			
			System.out.println(i+"*"+j+"="+i*j);
			
		}
	}		

}
public class Assignment1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Base base=new Base();
		base.printtable(5);
		
	}
	

	}



