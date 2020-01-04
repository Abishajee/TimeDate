package date;
import java.time.LocalDate;
import java.time.Month;
public class Datetimexample2 {
	public static void main(String[] args)
	{
		LocalDate localDate1=LocalDate.of(2019,Month.JANUARY,1);
		LocalDate localDate2=LocalDate.of(2020,Month.FEBRUARY,1);
		
		//Number of days in a month
		System.out.println("Number of days in "+localDate1.getMonth()+" : "+localDate1.lengthOfMonth());
		System.out.println("Number of days in "+localDate2.getMonth()+" : "+localDate2.lengthOfMonth());
		
		//Number of days in year
		System.out.println("Number of days in "+localDate1.getYear()+" : "+localDate1.lengthOfYear());
		System.out.println("Number of days in "+localDate2.getYear()+" : "+localDate2.lengthOfYear());
		if(localDate1.isLeapYear())
		{
			System.out.print(localDate1.getYear()+" is a leap year");
		}
		else
		{
			System.out.print(localDate1.getYear()+" is not a leap year");
		}
        if(localDate2.isLeapYear())
        {
			System.out.print(localDate2.getYear()+" is a leap year");
        }
        else
        {
			System.out.print(localDate2.getYear()+" is not a leap year");
        }		
	}

}
