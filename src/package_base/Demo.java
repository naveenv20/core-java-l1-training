package package_base;

abstract class Demo {

	protected  int count;
	private int number;
	abstract void getValues();
	
	final void displayValues() {
		System.out.println("From Demo "+"Number : "+number+" count: "+count);
	}
	
	final void compute(){}
}
