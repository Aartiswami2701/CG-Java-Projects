package com.cg.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of strings, partition the strings into two groups based on whether their
//length is greater than 3 using Stream API.
public class StringPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>l1= Arrays.asList("Aarti","cat","dogs","Bus","cat","yes");
        Map<Boolean, List<String>> l2=l1.stream()
				//.filter(x->x.length()>3)
				.collect(Collectors.partitioningBy(x->x.length()>3));
    	System.out.println(l2);
	}

}
