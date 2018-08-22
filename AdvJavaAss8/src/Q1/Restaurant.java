package Q1;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1: Display Dishes ");
		System.out.println("2: search Dish");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			display();
			break;
		case 2:
			int id = sc.nextInt();
			search(id);
			break;
		default:
			System.out.println("invalid Input");
		}
	}

	public static void display() {
		System.out.println(Menu.menuList);
	}

	public static void search(int id) {
		for (int i = 0; i < Menu.menuList.size(); i++) {
			if (id == Menu.menuList.get(i).getDishId()) {
				System.out.println(Menu.menuList.get(i));
			}
		}
	}
}
