package BasicFundamentals;
import java.util.*;

public class MathsProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
//		primesum(36);
		System.out.println(isPalindrome(1217));
		
}
	
	 public static ArrayList<Integer> primesum(int A) {
	        
	        ArrayList<Integer> arr = new ArrayList();
	         boolean isPrime[]=new boolean[A + 1]; 
	         System.out.println("isPrime list passed : " + isPrime.toString());
	        SieveOfEratosthenes(A, isPrime); 
	      
	        // Traversing all numbers to find first 
	        // pair 
	        for (int i = 0; i < A; i++) 
	        { 
	            if (isPrime[i] && isPrime[A - i]) 
	            { 
	                arr.add(i);
	                arr.add(A-i);
	                return arr; 
	            } 
	        }
	        
	        return arr;
	        
	    }
	    
	    static boolean SieveOfEratosthenes(int n, boolean isPrime[]) 
	    { 
	        
	        isPrime[0] = isPrime[1] = false; 
	        for (int i = 2; i <= n; i++) 
	            isPrime[i] = true; 
	         System.out.println("isPrime list now : " + isPrime.toString());

	        
	        for (int p = 2; p * p <= n; p++) 
	        { 
	        	System.out.println("P is: " + p);
	            if (isPrime[p] == true) 
	            { 
	               for (int i = p * 2; i <= n; i += p) {
	            	   System.out.println("I is: " + i);

	                    isPrime[i] = false;  
	               }
	   	        	
	  	         System.out.println("isPrime list then : " + isPrime.toString());

	            } 
	        } 
	        return false; 
	    } 
	    
	    public ArrayList<String> fizzBuzz(int A) {
	    	
	    	ArrayList<String> arr = new ArrayList<String>();
	    	
	    	for(int i =1;i<=A;i++) {
	    		if(i%5 == 0 && i%3==0) {
	    			arr.add("FizzBuzz");
	    		}else if(i%3 == 0) {
	                arr.add("Fizz");
	    		}else if(i%5 == 0) {
	                arr.add("Buzz");
	    		}else arr.add(Integer.toString(i));
	    	}
	    	return arr;
	    }

	    private static int isPower(int A) {
	    	if(A<2) return 0;
	    	
	    	for(int i =2 ;i*i<=A;i++) {
	    		if(A%i == 0) {
	    			for(int j =2;j<=32;j++) {
	    				if(Math.pow(i, j) == A) return 1;
	    			}
	    		}
	    	}
	    	
	    	return 0;
	    }
	    
	    private static int isPalindrome(int A) {
	    	
	    	int rev = 0;
	    	int rem;
	    	int orig = A;
	    	
	    	while(A!=0) {
	    		rem = A%10;
	    		rev = rev*10 + rem;
	    		A/=10;
	    	}
	    	
	    	if(rev == orig) return 1;
	    	else return 0;
	    }
}
