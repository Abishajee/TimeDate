package javadatebooking;
import java.sql.Date;
public class JavasqlDateExample {
	public static void main(String args[])
	{
		long milli=System.currentTimeMillis();
		java.sql.Date date1=new java.sql.Date(milli);
		System.out.println(date1);
		String str="2015-03-31";
		Date date2=Date.valueOf(str);//converting string into sql data.
		System.out.println(date2);
	}

}
