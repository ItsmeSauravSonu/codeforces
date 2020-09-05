import java.util.*;
 
public class MinutesBeforetheNewYear {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- > 0) {
			int h = scn.nextInt();
			int m = scn.nextInt();
 
			int res = 1440 - ((h * 60) + m);
			System.out.println(res);
		}
	}
 
}
