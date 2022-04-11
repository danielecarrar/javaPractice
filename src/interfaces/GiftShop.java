package interfaces;

public class GiftShop {

	public static void main(String[] arguments) {

		Storefront store = new Storefront();
		store.addItem("C01", "MUG", "9.99", "150", true);
		store.addItem("C02", "LG MUG", "12.99", "82", false);
		store.addItem("C03", "MOUSEPAD", "10.49", "800", true);
		store.addItem("D01", "T SHIRT", "16.99", "90", true);
		store.sort();

		for (int i = 0; i < store.getSize(); i++) {
			Item show = (Item) store.getItem(i);
			System.out.println(
					"Item ID: " + show.getId() + "\nName: " + show.getName() + "\nQuantity: " + show.getQuantity()
							+ "\nPrice: $" + show.getPrice(show.isNoDiscount()) + "\nRetail Price: $" + show.getRetail()+"\n");
		}
	}
}
