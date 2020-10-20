package CodeforcesBeastModeOn;

import java.util.Scanner;

public class Night_At_the_Museum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    String s = scn.next();
	    char [] ch = s.toCharArray();
	  int  flag =97;
	  int rotation =0,diff;
	  for(int i=0;i<s.length();i++) {
		  diff = Math.abs(flag-ch[i]);
		  if(diff>13) {
			  diff=26-diff;
		  }
		  rotation += diff;
		  flag =ch[i];
	  }
	  System.out.println(rotation);

	}

}
