/*You are given an n x n 2D matrix representing an image. 
Rotate the image by 90 degrees(clockwise)
For example, given input matrix = [[1, 2, 3],
                                   [4, 5, 6]
                                   [7, 8, 9]],
rotate the input matrix in-place such that it becomes:
                                  [[7, 4, 1]
                                   [8, 5, 2]
                                   [9, 6, 3]]*/
import java.util.Arrays;
class Question5 {
	public static void main(String[] args) {
		int[][] test = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] rotatedMatrix = rotateImage(test);
		for (int i = 0; i < test.length; i++) {
			System.out.println(Arrays.toString(rotatedMatrix[i]));
		}
	}
	
	public static int[][] rotateImage(int[][] m) {
		int len = m.length - 1;
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len - i; j++) {
				int top = m[i][j];
				int right = m[j][len - i];
				int bottom = m[len - i][len - j];
				int left = m[len - j][i];
				
				m[j][len - i] = top;
				m[len - i][len - j] = right;
				m[len - j][i] = bottom;
				m[i][j] = left;
			}
		}
		return m;
	}
}