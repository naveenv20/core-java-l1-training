package package_base;

public class ArrayCreation_Assignment3 {

	int array[];
	
	//Constructor
	ArrayCreation_Assignment3(){
		array=new int[10];
		
	}
	
	public void arrayvalues() {
		for (int i=0;i<array.length;i++) {
			//loading array with square values
			array[i]=(i*i);
		}
	}
	
	
	public void displayarray() {
		System.out.println("***************Printing the Array**************");
	for (int i=0;i<array.length;i++) {	
		System.out.println("array["+i+"] is "+array[i]);
	}
	}
	
	
	
}
