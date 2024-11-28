package mock;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class errorLog {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ArrayList<ArrayList<String>> logs = new ArrayList<>();
 
		// Adding the first log entry
		ArrayList<String> log1 = new ArrayList<>();
		log1.add("01-01-2025");
		log1.add("14:00");
		log1.add("ERROR");
		log1.add("fail");
 
		// Adding the second log entry
		ArrayList<String> log2 = new ArrayList<>();
		log2.add("02-03-2024");
		log2.add("16:30");
		log2.add("ERROR");
		log2.add("pass");
 
		// Adding the third log entry
		ArrayList<String> log3 = new ArrayList<>();
		log3.add("03-03-2024");
		log3.add("16:30");
		log3.add("ERROR");
		log3.add("retry");
 
		// Adding the log entries to the logs list
		logs.add(log1);
		logs.add(log2);
		logs.add(log3);
 
		// Printing the logs
		System.out.println(logs);
 
		ArrayList<ArrayList<String>> errorLog = new ArrayList<ArrayList<String>>();
 
		for (ArrayList<String> s : logs) {
			String checkError = s.get(2);
			if (checkError.equals("ERROR") || checkError.equals("CRITICAL")) {
				errorLog.add(s);
			}
		}
 
		System.out.println(errorLog);
 
		Collections.sort(errorLog, new Comparator<ArrayList<String>>() {
 
			@Override
			public int compare(ArrayList<String> o1, ArrayList<String> o2) {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
				LocalDateTime dateTime1 = LocalDateTime.parse(o1.get(0) + " " + o1.get(1), formatter);
				LocalDateTime dateTime2 = LocalDateTime.parse(o2.get(0) + " " + o2.get(1), formatter);
				return dateTime1.compareTo(dateTime2);
			}
 
		});
 
		System.out.println(errorLog);
 
	}
 
}
