package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class StoringAFile {

	public static void main(String[] args) {
		try
		{
			//new StoringAFile().createFile();
			new StoringAFile().readFile();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void createFile()throws Exception
	{
		File f = new File("MyNewFile.txt");
		FileWriter fw = new FileWriter(f,true);
		PrintWriter pw = new PrintWriter(fw);
		pw.write("Employee ID  "+101);
		pw.close();
		System.out.println("Done");
	}
	
	public void readFile()throws Exception
	{
		File f = new File("C:\\Users\\ashish.bansal\\Desktop\\BCT July 2018 Classroom\\Date.java");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		int i = 0;
		while((line = br.readLine())!=null)
		{
			System.out.println((++i)+""+line);
		}
		
	}
	
}



















