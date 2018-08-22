package p2.ser1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass {

	public static void main(String[] args) {
		Laptop laptop = new Laptop(2000,"Dell");
		String path = "Laptop.txt";
		
		MainClass obj = new MainClass();
		try {
			//obj.saveLaptop(laptop, path);
			obj.readLaptop(path);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//end main
	
	public void saveLaptop(Laptop laptop,String path)throws Exception
	{
		FileOutputStream fos = new FileOutputStream(new File(path));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(laptop);

		System.out.println("Done ...");
	}
	
	public void readLaptop(String path)throws Exception
	{
		FileInputStream fis = new FileInputStream(new File(path));
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Laptop laptop = (Laptop)ois.readObject();
		System.out.println(laptop);
	}
}//end class












