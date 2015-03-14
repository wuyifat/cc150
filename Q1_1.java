package cc150;

public class Q1_1 {

	public static void main(String[] args) {
		System.out.println(isUniqueChar2("la"));

	}
	
	public static boolean isUniqueChar2(String s) {
		boolean[] charSet = new boolean[256];
		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i);
			if (charSet[val]) return false;
			charSet[val] = true;
		}
		return true;
	}

}
