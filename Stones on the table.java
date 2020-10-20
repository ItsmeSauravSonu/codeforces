package CodeforcesBeastModeOn;

import java.util.Scanner;

public class Stones_On_the_Table {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans =0;
		String s = scn.next();
		char [] ch = s.toCharArray();
		if(s.length()==n) {
			for(int i=0;i<s.length()-1;i++) {
				if(ch[i]==ch[i+1]) {
					ans++;
				}
			}
			System.out.println(ans);
		}
	}

}
