package Q1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Employee {
	private int EmpId;
	private String empName;
	private int empAge;

	static String[][] arr = new String[10][3];

	static {
		try {
			File f = new File("C:\\Users\\vipin.sahu\\Desktop\\vipin sahu\\Assignment4\\src\\Q1\\Employee.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			int i = 0;

			while ((line = br.readLine()) != null) {
				arr[i] = line.split(",");
				System.out.println(arr[i][1]);
				i++;
			}
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) throws IOException {
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id:");
		String id = sc.nextLine();

		System.out.println("Enter name:");
		String name = sc.nextLine();
		System.out.println("Enter age:");
		String age = sc.nextLine();

		e.writeFile(id, name, age);
	}

	public void writeFile(String id, String name, String age) throws IOException {
		File f = new File("C:\\Users\\vipin.sahu\\Desktop\\vipin sahu\\Assignment4\\src\\Q1\\Employee.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);

		for (int i = 0; i < arr.length; i++) {

			if (id.equals(arr[i][1])) {
				for (int j = 0; j < 3; j++) {
					arr[i][0] = name;
					arr[i][2] = age;
					System.out.println(arr[i][j]);
				}
				break;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i][0]!=null){
			for (int j = 0; j < 3; j++) {
				bw.write(arr[i][j] + ",");
			}
			bw.write("\n");
			}
		}
		bw.close();
		System.out.println("Data updated");
	}

}
