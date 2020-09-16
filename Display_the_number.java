import java.util.*;
 
 // Compiler version JDK 11.0.2
 
public class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner scn = new Scanner(System.in);
    int t=scn.nextInt();
    while(t-->0){
      int n = scn.nextInt();
      boolean flag = false;
      
        if(n%2==1){
          flag=true;
        }
        while(n>0){
          if(flag==true){
            System.out.print(7);
            n-=3;
            flag= false;
          }
          if(n>=2 &&n!=3 ){
            System.out.print(1);
            n-=2;
          }
        }
        System.out.println();
     
    }
   }
 }
