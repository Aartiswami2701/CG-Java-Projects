package com.cg.DatesTime;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class TestDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date currentDate= new Date();
		System.out.println(currentDate);
		
		String dateString ="2024-10-10";
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		Date doj= sd.parse(dateString);
		System.out.println("Parsed Date "+doj);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE, MMMM dd, yyyy 'at' hh:mm:ss a");
        String formattedDate = sdf2.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);
        
       Calendar c= Calendar.getInstance();
        c.set(2024, Calendar.JANUARY, 30);
        
        
        SimpleDateFormat sd1=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(" "+sd1.format(c.getTime()));
        c.add(c.DAY_OF_MONTH, 30);
        System.out.println( "Date after adding 30 days: "+ sd1.format(c.getTime()));
        c.add(c.DAY_OF_MONTH, -10);
        System.out.println( "Date after removing 10 days: "+ sd1.format(c.getTime()));
        System.out.println(c.get(c.YEAR));
        System.out.println(c.get(c.MONTH));
     
		
	}

}
