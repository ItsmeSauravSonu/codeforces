

import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	String s = scn.next();
	int lowercase =0,uppercase=0;
	for(int i=0;i<s.length();i++) {
		if(Character.isLowerCase(s.charAt(i))) {
			lowercase++;
		}
		else if(Character.isUpperCase(s.charAt(i))) {
			uppercase++;
		}
	}
	if(uppercase>lowercase) {
		System.out.println(s.toUpperCase());
	}
	else {
		System.out.println(s.toLowerCase());
	}

	}

}
