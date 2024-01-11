package test;

import java.sql.Date;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Test {
	public static void main(String[] args) {
		NumberFormat numf =  NumberFormat.getCurrencyInstance();
		Locale lc = new Locale("en"); 
		long t1 = System.currentTimeMillis();
		for (int i=0 ; i < 3 ; i++) {
			System.out.println("Test");
		}
		
		long t2 = System.currentTimeMillis();
		
		System.out.println("Truoc khi chay for "+t1);
		System.out.println("sau khi chay for "+t2);
		System.out.println("thoi gian chay for "+(t2-t1)/1000);
		
		double day = 1.3;
		System.out.println(TimeUnit.DAYS.toMinutes((long) day));
		//Date
		Date d = new Date(System.currentTimeMillis());
		System.out.println(d);
		
		//Calendar
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+(c.get(Calendar.YEAR)) );
		//date format
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
		System.out.println(df.format(d));
		
	}
}
