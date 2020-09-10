import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = scn.nextInt();
    }
    if(n==1){
      System.out.println("YES");
    }
    else{
      int count=0;
      boolean flag = false;
      int i=0;
      for(i=0;i<n-1;i++){
        if(arr[i]<arr[i+1]){
          count++;
        }
        else{
          break;
        }
      }
      int j=0;
      for(j=i;j<n-1;j++){
        if(arr[j]==arr[j+1]) count++;
        else break;
      }
      for(i=j;i<n-1;i++){
        if(arr[i]>arr[i+1]) count++;
        else break;
      }
      if(count==n-1){
        System.out.println("YES");
      }
      else{
        System.out.println("NO");
      }
    }
    
   }
 }
