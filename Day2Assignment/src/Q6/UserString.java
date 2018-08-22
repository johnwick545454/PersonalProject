package Q6;

public class UserString {
	private char firstString[] = new char[20];
	private char secondString[] = new char[20];
	String fString;
	String sString;
	public UserString(char[] firstString, char[] secondString) {
		super();
		this.firstString = firstString;
		this.secondString = secondString;
		fString=String.valueOf(firstString);
		sString=String.valueOf(secondString);
	}
	
	
	void reverseString(){
		StringBuilder f=new StringBuilder(fString);
		StringBuilder bb=f.reverse();
		System.out.println(bb.toString());
		StringBuilder s=new StringBuilder(sString);
		StringBuilder ss=f.reverse();
		System.out.println(ss.toString());
		
	
	}
	void copyString(){
		String temp;
		
	}
	void concatString(){
		System.out.println(fString.concat(sString));
	}
	void count(){
		int len1=firstString.length;
		int len2=secondString.length;
		System.out.println("First string length:"+len1+"\n Second string length:"+len2);
	}
	
}
