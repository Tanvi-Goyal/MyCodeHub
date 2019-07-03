package Recursion;

public class RecursionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7,8,9};
//		printSubSequence("abc", "");
		printKeypad(24, "");
		
//		System.out.println(binarySearch(arr, 0, arr.length-1, 5));
		
//		String[] res = returnKeyPad(23);
//		for(int i=0;i<res.length;i++) {
//			System.out.println(res[i]);
//		}
		
		
	}

	public static String replaceAll(String s, char c1,char c2) {
		if(s.length() == 0) return "";
		String smallAns = replaceAll(s.substring(1),c1,c2);
		if(s.charAt(0) == c1) return c2+smallAns;
		else return s.charAt(0) + smallAns;
	}
	
	public static int binarySearch(int[] arr, int start, int end, int element) {
		
		if(start>end) return -1;
		int mid = (start + end)/2;
		if(arr[mid] == element) return mid;
		else if(arr[mid] > element) return binarySearch(arr, start, mid-1, element);
		else return binarySearch(arr, mid + 1, end, element);
		
	} 
	
	// return subsequence
	public static String[] returnSubSequence(String str) {
		if(str.length() == 0) {
			String[] ans = {" "};
			return ans;
		}
		
		String[] smallAns = returnSubSequence(str.substring(1));
		String[] ans = new String[2*smallAns.length];
		char current = str.charAt(0);
		
		int k = 0;
		for(int i=0;i<smallAns.length;i++) {
			ans[k++] = smallAns[i];
		}
		
		for(int i=0;i<smallAns.length;i++) {
			ans[k++] = current + smallAns[i];
		}
		
		return ans;
		
	}
	
	// print subsequence
	private static void printSubSequence(String str, String output) {
		
		if(str.length() == 0) {
			System.out.println(output);
			return;
		}
		
		printSubSequence(str.substring(1), output);
		printSubSequence(str.substring(1), output + str.charAt(0));

	}
	
	// return keypad
	private static String[] returnKeyPad(int n) {
		
		if(n==0) {
			String[] ans = {""};
			return ans;
		}
		
		String[] smallAns = returnKeyPad(n/10);
		String getCurrent = getCode(n%10);
		
		String[] ans = new String[smallAns.length*getCurrent.length()];
		int k =0;
		
		for(int i=0;i<getCurrent.length();i++) {
			for(int j=0;j<smallAns.length;j++) {
				ans[k++] = smallAns[j] + getCurrent.charAt(i);
			}
		}
		
		return ans;
	}
	
	static String getCode(int n) {
		String[] arr = {" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		return arr[n];
	}
	
	// print keypad
	private static void printKeypad(int n, String ans) {
		
		if(n == 0) {
			System.out.println(ans);
			return;
		}
		
		String currentCode = getCode(n%10);
		
		for(int i=0;i<currentCode.length();i++) {
			printKeypad(n/10, currentCode.charAt(i) + ans);
		}
	}
	
	private static String[] returnPermutationsOne(String str) {
		
		if(str.length() == 0) {
			String[] ans = {""};
			return ans;
		}
			
			char currentChar = str.charAt(i);
			String rem = str.substring(1,i-1) + str.substring(i+1,str.length());
			
			String[] smallAns = returnPermutationsOne(rem);
			String[] ans = new String[smallAns.length];
			int k=0;
			for(int j=0;j<smallAns.length;j++) {
				ans[k++] = currentChar + smallAns[j];
			}
			
		
		
		return ans;
	}
	
	
}
