package common;

public class RotateTillMyString {

	public static void main(String[] args) {
		String str = "e JAVA i lik";
		int length = str.length()-1;
		while (!str.trim().equals("i like JAVA")) {
			str = str.charAt(length) + str.substring(0, length);
			System.out.println(str);
		}	
	}
}
