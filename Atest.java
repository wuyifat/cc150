package cc150;
import java.util.Arrays;

public class Atest {
	
	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		int val = 1;
		for (int i = 0; i < 5; i++)
			for (int j = 0; j < 5; j++) {
				matrix[i][j] = val;
				val++;
			}
		matrix[1][2] = 0;
		matrix[3][3] = 0;
		for (int i = 0; i < 5; i++)
			System.out.println(Arrays.toString(matrix[i]));
		
		System.out.println();
		System.out.println();
//		System.out.println(Arrays.deepToString(matrix));
		
		Q1_7 test = new Q1_7();
		test.setZero(matrix);
		for (int i = 0; i < 5; i++)
			System.out.println(Arrays.toString(matrix[i]));
	}

}
