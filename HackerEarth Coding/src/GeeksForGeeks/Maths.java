package GeeksForGeeks;

import java.util.Scanner;

public class Maths {

	public static void main (String[] args) {
		//code
		
//		Scanner s = new Scanner(System.in);
//		int T = s.nextInt();
////		System.out.println(Math.pow((87/84),2));
//		
//		for(int i=0;i<T;i++){
//		    int a = s.nextInt();
//		    int b = s.nextInt();
//		    int k = s.nextInt();
//		    
//		    System.out.println(kthDigit(a,b,k));
//		}
		
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		
		for(int i=0;i<T;i++) {
		    int n = s.nextInt();
		    int[] arr = new int[n];
		    
		    for(int j=0;j<n-2;j++) {
		        arr[j] = s.nextInt();
		    }
		    
		    int sum = (n*(n+1))/2;
		    
		    System.out.println(computeMissing(arr,sum));
		}
	}
	
	static int computeMissing(int[] arr, int sum) {
	    
	    for(int i=arr.length-2;i>=0;i--) {
	        sum = sum-arr[i];
	    }
	    
	    return sum;
	}
	
	static int calcPermutation(int n , int r) {
	    return fact(n)/fact(n-r);
	}
	
	static int fact(int n) {
	    if(n==0|| n==1) return 1;
	    return n*fact(n-1);
	}

	static long kthDigit(int a, int b, int k) {
		long n = 1;
        for (int i = 1; i <= b; i++) {
            n = n * a;
        }
    
    long count=0;
    while(n>0) {
        count++;
        long rem =  n%10;
        if(count == k) return rem;
        n=n/10; 
    }
    
    return count;
	}
}
