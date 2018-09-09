package package_base;

public class MyDemo_Assignment14 extends Demo{

	
	int value;
	MyDemo_Assignment14(int temp){
		value=temp;
		count=temp;
		
		}
	static Demo object;
	public static void main(String[] args) {
		object=new MyDemo_Assignment14(20);
		MyDemo_Assignment14 object2=new MyDemo_Assignment14(20);
	
		object.displayValues();
		object2.incrementCount();
	}
	


	@Override
	void getValues() {
		
		
	}

	void incrementCount() {
	count++;
	System.out.println("Incremented Count :"+count);
	}
	void incrementNumber() {
		//number++;
		}
}
