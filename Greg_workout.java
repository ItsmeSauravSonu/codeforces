package codeforcescode;

import java.util.Scanner;

public class Greg_workout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       
       int a=0,b=0,c=0;
       for(int i=1;i<=n;i++) {
    	   int s = scn.nextInt();
    	   if(i%3==1) {
    		   a+=s;
    	   }
    	   else if(i%3==2) {
    		   b+=s;
    	   }
    	   else {
    		   c+=s;
    	   }
       }
       if(a>b &&a>c) {
    	   System.out.println("chest");
       }
       else if(b>a && b>c) {
    	   System.out.println("biceps");
       }
       else {
    	   System.out.println("back");
       }
      
       
	}

}
