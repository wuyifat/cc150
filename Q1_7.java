package cc150;

public class Q1_7 {
	
	public void setZero(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int[][] flag = new int[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0 && flag[i][j] == 0) {
					for (int ii = 0; ii < m; ii++) {
						matrix[ii][j] = 0;
						flag[ii][j] = 1;
					}
					for (int jj = 0; jj < n; jj++) {
						matrix[i][jj] = 0;
						flag[i][jj] = 1;
					}
				}
			}
	}

}
