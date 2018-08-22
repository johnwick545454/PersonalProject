package com.infogain.ProductMgmt;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
		Scanner sc=new Scanner(System.in);
		String dt=sc.nextLine();
		Date date1=sf.parse(dt);
		Product p=new Product(10,"conditioner",150,date1);
ProductManagement pm=new ProductManagement();
pm.add(p);
		//System.out.println(date1);
	}

}
