package javadatebooking;
import java.util.Calendar;
public class JavaClenderExample {
	public static void main(String args[])
	{
		Calendar cal=Calendar.getInstance();
		System.out.println("The current date is:"+cal.getTime());
		cal.add(Calendar.DATE, -15);
		System.out.println("15 days ago:"+cal.getTime());
		cal.add(cal.MONTH, 4);
		System.out.println("4 months later:"+cal.getTime());
		cal.add(Calendar.YEAR,2);
		System.out.println("2 years later:"+cal.getTime());
		System.out.println("At present Calendar's Year:"+cal.get(Calendar.YEAR));
		System.out.println("At present Calendar's Day:"+cal.get(Calendar.DATE));
		System.out.println("At presenT Date and Time Is"+cal.getTime());
		int maximum=cal.getMaximum(Calendar.DAY_OF_WEEK);
		System.out.println("Maximum number of days in a week:"+maximum);
		maximum=cal.getMaximum(Calendar.WEEK_OF_YEAR);
		System.out.println("Maximum number of weeks in a year:"+maximum);
		int minimum=cal.getMinimum(Calendar.DAY_OF_WEEK);
		System.out.println("Minimum number of weeks in a year:"+minimum);
		minimum=cal.getMinimum(Calendar.WEEK_OF_YEAR);
		System.out.println("Minimum number of weeks:"+minimum);	
	}
}