package cc150;

public class Q1_3 {
	
	public static String noDuplicate(String s) {
		if (s.length() < 2) return s;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					s = s.substring(0, j) + s.substring(j+1);
					j--;
				}
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
//		String s = 
		System.out.println(noDuplicate("abcda"));
	}

}
