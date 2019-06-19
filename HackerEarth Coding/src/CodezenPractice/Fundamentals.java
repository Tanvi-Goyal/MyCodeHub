package CodezenPractice;

import java.util.ArrayList;

public class Fundamentals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		findCharacterCase('A');
//		numberPattern2(4);
//		generate(5);
//		starPattern(4);
//		triangleOfNumbers(4);
//		rootsQuadratic(1, 4, 2);
//		sumEvenOdd(1234);
//		numberPattern3(5);
//		numberPattern4(5);
//		numberPattern5(5);
//		prime(5);
//		nthfibonnaci(4);
//		trailingZeroes(500);
//		arrowPattern(14);
//		numberPattern(3);
//		isFibonacci(12);
//		termsOfAP(10);
//		squareRoot(18);
//		reverseNumber(1234565);
		decToBin(124);
//		binToDec(110010100);
//		numberPattern6(5);
//		zeroesAndStars(6);
		checkArmstrong(37);
		
	}

	private static void findCharacterCase(char c) {
		// TODO Auto-generated method stub
		
		if(c>=65 && c<=90) {
			System.out.println(1);
		} else if(c>=97 && c<=122) {
			System.out.println(0);
		} else System.out.println(-1);
		
	}
	
	private static void sumEvenTillN(int n) {
		
		int sum =0;
		for(int i =1;i<=n;i++) {
			if(i%2==0) sum+=i;
		}
		
		System.out.println(sum);
	}
	
//	1
//	23
//	345
//	4567
//	n = no of rows
	private static void numberPattern1(int n) {
	
		int row =1; int i =1;
		while(row<=n) {
			int s= 1;
			while(s<=row) {
				System.out.print(i);
				i++;
				++s;
			}
			i = row+1;
			row++;
			System.out.println();
		}
	}
	
//    1
//   23
//  345
// 4567
//	n = no of rows
	private static void numberPattern2(int n) {
		
		int row =1, i =1;
		while(row<=n) {
			int s1 =1;
			while(s1<=n-row) {
				System.out.print(" ");
				s1++;
			}
			int s2 = 1;
			while(s2<=row) {
				System.out.print(i);
				i++;
				s2++;
			}
			i = row+1;
			row++;
			System.out.println();
		}
	}
	
//	   *
//	  ***
//	 *****
//	*******
// n = no of rows
	private static void starPattern(int n) {
		
		int row =1;
		while(row<=n) {
			
			int r1 = 1;
			while(r1<n-row+1) {
				System.out.print(" ");
				r1++;
			}
			
			int r2 = 1;
			while(r2<=(2*row) -1) {
				System.out.print("*");
				r2++;
			}
			
			System.out.println();
			row++;
		}	
		
	}

//	    1
//	   232
//	  34543
//	 4567654

	public static void triangleOfNumbers(int n) {
		
		int row = 1;
		while(row<=n) {
			int s1=1;
			while(s1<n-row+1) {
				System.out.print(" ");
				s1++;
			}
			int r1= row;
			int r2 = 1;
			while(r2<= row) {
				System.out.print(r1);
				r1++;
				r2++;
			}
			
			int t1 = 2;
			int t2 = r1-2;
			while(t1<=row) {
				System.out.print(t2);
				t1++;
				t2--;
			}
			row++;
			System.out.println();
		}
	}
	
	public static void rootsQuadratic(int a, int b,int c) {
		
		double x1,x2;
		int d = b*b -(4*a*c);
		if(d<0) {
			System.out.println("-1");
		}else if( d==0) {
			x1 = -b/2.0*a;
			System.out.println(Math.round(x1) + "   " + Math.round(x1));
			
		}else {
			x1 = (-b+ Math.sqrt(d))/2.0*a;
			x2 = (-b- Math.sqrt(d))/2.0*a;
			System.out.println(Math.round(x1) + "  " + Math.round(x2));
		}
	}
	
	public static void sumEvenOdd(int n) {
		
		int evenSum =0;
		int oddSum=0;
		while(n!=0) {
			
			int rem = n%10;
			if(rem%2 == 0) evenSum+=rem;
			else oddSum+=rem;
			n = n/10;
		}
		
		System.out.println(evenSum + "  " + oddSum);
	}
	
	public static void numberPattern3(int n) {
		
		int row = 1;
		while(row<=n) {
			int s = 1;
			while(s<=row) {
				System.out.print("1");
				s++;
			}
			row++;
			System.out.println();
		}
	}
	
	public static void numberPattern4(int n) {
		int row =1;
		while(row<=n) {
			
			if(row == 1) System.out.print("1");
			else {
				System.out.print(row-1);
				int s =1;
				while(s<row-1) {
					System.out.print("0");
					s++;
				}
				System.out.print(row-1);
				
			}
			row++;
			System.out.println();
		}
	}
	
	public static void numberPattern5(int n) {
		
		int row =1;
		int m = n;
		while(row<=n) {
			
			for(int i=1;i<=m;i++) {
				System.out.print(i);
			}
			m--;
			row++;
			System.out.println();
		}
	}
	
	public static void prime(int n) {
		
		for(int i =1;i<=n;i++) {
			int j;
			for( j =2;j<i;j++) {
				if(i%j==0) break;
				
			}
			if(i==j) System.out.println(i);
		}
	}
	
	public static void nthfibonnaci(int n) {
		
		int first =1;
		int second = 1;
		int next = first+second;
		int count =3;
		
		while(count!=n) {
			first = second;
			second = next;
			next = first+second;
			count++;
		}
		
		System.out.println(next);
	}
	
	public static void trailingZeroes(int n) {
		int s =0;
		int i = 5;
		while(i<=n) {
			s+=n/i;
			i*=5;
		}
		System.out.println(s);
	}
	
	public static void arrowPattern(int n) {
		
		int t = (n+1)/2;
		int row =1;
		while(row<=t) {
			
			int s1 = 1;
			while(s1<row) {
				System.out.print(" ");
				s1++;
			}
			
			int s2 = 1;
			while(s2<=row) {
				System.out.print("* ");
				s2++;
			}
			
			row++;
			System.out.println();
		}
		
		int row1= n-t;
		while(row1>=1) {
			
			int s1 = 1;
			while(s1<row1) {
				System.out.print(" ");
				s1++;
			}
			
			int s2 =1;
			while(s2<=row1) {
				System.out.print("* ");
				s2++;
			}
			row1--;
			System.out.println();
		}
		
	}
	
	public static void numberPattern(int n) {
		
		int row =1;
		while(row<=n) {
			
			int i =1; int t= n-row+1;
			while(i<row) {
				System.out.print(t);
				i++;
				t++;
			}
			
			int s = n-row+1;
			int j =1;
			while(j<=s) {
				System.out.print(n);
				j++;
			}
			
			row++;
			System.out.println();
		}
		
	}
	
	public static void isFibonacci(int n) {
		
		if(isPerfectSquare(5*n*n-4) || isPerfectSquare(5*n*n +4)) {
			System.out.println(n + " is a fibonacci number");
		} else {
			System.out.println(n + " is not a fibonacci number");
		}
	}

	private static boolean isPerfectSquare(int i) {

		int t = (int) Math.sqrt(i);
		return (t*t == i);
	}
	
	public static void termsOfAP(int x) {
		
		int count = 0;
		
		for(int i =1;;i++) {
			
			int c = 3*i+2;
			if(c%4!=0) {
				System.out.print(c+" ");
				count++;
			}
			
			if(count>x-1) {
				break;
			}
		}
	}
	
	public static void squareRoot(int n) {
		
		int i=1; int result = 1;
		
		if(n ==0 || n==1) System.out.println(n);
		while(result<=n) {
			i++;
			result = i*i;
		}
		
		System.out.println(i-1);
		
	}
	
	public static void reverseNumber(long n) {
		long rev = 0;
		while(n!=0) {
			
			int rem = (int) (n%10);
			rev = rev*10+rem;
			n = n/10;
			
		}
		
		System.out.println(rev);
		
	}
	
	public static void decToBin(int n) {
		
		int count = 0;
		int c =0;
		long res = 0;
		while(n>0) {
			c = n%2;
			n = n/2;
			res = res + (long)( Math.pow(10, count))*c;
			count++;
		}
		
		System.out.println(res);
	}
	
	public static void binToDec(int n) {
		
		int p =0;
		int decimal = 0;
		while(true) {
			if(n ==0) break;
			else {
				int c = n%10;
				decimal+=Math.pow(2,p)*c;
				p++;
				n=n/10;	
			}
			
		}
		
		System.out.println(decimal);
	}
	
	public static void numberPattern6(int n) {
		
		int row =1;
		while(row<=n) {
			
			for(int i = n;i>=1;i--) {
				if(i==row) System.out.print("*");
				else System.out.print(i);
			}
			
			row++;
			System.out.println();
		}
	}
	
	public static void zeroesAndStars(int n) {
		
		int row =1;
		int start =0;
		int end =2*n;
		while(row<=n) {
			
			for(int i=0;i<2*n+1;i++) {
				
				if(i==start || i== end || i==n) {
					System.out.print("*");
				}else {
					System.out.print(0);
				}
			}
			start++;
			end--;
			row++;
			System.out.println();
		}
	}
	
	public static void checkArmstrong(long n) {
		
		long m = n;
		long number= n;
		int count = 0;
		int sum = 0;
		while(n!=0) {
			count++;
			n/=10;
		}
		
		while(m!=0) {
			
			int rem = (int) (m%10);
			sum+= Math.pow(rem, count);
			m/=10;
		}
		
		if(number == sum) System.out.println("It is an Armstrong Number");
		else System.out.println("It is not an Armstrong Number");
		
		
	}
}
