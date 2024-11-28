package com.cg.predicates;

import java.util.function.Predicate;

public class TestPredicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> P=str->{String sb= new StringBuilder(str).reverse().toString();
		//String str1=sb.reverse().toString();
		return (str.equals(sb)); 
		};
		String res="madam";
		System.out.println(P.test(res));

	}

}
