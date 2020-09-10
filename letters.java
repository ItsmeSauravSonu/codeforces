import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Anton {
 public static void main(String[] args){
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String str="";
  try{
    str = br.readLine();
    }
  catch(IOException e){
    System.out.print(e);
    }
  
  if(str.charAt(1)=='}'){
   System.out.println(0);
   return;
  }
  
  HashSet<Character> set = new HashSet<Character>();
  for(int i=1;i<=str.length()-1;i=i+3){
   set.add(str.charAt(i));
  }
  System.out.println(set.size());
 }
}
