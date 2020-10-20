package CodeforcesBeastModeOn;

import java.util.*;

public class Soldier_and_Bananas {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int k = scn.nextInt();
		int n = scn.nextInt();
		int w = scn.nextInt();
		long sum = 0;

//		System.out.println(((w*k/2)*(w+1))-n);
//		System.out.println((((w*k)/2)*(w+1))-n);

		for (int i = 1; i <= w; i++) {
			sum = sum + (i * k);
		}
		if (sum <= n) {
			System.out.println(0);
		} else {
			System.out.println(sum - n);
		}
	}

}
