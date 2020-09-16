import java.util.*;
 
 // Compiler version JDK 11.0.2
 
 public class Dcoder
 {
   public static void main(String args[])
   { 
   Scanner scn = new Scanner(System.in);
   int a = scn.nextInt();
   int b = scn.nextInt();
   int c = scn.nextInt();
   int d = scn.nextInt();
     
 
    
    
        if (a+b == c+d || a+c == b+d || a+d == b+c || a+b+c == d || a+c+d == b || a+b+d == c || b+c+d == a){
          System.out.println("YES");
        }
        else{
          System.out.println("NO");
        }
   }
 }
