import java.util.*;
 
 // Compiler version JDK 11.0.2
 
 public class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String s = scn.next();
    int l=0,r=0;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='L') l++;
      else r++;
    }
    System.out.println(l+r+1);
   }
 }
