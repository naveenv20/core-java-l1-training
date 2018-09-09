package package_base;

public class ManipuStrings_Assignment20 {

	public static void main(String[] args) {
		if(args.length<2||args.length>2) {
			System.out.println("Invalid no.of arguments- Supple exactly 2 arguments");
			System.exit(0);	
			
}
		ManipuStrings_Assignment20 obj=new ManipuStrings_Assignment20();	
	
	
		
		//StringBuffer s= new StringBuffer(string);
		String concatone=obj.concat(args[0], args[1]);
		obj.countw(concatone);
		concatone=obj.replacew(concatone);
		obj.capti(concatone);
	}

	
	public int countw(String a) {
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='w'||a.charAt(i)=='W') {
				count++;
			}
			
		}
		System.out.println("Count of W  is :"+count);
		return count;
	}
	
	public String replacew(String b) {
		StringBuffer a=new StringBuffer(b);
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='w'||a.charAt(i)=='W') {
				a.deleteCharAt(i);
				a.insert(i, "T");
			}
			
		}
		System.out.println("Modified and Replaced String is :"+a);
		return a.toString();
	}
	
	public String concat(String a,String b) {
		String temp;
		temp=a+" "+b;
		System.out.println("Modified Concat String is :"+temp);
		return temp;
	}
	
	public String capti(String c) {
		
	String temp;
	
	temp=c.toUpperCase();
	System.out.println("Modified Captilised String is is :"+temp);
	return temp;
	}
	
}
