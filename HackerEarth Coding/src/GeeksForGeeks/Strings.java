package GeeksForGeeks;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
//		int T = s.nextInt();
		
//		for(int i=0;i<T;i++) {
//		    String str = s.nextLine();
//		    if(isPalindrome(str)) System.out.println("Yes");
//		    else System.out.println("No");
//		}
		
//		for(int i=0;i<T;i++) {
//		    String str = s.next();
//		    System.out.println("str: " + str);
//		    str = reverseEach(str);
//		    System.out.println(reverse(str));
//		}
		
//		for(int i=0;i<T;i++) {
//		    int n = s.nextInt();
//		    String str = s.next();
//		    
//		    System.out.print(countSpecialSubstrings(str));
//		}
		
		System.out.println(isValidIP("0.0.0.0"));
		
	}

	static boolean isPalindrome(String s) {
	    int j= s.length()-1;
	    for(int i=0;i<s.length()/2;i++) {
	        if(s.charAt(i)!=s.charAt(j)){
	            return false;
	        } 
	        j--;
	}
	
	return true;
	}
	
	
	static String reverseEach(String str) {
	    StringBuilder sBuilder = new StringBuilder();
	    String[] strArray = str.split("[.]");
	    
	    for(int i=0;i<strArray.length;i++) {
	        if(i==strArray.length-1) {
	            sBuilder.append(reverse(strArray[i]));
//	            sBuilder.append(".");


	        }else{
	            sBuilder.append(reverse(strArray[i]));
	            sBuilder.append(".");
	        }
	        
	    }
	    
	    return sBuilder.toString();
	}
	
	static String reverse(String str) {
	    String revString = "";
	    
	    for(int i=str.length()-1;i>=0;i--) {
	        revString+=str.charAt(i);
	    }
	    return revString;
	}
	
	static int countSpecialSubstrings(String str) {
	    int countOne = 0;
	    for(int i=0;i<str.length();i++) {
	        if(str.charAt(i)=='1') {
	            countOne++;
	        }
	    }
	    
	    
	    return (countOne*(countOne-1))/2;
	}
	
	public static boolean isValidIP(String s){
		   //Write your code here
		   
		
		   StringTokenizer t = new StringTokenizer(s, ".");

		   if(!validate(t)) return false;
		   
//		   String[] strArray = s.split("[.]");
//		   if(strArray.length>5) return false;
//		   else{
//		        for(int i=0;i<strArray.length;i++) {
//		       if(!validate(strArray[i])) return false;
//		    }
//		   }
		  
		   return true;
		}
		
		static boolean validate(StringTokenizer t) {
				if(t==null) return false;
				else {
					while(t.hasMoreTokens()) {
						if(t.nextToken()!="" ) {
							int val = Integer.parseInt(t.nextToken());			
				            if(val>=0 && val<=255) return true;
				            else return false;
						}else return false;
						
					}
					
				}
			return false;
		        
		}
}
