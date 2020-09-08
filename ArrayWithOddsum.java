package Problemset;

import java.util.Scanner;


public class ArrayWithOddsum {

  public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
int t = scn.nextInt();
while(t-->0){
  int n = scn.nextInt();
  int even=0, odd=0;
  
  for(int i=0;i<n;i++){
    int a = scn.nextInt();
    if(a%2==0){
      even++;
    }
    else{
      odd++;
    }
  }
  if(odd%2!=0 || (odd!=0 && odd%2==0 && even!=0)){
    System.out.println("YES");
  }
  else{
    System.out.println("NO");
  }
  
}
  }

}
