package cc150;

public class Q1_5 {
	
	public static String replace(String s) {
		if (s.isEmpty()) return s;
		String[] sp = s.split("\\s+");
		String result = "";
		int i = 0;
		for (;i < sp.length - 1; i++)
			result = result + sp[i] + "%20";
		result = result + sp[i];
		return s;
	}

}
