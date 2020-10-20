package CodeforcesBeastModeOn;

import java.util.Scanner;

public class Bear_and_Big_Brother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int ans = 0;
		while (a <= b) {
			a = 3 * a;
			b = 2 * b;
			ans++;
		}
		System.out.println(ans);
	}

}
