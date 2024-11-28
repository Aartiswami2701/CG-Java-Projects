package com.pro;

import java.util.Comparator;

public class namecomp implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
