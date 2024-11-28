package com.cg.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.naming.InvalidNameException;

public class TestRegex {
	 boolean isValidPhoneNumber(String phone) {
        String regex = "^\\D{10}$";
        return Pattern.matches(regex, phone);
    }
	 
	 boolean testChar() {
		 //checking for one character only
		 return Pattern.matches("[amn]*", "aaa");
				 		
	 }
	 // presents for digits= //d
	 
	 //checking for digits
	 boolean digit(String phone) {
	        String regex = "^\\d[0-9]+$";
	        return Pattern.matches(regex, phone);
	    }
	 boolean digitcheck(String phone) {
		 //+ = preceding character
	        String regex = "^[a-zA-Z 0-9]{6}";
	        return Pattern.matches(regex, phone);
	    }
	 boolean rest(String phone) {
		 //+ = preceding character
	        String regex = "[789]{1}\\d{9}";
	        return Pattern.matches(regex, phone);
	    }
	 
	 boolean isValidateSSN(String phone) {
		 //+ = preceding character
	        String regex = "^\\d{3}-\\d{2}-\\d{4}";
	        return Pattern.matches(regex, phone);
	    }
	 
	 boolean adhar(String ad) {
		 String regex = "^\\d{4}\\s\\d{4}\\s\\d{4}";
		 return Pattern.matches(regex, ad);
	 }
	 
	 
	 boolean ipAddress(String ip) {
		 String reg1="^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$ ";
		 return Pattern.matches(reg1, ip);
	 }
	  
	 boolean password(String pass) {
		 
		 //1 letter 1 digit no special character length 8 or more than8 
		 String reg="[a-zA-Z 0-9]{8,}";
		 return Pattern.matches(reg, pass);
	 }
	 
	 public List<String> wordsEndingWith(String str, String string) {
	        String regex = "\\b\\w*" + string + "\\b";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(str);
	        List<String> words = new ArrayList<>();
	        while (matcher.find()) {
	            words.add(matcher.group());
	        }
	        return words;
	 }
	 
	 /*que:1. username : 5-10 letter, can container letter or digit , include special character.  
	 Password:  one upper. one letter and one digit total 8 characters or more . 
	 validate mail adress
	 Check for validity otherwise raise exception*/
	 	public void ValidUser(String user) throws InvalidNameException{
	 		
	 		String reg="^(?=.*[!@#$%^&*])[a-zA-z 0-9!@#$%^&*]{5,10}";
		 		if(Pattern.matches(reg, user)) {
		 			System.out.println("username : "+user);
		 		}else {
		 			throw new InvalidNameException();
		 		}
	 		
	 	}
	 
	 	
	 	public void ValidPassword(String pass) {
	 		
		 		String reg="[a-zA-z 0-9]{8,}";
		 		if(Pattern.matches(reg, pass)) {
		 			System.out.println("Password : "+pass);
		 		}else {
		 			System.out.println("invalid password");
		 		}
	 	}
	 
	 	public void Email(String mail) {
	 		String reg="[a-zA-Z0-9.@.[a-z]{2-4}]+$"; //simple logic
	 		//String reg="^[\\w-\\.]+@[\\w-]+\\.[a-z]{2,4}$";
	 		if(Pattern.matches(reg, mail)) {
	 			System.out.println("email  : "+mail);
	 		}
	 	}
	 	
	 	public void checkConsonants(CharSequence c) {
	 		String reg="[aeiouAEIOU]$";
	 		if(Pattern.matches(reg, c)){
	 			System.out.println("Its a vowel : " +c);
	 		}else {
	 			System.out.println("consonant : " +c);
	 		}
	 		
	 	}
	 	
	 	
	 	public void countVowels(String seq) {
	 		String reg="[aeiouAEIOU]";
	 		int temp=0;
	 		for(int i=0;i<seq.length();i++) 
		 	{
	 			char currentChar= seq.charAt(i);
	 			if(Pattern.matches(reg, String.valueOf(currentChar))){
	 				System.out.println("vowel : "+currentChar);
	 				temp++;
	 			}
	 			
		 	}
	 		System.out.println("total number of vowels : "+temp);	
		 	}
	 		
	 		
	 	
	public static void main(String args[]) {
		// 10= number of digits
		//$= last digit
		
		TestRegex tr= new TestRegex();
		System.out.println("Is Phone number matches : "+tr.isValidPhoneNumber("8888007113"));
		System.out.println("matches pattern : "+tr.testChar());
		System.out.println("check digit : "+ tr.digit("457"));
		System.out.println("check characters : "+ tr.digitcheck("capgi$2"));
		System.out.println("ip address : "+tr.ipAddress("232.211.196.166"));
		System.out.println("start with 789 : "+tr.rest("7890987368"));
		System.out.println("ssn number : "+tr.isValidateSSN("888-87-8888"));
		System.out.println("Adhar number : "+tr.adhar("8315 0602 6537"));
		System.out.println("Password Matches : "+tr.password("ShrutiArti17"));
		System.out.println("wordsEndingWith : "+tr.wordsEndingWith("The full moon is shining in the sky.", "in"));
		try {
			tr.ValidUser("Arti@swami");
		} catch (InvalidNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tr.ValidPassword("Swami2701");
		tr.Email("aarti.swami3118@gmail.com");
		tr.checkConsonants("a");
		tr.countVowels("Aarti");
		
		
	}

}
