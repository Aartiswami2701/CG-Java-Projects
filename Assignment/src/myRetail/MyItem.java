package myRetail;

public class MyItem {
	int ItemId;
	String ItemName;
	int price;
	public MyItem(int itemId, String itemName, int price) {
		super();
		ItemId = itemId;
		ItemName = itemName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "MyItem [ItemId=" + ItemId + ", ItemName=" + ItemName + ", price=" + price + "]";
	}
	
	
	
	

}
