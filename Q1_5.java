package cc150;

public class Q1_5 {
	
	public static String replaceSpace(String s) {
		if (s.isEmpty()) return s;
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			String ch = s.substring(i, i+1);
			if (ch.equals(" "))
			    str += "%20";
			else
			    str += ch;

		}
		return str;
	}
}
