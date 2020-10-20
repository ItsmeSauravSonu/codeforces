package CodeforcesBeastModeOn;
import java.util.*;
public class Helpful_Maths {

	public static void main(String[] args) {
	  Scanner scn = new Scanner(System.in);
	  String s = scn.next();
      char ch[] =s.toCharArray();
//      Arrays.sort(ch);
//      String s2 = new String(ch);
//      System.out.println(s2);
      char temp ='\0';
    for(int i=0;i<s.length()-2;i++) {
    	for(int j=i+2;j<s.length();j++) {
    		if(j%2==0) {
    			if((int)ch[i]>(int)ch[j]) {
    				temp = ch[i];
    				ch[i]=ch[j];
    				ch[j]=temp;
    			}
    		}
    	}
    }
    String str = new String(ch);
    System.out.println(str);
    
	}

}
