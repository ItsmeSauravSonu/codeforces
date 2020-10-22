

import java.util.Scanner;

public class George_and_Accommodation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int [] p = new int [100];
		int [] q = new int [100];
        int ans =0;
		for(int i=0;i<n;i++) {
			p[i]= scn.nextInt();
			q[i]= scn.nextInt();
			if(q[i]-p[i]>=2) {
				ans++;
			}
		}
		System.out.println(ans);

	}

}
