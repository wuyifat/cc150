package cc150;
import java.util.Arrays;

public class Atest {
	
	public static void main(String[] args) {
		String s = "cba";
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		String s1 = new String(chars);
		System.out.println(s1);
	}

}
