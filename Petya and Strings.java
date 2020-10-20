package CodeforcesBeastModeOn;
import java.util.*;
public class Petya_and_Strings {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
        String s1 = scn.next();
        String s2 = scn.next();
        
        String ss1 = s1.toLowerCase();
        String ss2 = s2.toLowerCase();
        
        if(ss1.compareTo(ss2)==0) {
        	System.out.println("0");
        }
        if(ss1.compareTo(ss2)>0) {
        	System.out.println("1");
        }
        if(ss1.compareTo(ss2)<0) {
        	System.out.println("-1");
        }


	}

}
