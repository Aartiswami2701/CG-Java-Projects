package com.pro;

import java.util.Comparator;


public class salarycomp implements Comparator<Product>{

	@Override
		// TODO Auto-generated method stub
		public int compare(Product o1, Product o2) {
			// TODO Auto-generated method stub
			
			if(o1.price==o2.price) {
				return 0;
			}
			else if(o1.price>o2.price) {
				return 1;
			}
			else {
				return -1;
			}
	}

}
