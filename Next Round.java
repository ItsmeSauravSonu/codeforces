package CodeforcesBeastModeOn;

import java.util.Scanner;

public class Next_Round {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int k = scn.nextInt();
int [] arr = new int[n];

for(int i=0;i<n;i++) {
	arr[i]=scn.nextInt();
}
int cnt =0;
 for(int j=0;j<k;j++) {
	 if(arr[j]>=arr[k]) {
		 cnt++;
	 }
 }
 System.out.println(cnt);
	}

}
