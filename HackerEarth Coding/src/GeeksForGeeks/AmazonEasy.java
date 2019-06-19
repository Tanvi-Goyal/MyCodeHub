package GeeksForGeeks;

import java.util.Arrays;
import java.util.Scanner;

public class AmazonEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of test cases");
		int T = s.nextInt();
		
//		for(int i =1;i<=T;i++) {
//		    String str1 = s.next();
//		    String str2 = s.next();
//		    
//		    String anti_clockwise = "";
//		    String clockwise = "";
//		    
//		    System.out.println(str1.length());
//		    System.out.println(str2.length());
//		    if (str1.length() != str2.length()) 
//               System.out.println("wsd" + 0);
//            else {
//            int length = str2.length();
//		    
//		    anti_clockwise = anti_clockwise + str2.substring(length -2, length) + str2.substring(0, length-2);
//		    clockwise = clockwise + str2.substring(2) + str2.substring(0,2);
//		   
//		    System.out.println(anti_clockwise);
//		    System.out.println(clockwise);
//		    
//		    if(str1.equals(anti_clockwise) || str1.equals(clockwise)) 
//		        System.out.println(1);
//		    else System.out.println("edc" + 0);
//            }
//		}
		
//		for(int i=0; i<T; i++) {
//			System.out.println("Enter length of array");
//		    int n = s.nextInt();
//		    System.out.println("Enter prduct values");
//		    int product = s.nextInt();
//		    int[] arr = new int[n];
//		    System.out.println("Enter array elements");
//		    for(int j=0; j<n; j++) {
//		        arr[j] = s.nextInt();
//		    }
//		    System.out.println(arr[0]+" " + arr[1]+" " + arr[2]+ " " + arr[3]);
//		    Arrays.sort(arr);
//		    System.out.println(arr[0]+" " + arr[1]+" " + arr[2]+ " " + arr[3]);
//		    checkPairProduct(arr, product);
//		    System.out.println();
//		}
		
	
//		for(int i=0;i<T;i++) {
//		    int n = s.nextInt();
//		    long result = convertBinary(n);
//		    System.out.println(result);
//		    int position = getSetBitPos(result);
//		    if(position ==0) {
//		        System.out.println(0);
//		    }else{
//		        System.out.println(position);
//		    }
//		}
		
//		pairProduct();
		
		System.out.println(getSetBitPosition(12));
		
	}
	static int getSetBitPosition(int num) {
	    
	    long binary = convertBin(num);
	    System.out.println("Bin: " + binary);
	    int count =0;
	   
	    while(binary>0) {
	        int r = (int)binary%10;
	        count++;
	        if(r == 1) return count;
	        else {
	            binary = binary/10;
	        }
	    }
	    
	    return -1;
	}
	
	static long convertBin(int num) {
	    long ans = 0;
	    int count = 0;
	    for(int i=13;i>=0;i--) {
	    	
	    	ans+=Math.pow(10, count)*((num>>i)&1);
	    	count++;
	    }
	    
	    return ans;
	}
	
	static void checkPairProduct(int[] arr, int p) {
		System.out.println("In checkpairproduct");
	    int count= 0;int count2 = 0;
	   for(int i=0; i<arr.length;i++) {
	       if(p!=0) {
	           if(p%arr[i] == 0) {
	        	   if(count2==0) {
	        		   p = p/arr[i];
		               count2++;
	        	   }else if(count2 ==1) {
	        		   if(p/arr[i] ==0) {
	        			   p = p/arr[i];
			               count2++; 
	        		   }
	        	   }
	              
	               
	           }
	           count++;
	           if(count == arr.length) break;
	       }
	   }
	  
	  if(p==0) System.out.print("Yes");
	  else System.out.print("No");
	}
	
	private static long convertBinary(int n) {
	    long number =0; int count=0;
	    while(n>0) {
	        int rem = n%2;
	        number += (long) Math.pow(10,count)*rem;
	        count++;
	        n/=2;
	    }
	    
	    return number;
	}
	
	private static int getSetBitPos(long number) {
	    
	    long n = number;
	    long m = number;
	    long revNumber=0;
	    int count =0;
	    // count no of digits
	    int nDigits = 0;
	    while(n>0) {
	        n = n/10;
	        nDigits++;
	    }
	    
	    System.out.println(nDigits);
	    while(m>0) {
	        int rem = (int)m%10;
	        revNumber += (long) Math.pow(10, nDigits) *rem;
	        nDigits--;
	        m= m/10;
	    }
	    
	    System.out.println("reverse" + revNumber);
	    while(revNumber!=0) {
	        int r = (int)revNumber%10;
	        System.out.println("rem is " + r);
	        count++;
	        if(r == 1) return count;
	        else {
	            revNumber = revNumber/10;
	        }
	    }
	    
	    return 0;
	}

}
