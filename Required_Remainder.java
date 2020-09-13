package codeforcescode;
import java.util.*;
public class Required_Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scn = new Scanner(System.in);
          int t = scn.nextInt();
          while(t-->0) {
        	  int x = scn.nextInt();
        	  int y = scn.nextInt();
        	  int n = scn.nextInt();
        	 if(n-n%x+y<=n) {
        		 System.out.println(n-n%x+y);
        	 }
        	 else {
        		 System.out.println(n-n%x-(x-y));
        	 }
        	  
          }
	}

}
