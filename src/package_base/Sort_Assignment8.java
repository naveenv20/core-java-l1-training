package package_base;

public class Sort_Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length<5||args.length>5) {
			System.out.println("Invalid no.of arguments- Supple exactly 5 arguments");
			System.exit(0);	
			
		}
		double a[]=new double[5];
		for ( int i=0;i<5;i++) {
			Double d=Double.valueOf(args[i]);
			a[i]=d;
			
		}
		System.out.println("Before Sort");
		for (int i=0;i<5;i++) {
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.println();
		System.out.println("After Sort");
		for(int i=0;i<5;i++) {
			double temp;
			for(int j=i;j<4;j++) {
				if(a[i]<a[j+1]) {
					
				}
				else {
					temp=a[i];
					a[i]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
			for (int i=0;i<5;i++) {
				System.out.print(a[i]);
				System.out.print(' ');
			}
			
		}
		
		
	}


