package Q2;

import java.io.File;

public class FileDirectory {

	public static void main(String[] args) {

		Directory d1 = (String path) -> {
			File f1 = new File(path);
			String pth = f1.getParent();
			File f2 = new File(pth);

			for (String string : f2.list()) {
				if (string.contains(".java")) {
					System.out.println(string);
				}
			}
		};
		Directory d2 = new Directory() {

			@Override
			public void show(String path) {
				File f1 = new File(path);
				String pth = f1.getParent();
				File f2 = new File(pth);

				for (String string : f2.list()) {
					if (string.contains(".java")) {
						System.out.println(string);
					}
				}
			}
		};
		d1.show("C:\\Users\\vipin.sahu\\Desktop\\vipin sahu\\AdvJavaPart10Assignment\\src\\Q1\\Employee.java");
		d2.show("C:\\Users\\vipin.sahu\\Desktop\\vipin sahu\\AdvJavaPart10Assignment\\src\\Q2\\Employee.java");
	}

}
