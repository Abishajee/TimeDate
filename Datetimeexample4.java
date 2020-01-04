package date;
import java.time.LocalTime;
public class Datetimeexample4 {
	public static void main(String args[])
	{
		//Current time
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		
		//Specific Time
		LocalTime localTime2=LocalTime.of(4,30,45);
		System.out.println(localTime2);
		System.out.println("Hour : "+localTime.getHour());
		System.out.println("Minute : "+localTime.getMinute());
		System.out.println("Second : "+localTime.getSecond());
		
		//LocalTime plus method
		System.out.println("Addition of Hours : "+localTime.plusHours(2));
		System.out.println("Addition of Minutes : "+localTime.plusMinutes(30));
		System.out.println("Addition of Seconds : "+localTime.plusSeconds(20));
		System.out.println("Addition of Nanos : "+localTime.plusNanos(60000));

        //LocalTime's minus methods
		System.out.println("Subtraction of Hours : "+localTime.minusHours(2));
		System.out.println("Subtraction of Minutes : "+localTime.minusMinutes(2));
		System.out.println("Subtraction of Seconds : "+localTime.minusSeconds(2));
		System.out.println("Subtraction of Nanos : "+localTime.minusNanos(2));
		
		LocalTime localTime3=LocalTime.of(11,45,20);
		
		//CompareTo() example
		if(localTime.compareTo(localTime2)==0)
		{
			System.out.println("localDate1 and localDate2 are equel");
		}
		else
		{
			System.out.println("localDate1 and localDate2 are not equel");	
		}
		
		// isBefore() example
		if(localTime2.isBefore(localTime3))
		{
			System.out.println("localDate2 comes before localDate3");
		}
		
		// isAfter() example
		if(localTime2.isAfter(localTime))
		{
			System.out.println("localDate2 comes after localDate3");	
		}
		
		
	}

}
