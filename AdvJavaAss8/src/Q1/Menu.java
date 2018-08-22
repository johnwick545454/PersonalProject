package Q1;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	static List<Dish> menuList=new ArrayList<>();
	static{
		menuList.add(new Dish(101,"paneer",30));
		menuList.add(new Dish(102,"poha",25));
	}
}
