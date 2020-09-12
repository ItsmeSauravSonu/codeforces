import java.util.*;
 
 // Compiler version JDK 11.0.2
 
 public class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while(t-->0){
      int [] a = new int[4];
      for(int i=0;i<4;i++){
        a[i] = scn.nextInt();
      }
      int s = a[1] -a[0];
      int k = a[2]+a[3];
      if(s%k==0) System.out.println(s/k);
      else System.out.println(-1);
    }
    
   }
 }
