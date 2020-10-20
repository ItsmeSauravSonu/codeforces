package CodeforcesBeastModeOn;
import java.util.*;
public class Boy_or_Girl {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		Set<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();++i) {
			set.add(s.charAt(i));
		}
//		System.out.println(set.size());
				if(set.size()%2==0)	{
					System.out.println("CHAT WITH HER!");
				}
				else {
					System.out.println("IGNORE HIM!");
				}
		
		

	}

}
