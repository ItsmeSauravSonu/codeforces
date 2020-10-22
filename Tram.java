

import java.util.Scanner;

public class Tram {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int capacity=0;
	int present =0;
	int a[]=new int [1000]   ;
	int b[]= new int [1000];
	for(int i=0;i<n;i++) {
		a[i] = scn.nextInt();
		b[i] = scn.nextInt();
		present -=a[i];
		present +=b[i];
		capacity = max(capacity,present);
	}
	System.out.println(capacity);
	}

	private static int max(int capacity, int present) {
		
		if(capacity>present) {
			return capacity;
		}
		else {
			return present;
		}
		
	}

}
