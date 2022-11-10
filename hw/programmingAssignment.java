package hw;
import java.util.Scanner;

public class programmingAssignment {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);
		int x, y, arr[];
		System.out.println("Enter number of elements");
		x=input.nextInt();
		arr = new int[x];
		System.out.println("Please enter " +x+ " integers");
		int i;
		for (i = 0; i<x; i++) {
			arr[i]= input.nextInt();
			
		}
		System.out.println("Enter your values ");
		y = input.nextInt();
		int lo, mid, hi;
		lo = 0;
		hi = x-1;
		mid = (lo + hi)/2;
		
		while (lo <= hi ) {
			if(arr[mid]<y) {
				lo = mid+1;
			}
			else if(arr[mid]==y) {
				System.out.println(y + " found at location "+ (mid+1)+ ".");
				break;
				
			}
			else {
				hi = mid-1;
			}
			mid = (lo+hi)/2;
			
		}
		if (lo>hi) {
			System.out.println("return -1");
		}
		
		
		
		
	}

}
