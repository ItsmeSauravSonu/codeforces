import java.util.*;
public class Non_Zero {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int t = scn.nextInt();
while(t-->0) {
	int n = scn.nextInt();
	int sum =0 ; int count =0; int ans =0;
	int [] a = new int[n];
	for(int i=0;i<n;i++) {
		a[i] = scn.nextInt();
		
		if(a[i]==0) count++;
		sum+=a[i];
	}
	if(count ==0) {
		if(sum==0) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
	else {
		ans=count;
		sum=sum+count;
		if(sum==0) {
			System.out.println(ans+1);
		}
		else {
			System.out.println(ans);
		}
	}
	
	
}
 
	}
 
}
