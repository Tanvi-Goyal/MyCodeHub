/**
 * 
 */
package BasicFundamentals;

import java.util.*;

/**
 * @author tanvi
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		String str = s.nextLine();
		prime(s);
		isPalindrome(s);
		seatingArrangement(s);
		System.out.print(Anagram(s));

	}

	static void prime(Scanner s) {
		int number = s.nextInt(); // Reading input from STDIN
		for (int i = 2; i <= number; i++) {

			if (isPrime(i)) {
				System.out.print(i + " ");
			}

		}

	}

	static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}

		int upperLimit = (int)(Math.sqrt(n));
		for (int i = 2; i < upperLimit; i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}

	static int Anagram(Scanner s) {

		String first = s.nextLine();
		String second = s.nextLine();
		int count[] = new int[26];

		for (int j = 0; j < first.length(); j++) {
			count[first.charAt(j) - 'a']++;
		}

		for (int k = 0; k < second.length(); k++) {
			count[second.charAt(k) - 'a']--;

		}

		int number = 0;

		for (int m = 0; m < 26; m++) {
			number += Math.abs(count[m]);

		}

		return number;

	}

	static void isPalindrome(Scanner s) {

		String str = s.nextLine();
		String rev = new StringBuilder(str).reverse().toString();

		if (str.equals(rev))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	
	static void seatingArrangement(Scanner s) {
		   int ntestCases = s.nextInt();
	        int facingSeatNumber;
	        for(int i = 1 ; i<= ntestCases ; i++) {
	            	            
	            int number = s.nextInt();
	            int mod = number%12;
	            
	            switch(mod) {
	                
	             case 1:
	                    facingSeatNumber = (mod == 1 && number!= 1) ? (number+11) :12;
	                     System.out.println(facingSeatNumber +" "+ "WS");
	                     break;
	             case 6:
	                    facingSeatNumber = (mod == 6 && number!= 6) ? (number+1) :7;
	                     System.out.println(facingSeatNumber +" "+ "WS");
	                     break;
	             case 7:
	                    facingSeatNumber = (mod == 7 && number!= 7) ? (number-1) :6;
	                     System.out.println(facingSeatNumber +" "+ "WS");
	                     break;
	             case 0:
	                    facingSeatNumber = (mod == 0 && number!= 12) ? (number-11) :1;
	                     System.out.println(facingSeatNumber +" "+ "WS");
	                     break;
	             case 2:
	                    facingSeatNumber = (mod == 2 && number!= 2) ? (number+9) :11;
	                     System.out.println(facingSeatNumber +" "+ "MS");
	                     break;
	             case 5:
	                    facingSeatNumber = (mod == 5 && number!= 5) ? (number+3) :8;
	                     System.out.println(facingSeatNumber +" "+ "MS");
	                     break;
	             case 8:
	                    facingSeatNumber = (mod == 8 && number!= 8) ? (number-3) :5;
	                     System.out.println(facingSeatNumber +" "+ "MS");
	                     break;
	             case 11:
	                    facingSeatNumber = (mod == 11 && number!= 11) ? (number-9) :2;
	                     System.out.println(facingSeatNumber +" "+ "MS");
	                     break;
	             case 3:
	                    facingSeatNumber = (mod == 3 && number!= 3) ? (number+7) :10;
	                     System.out.println(facingSeatNumber +" "+ "AS");
	                     break;
	             case 4:
	                    facingSeatNumber = (mod == 4 && number!= 4) ? (number+5) :9;
	                     System.out.println(facingSeatNumber +" "+ "AS");
	                     break;
	             case 9:
	                    facingSeatNumber = (mod == 9 && number!= 9) ? (number-5) :4;
	                     System.out.println(facingSeatNumber +" "+ "AS");
	                     break;
	             case 10:
	                    facingSeatNumber = (mod == 10 && number!= 10) ? (number-7) :3;
	                     System.out.println(facingSeatNumber +" "+ "AS");
	                     break;
	            }
	        }
	}

}
