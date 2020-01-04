package date;
import java.time.LocalDate;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Datetimeexample3 {
	public static void main(String args[])
	{
	
	//ISO Date
	LocalDate localDate = LocalDate.now();
	DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
	System.out.println(localDate.format(dateFormatter));
	
	//yyy/mm/dd pattern
	DateTimeFormatter dateFormatter1=DateTimeFormatter.ofPattern("yyyy/mm/dd");
	System.out.println(localDate.format(dateFormatter1));
	
	//mmm dd, yyy pattern
	DateTimeFormatter dateFormatter2=DateTimeFormatter.ofPattern("MMMM/dd /yyyy");
	System.out.println(localDate.format(dateFormatter2));
	
	//dd-MM-yyyy pattern
	DateTimeFormatter dateFormatter3=DateTimeFormatter.ofPattern("dd-MM-yyyy");
	System.out.println(localDate.format(dateFormatter3));
	
	//dd-LL-yyyy pattern
	DateTimeFormatter dateFormatter4=DateTimeFormatter.ofPattern("dd-LL-yyyy");
	System.out.println(localDate.format(dateFormatter4));
	
	
	
	}
}
