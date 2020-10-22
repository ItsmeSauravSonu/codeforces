package CodeforcesBeastModeOn;

import java.util.Scanner;

public class Wrong_subtraction {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		for(int i=0;i<k;i++) {
			if(n%10==0) {
				n=n/10;
			}
			else {
				n--;
			}

		}
		System.out.println(n);
	}

}
