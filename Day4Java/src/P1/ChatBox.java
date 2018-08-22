package P1;

import java.util.Scanner;

public class ChatBox {
	public static void main(String[] args) {
		String[] arr = { "dog", "idiot", "fuck", "stupid", "shit", "shithead" };
		ChatBox ch = new ChatBox();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String chat = sc.nextLine();
		String[] chatArray = chat.split(" ");
		String abuse = "";
		for (int i = 0; i < chatArray.length; i++) {
			abuse = "";
			for (int j = 0; j < arr.length; j++) {

				if (chatArray[i].equalsIgnoreCase(arr[j])) {
					int len = chatArray[i].length();

					while (len != 0) {
						abuse += "#";
						len--;
					}
					chatArray[i] = abuse;
				}

			}
		}
		for (String word : chatArray) {
			System.out.print(word + " ");
		}
	}

}
