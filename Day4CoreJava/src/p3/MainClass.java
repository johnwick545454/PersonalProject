package p3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class MainClass {

	public static void main(String[] args)throws Exception {
		Laptop[] lp=new Laptop[5];
		Camera[] cam=new Camera[5];
		cam[0]=new Camera(4);
		cam[1]=new Camera(5);
		cam[2]=new Camera(3);
		cam[3]=new Camera(15);
		cam[4]=new Camera(8);
		lp[0]=new Laptop("HP",25000,cam[0]);
		lp[1]=new Laptop("HP",40000,cam[1]);
		lp[2]=new Laptop("HP",50000,cam[2]);
		lp[3]=new Laptop("HP",60000,cam[3]);
		lp[4]=new Laptop("HP",60000,cam[4]);
		
		String path="Laptop1.txt";
		MainClass obj = new MainClass();
		
		obj.saveLaptop(lp, path);
		obj.readLaptop(path);
		
	}

	public void saveLaptop(Laptop[] laptops,String path)throws Exception
	{
		FileOutputStream fos = new FileOutputStream(new File(path));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(laptops);
		System.out.println("Done ...");
	}
	public void readLaptop(String  path)throws Exception
	{
		FileInputStream fis = new FileInputStream(new File(path));
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Laptop[] laptops = (Laptop[])ois.readObject();
		for (Laptop laptop : laptops) {
			//laptop.printData(laptop);
			System.out.println(laptop);
		}
		
	}
	
}
