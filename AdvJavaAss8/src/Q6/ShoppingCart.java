package Q6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ShoppingCart {
	static ArrayList<Item> systemCart = new ArrayList<>();
	ArrayList<Item> userCart = new ArrayList<>();
	static Double price = 0.0;
	static {
		systemCart.add(new Item(101, 1000, "saree"));
		systemCart.add(new Item(102, 1500, "Trousers"));
		systemCart.add(new Item(103, 1300, "Shirts"));
		systemCart.add(new Item(104, 1400, "Jacket"));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShoppingCart cart = new ShoppingCart();
		while (true) {
			System.out.println("Enter Choice");
			System.out.println("1: Add item to cart");
			System.out.println("2: Remove item to cart");
			System.out.println("3: Show Cart");
			System.out.println("4: Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Product id:");
				int id = sc.nextInt();
				addItem(id, cart);
				break;
			case 2:
				System.out.println("Enter Product id:");
				int iddel = sc.nextInt();
				removeItem(iddel, cart);
				break;
			case 3:
				showCart(cart);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
			}
		}

	}

	public static void addItem(int id, ShoppingCart cart) {

		for (int i = 0; i < systemCart.size(); i++) {
			if (id == systemCart.get(i).getItemId()) {
				cart.userCart.add(ShoppingCart.systemCart.get(i));
				price += systemCart.get(i).getItemPrice();
			}

		}
		System.out.println("Total cart price:" + price);
	}

	public static void removeItem(int id, ShoppingCart cart) {
		Iterator<Item> itr=cart.userCart.iterator();
		//for (int i = 0; i < cart.userCart.size(); i++) {
			while(itr.hasNext()){
			//if (id == cart.userCart.get(i).getItemId()) {
				if(id==itr.next().getItemId()){
				itr.remove();
			}
		}
	}

	public static void showCart(ShoppingCart cart) {
		Collections.sort(cart.userCart,new CompareId());
		System.out.println(cart.userCart);
		price=0.0;
		for (Item item : cart.userCart) {
			price +=item.getItemPrice();
		}
		System.out.println("Total cart value: "+price);
	}

}
