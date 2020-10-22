

import java.util.Scanner;

public class Nearly_Lucky_Number {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		int cnt =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='4' || s.charAt(i)=='7') {
				cnt++;
			}
		}
		if(cnt==4 || cnt==7) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	

	}

}
