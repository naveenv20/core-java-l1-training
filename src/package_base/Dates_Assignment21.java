package package_base;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Dates_Assignment21 {

	public static void main(String[] args) {
		
		if(args.length<3||args.length>3) {
			System.out.println("Invalid no.of arguments- Supple exactly 3 arguments in the format DD MMM YYYY");
			System.exit(0);	
			
}
		String DOB=args[0]+args[1]+args[2];
		/*
		String pattern = "dd-MMM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		*/
		
		
		DateFormat format = new SimpleDateFormat("ddMMMyyyy", Locale.ENGLISH);
		Date date;
		
		
		try {
			date = format.parse(DOB);
			//converting the entered date from commnad prompt to date
			//System.out.println(date);
		
		// Sat Jan 02 00:00:00 GMT 2010
		DateFormat format2 = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
		
		
		 	
		String Modifieddate = format2.format(date);
		System.out.println(Modifieddate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
