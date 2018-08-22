package p1;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		
		try {
			String path = "c:\\python";
			File f = new File(path);
			
			File arr[] = f.listFiles();
			for (File file : arr) 
			{
				System.out.println(file);
				if(file.isDirectory())
				{
					File arr2[] = file.listFiles();
					for (File file2 : arr2) {
						System.out.println(" --- "+file2);
					}
				}
			
			}
			
			
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}



