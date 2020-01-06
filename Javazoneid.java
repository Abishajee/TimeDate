package javadatetime;
import java.util.Locale;
import java.time.*;
import java.time.format.TextStyle;
public class Javazoneid {
	public static void main(String args[])
	{
		ZoneId id=ZoneId.of("Asia/Kolkata");
		ZoneId id1=ZoneId.of("Asia/Tokyo");
		LocalTime tt=LocalTime.now(id);
		LocalTime tt1=LocalTime.now(id1);
		System.out.println(tt);
		System.out.println(tt1);
		System.out.println(tt.isBefore(tt1));
		ZoneId z=ZoneId.systemDefault();
		System.out.println(z);
		String s=z.getId();
		System.out.println(s);
		System.out.println(z.getDisplayName(TextStyle.FULL, Locale.ROOT));	}

}
