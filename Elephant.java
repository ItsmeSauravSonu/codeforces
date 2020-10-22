package CodeforcesBeastModeOn;

import java.util.Scanner;

public class Elephant {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int counter = 0;
		if (x < 5) {
			System.out.println(1);
		} else if (x > 5 && x % 5 != 0) {
			counter = (x / 5)+1;
			System.out.println(counter);
		}

		else {
			if (x % 5 == 0) {
				counter = x / 5;
				System.out.println(counter);
			}
		}

	}

}
