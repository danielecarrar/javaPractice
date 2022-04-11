package interfaces;

import java.util.Collections;
import java.util.LinkedList;

public class Storefront {
	
	private final LinkedList catalog = new LinkedList();

	public void addItem(String id, String name, String price, String quant, boolean noDiscount) {
		Item it = new Item(id, name, price, quant, noDiscount);
		catalog.add(it);
	}

	public Item getItem(int i) {
		return (Item) catalog.get(i);
	}

	public int getSize() {
		return catalog.size();
	}

	public void sort() {
		Collections.sort(catalog);
	}
}