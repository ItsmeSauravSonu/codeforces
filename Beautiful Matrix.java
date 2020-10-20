package CodeforcesBeastModeOn;

import java.util.*;

public class Beautiful_Matrix {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = 0, b = 0, i, j, ans = 0;
		int[][] arr = new int[6][6];
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (arr[i][j] == 1) {
					a = i + 1;
					b = j + 1;
				}
			}
		}
		ans = Math.abs(a - 3) + Math.abs(b - 3);
		System.out.println(ans);
	}

}
