package date;
import java.time.LocalDate;
import java.time.Month;
public class Datetimeexample1 {
	public static void main(String[] args)
	{
		//current date
		LocalDate localDate=LocalDate.now();
		System.out.println("TOday's Date is :"+localDate);
		
		//Specific date
		LocalDate localDate2=LocalDate.of(2020, Month.JANUARY, 02);
		System.out.println(localDate2);
		LocalDate localDate3=LocalDate.of(1947, Month.AUGUST, 15);
		System.out.println(localDate3);
		
		System.out.println("Year : "+localDate.getYear());
		System.out.println("Month : "+localDate.getMonth().getValue());
		System.out.println("Day of Month : "+localDate.getDayOfMonth());
		System.out.println("Day of Week : "+localDate.getDayOfWeek());
		System.out.println("Day of Year : "+localDate.getDayOfYear());
		
		//LocalDate's minus methods
		System.out.println("Addition of days :"+localDate.plusDays(5));
		System.out.println("Addition of months :"+localDate.plusMonths(15));
		System.out.println("Addition of weeks :"+localDate.plusWeeks(45));
		System.out.println("Addition of days :"+localDate.plusYears(5));
		
		//LocalDate's minus methods
		System.out.println("Subtraction of days :"+localDate.minusDays(5));
		System.out.println("Subtraction of months :"+localDate.minusMonths(15));
		System.out.println("Subtraction of weeks :"+localDate.minusWeeks(45));
		System.out.println("Subtraction of years :"+localDate.minusYears(5));
	

	}

}
 