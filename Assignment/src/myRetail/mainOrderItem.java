package myRetail;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mainOrderItem {
	HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyItem mi=new MyItem(111,"Lape",90000);
		if(isInventoryEmpty()) {
			hm.put(01, mi);
			hm.put(02, mi);
			hm.put(03, mi);
		}
		else {
			AddorUpdate(ItemId);
		}
		
		public int isInventoryEmpty() {
			if(hm.isEmpty()) {
				return 0;
			}
			else {
				return 1;
			}
		}
		
		public void AddorUpdate(int ItemId) {
			Set<Map.Entry<Integer,Integer>> sm= hm.entrySet();
			for(Map.Entry<Integer,Integer> i : sm) 
			{
				i.getKey();
				i.getValue();
			}
			if(getKey()==ItemId) {
				int qty=hm.getValue()+1;
				hm.put(ItemId,qty);
			}
		}
		

	}

}
