package javadatetime;
import java.time.*;
import java.time.chrono.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
public class JavaYear {
	public static void main(String agrs[])
	{
	Year y=Year.now();
	System.out.println(y);
	Year y1=Year.of(2020);
	LocalDate ld=y1.atDay(100);
	System.out.println(ld);
	System.out.println(y1.length());
	System.out.println(y1.isLeap());
	YearMonth ym=YearMonth.now();
	System.out.println(ym);
	String s=ym.format(DateTimeFormatter.ofPattern("MM yyyy"));
	System.out.println(s);
	long l1=ym.getLong(ChronoField.YEAR);
	System.out.println(l1);
	long l2=ym.getLong(ChronoField.MONTH_OF_YEAR);
	System.out.println(l2);
	YearMonth ym2=ym.plus(Period.ofYears(2));
	System.out.println(ym2);
	YearMonth ym3=ym.minus(Period.ofYears(2));
	System.out.println(ym3);
	}

}
