package CodeforcesBeastModeOn;

import java.util.Scanner;

public class Translation {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String s = scan.next();
String t = scan.next();
int i=0,j,cnt=0;
int sl = s.length();
int tl = t.length();

for(i=0,j=tl-1;i<sl && j>=0;i++,j--) {
	if(s.charAt(i)==t.charAt(j)) {
		cnt++;
	}
}
if(cnt==sl) {
	System.out.println("YES");
}
else {
	System.out.println("NO");
}





 

	}

}
