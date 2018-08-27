package package_base;

public class BookDemo_Assignment4 {
	Book_Assignment4 objbooks[];
	
	BookDemo_Assignment4(){
		
		objbooks=new Book_Assignment4[2];
	}
	
	void createBooks() {
		//Invoking the getters and setters the other class array objects 
		objbooks[0]=new Book_Assignment4();
		objbooks[0].setBookTitle("Gone with the wind");
		objbooks[0].setPrice(500);
		objbooks[1]=new Book_Assignment4();
		objbooks[1].setBookTitle("Java Programming");
		objbooks[1].setPrice(640);
		
		
	}
	
	void showBooks() {
		//showing the details 
	for (int i=0;i<objbooks.length;i++) {
		System.out.println("Book "+i+" Details ::");
		System.out.println("Book Title:: "+objbooks[i].getBookTitle());
		System.out.println("Book Price:: "+objbooks[i].getPrice());
	}
	
	
	
	}
	
	
	
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookDemo_Assignment4 objDemo=new BookDemo_Assignment4();
		objDemo.createBooks();
		objDemo.showBooks();
		
		}
		
		
	}
		
		
		
		
		
	



