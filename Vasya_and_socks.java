import java.util.*;

 // Compiler version JDK 11.0.2

 public class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int sum =( (n-1)/(m-1))+n;
    System.out.println(sum);
    
   }
 }
