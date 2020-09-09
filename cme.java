import java.util.*;

 // Compiler version JDK 11.0.2

 public class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    while(t-->0){
      int n = scn.nextInt();
      if(n==1 || n==2){
        System.out.println(2);
      }
      else if(n%2==1){
        System.out.println(1);
      }
      else{
        System.out.println(0);
      }
    }
   }
 }
