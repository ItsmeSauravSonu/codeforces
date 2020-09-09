import java.util.Scanner;
 
public class team {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0, counter = 0;
		while (n-- > 0) {
			int[] arr = new int[3];
 
			for (int i = 0; i < 3; i++) {
				arr[i] = scn.nextInt();
			}
			sum = 0;
			for (int i = 0; i < 3; i++) {
				if (arr[i] == 1) {
					sum++;
				}
			}
			if (sum >= 2) {
				counter++;
			}
		}
		System.out.println(counter);
 
	}
}
