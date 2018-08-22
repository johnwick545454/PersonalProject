package Q4;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MainClass {
	static Hashtable<String, Product> ht = new Hashtable<>();

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		while(true){
			System.out.println("1: Add Product");
			System.out.println("2: Remove Product");
			System.out.println("3: Display Product");
			int choice=Integer.parseInt(sc.nextLine());
			
			switch(choice){
			case 1:
				addProduct();
				break;
			case 2:
				removeProduct();
				break;
			case 3:
				display();
				break;
				default:
					System.out.println("wrong input");
			}
			
		}
		
		
	}
	public static void addProduct(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id");
		String id=sc.nextLine();
		System.out.println("Entre name");
		String name=sc.nextLine();
		
		ht.put(id,new Product(id,name));
	}
	
	public static void removeProduct(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product id");
		String id=sc.nextLine();
		
		if(ht.containsKey(id)){
			ht.remove(id);
		}else{
			System.out.println("Product not found");
		}
	}
	public static void display(){
		Set<String> set=ht.keySet();
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()){
		String key=itr.next();
		System.out.println(ht.get(key));
		}
	}

}
