package CodeforcesBeastModeOn;

import java.util.Scanner;

public class Bitplusplus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = 0;
		String str1 = "X++";
		String str2 = "++X";
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			String s = scn.next();
			str[i] = s;
		}
		for (int i = 0; i < n; i++) {
			if (str[i].equals(str1) || str[i].equals(str2)) {
				x++;
			} else {
				x--;
			}
		}
		System.out.println(x);
	}

}
