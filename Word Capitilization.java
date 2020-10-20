package CodeforcesBeastModeOn;

import java.util.Scanner;

public class Word_Capitilization {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String fl = str.substring(0,1);
		String rl = str.substring(1,str.length());
		fl=fl.toUpperCase();
		String str1 = rl.toLowerCase();
		
		str = fl+rl;
		System.out.println(str);
		
		

	}

}
