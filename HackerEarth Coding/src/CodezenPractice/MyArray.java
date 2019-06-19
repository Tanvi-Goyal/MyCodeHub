package CodezenPractice;

import java.util.Arrays;

public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7};
		int[] res;
		pairSum(arr,8);
//		 res = arrangeNumbers(6);
		
//		findUnique(arr);
//		findDuplicate(arr);
//		for(int i =0;i< res.length;i++) {
//			System.out.print(res[i] + " ");
//		}
	}
	
	//Given a number n, put all elements from 1 to n in an array in order - 1,3,.......4,2.
	public static int[] arrangeNumbers(int n) {
		int arr[] = new int[n];
		int j= 1, k=2;
		
		if(n%2==0) {
			for(int i=0; i<n/2;i++) {
				arr[i] = j;
				j+=2;
			}
			
			for(int i=n-1;i>=n/2;i--) {
				arr[i] = k;
				k+=2;
			}
		}else {
			for(int i=0; i<(n+1)/2;i++) {
				arr[i] = j;
				j+=2;
			}
			
			for(int i=n-1;i>=(n+1)/2;i--) {
				arr[i] = k;
				k+=2;
			}
		}
		return arr;
		
	}
	
	//Given an integer array of size 2N + 1. In this given array, N numbers are present twice and one number is present only once in the array.
	//You need to find and return that number which is unique in the array.
	public static void findUnique(int arr[]) {
		
		int result = 0;
		for(int i =0;i<arr.length;i++) {
			result = result^arr[i];
		}
		
		System.out.println(result);
	}
	
	public static void findDuplicate(int arr[]) {
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == arr[i+1]) {
				System.out.println(arr[i]);
				return;
			}
		}
	}
	
	static void pairSum(int[] arr , int num) {
	    Arrays.sort(arr);
	    int start = 0;
	    int end = arr.length-1;
	    
	    while(start<end) {
	        if(arr[start] + arr[end] == num) {
	            if(arr[start] == arr[end]) {
	                
	            	int count = end - start + 1;
	                int n = count-1;
	                int total = (n*(n+1)) / 2;
	                if(total<=0) System.out.println("-1");
	                else{
	                    while(total>0) {
	                    System.out.println(arr[start-1] + " " + arr[end+1] + " " + num);
	                    total--;
	                    }
	                }
	                
	                start = end;
	                
	                
	            }else{
	                int countStart = 0;
	                int countEnd = 0;
	                int temp = arr[start];
	                int i = start;
	                
	                while(arr[i] == temp && i<end) {
	                    i++;
	                    countStart++;
	                }
	                
	                temp = arr[end];
	                int j = end;
	                while(arr[j] == temp && j>start) {
	                    j--;
	                    countEnd++;
	                }
	                
	                start = i;
	                end = j;
	                
	                int total = countStart * countEnd;
	                if(total==0) System.out.println("-1");
	                else{
	                     while(total>0) {
	                    System.out.println(arr[start-1] + " " + arr[end+1] + " " + num);
	                    total--;
	                    }
	                }
 
	            }
	            
	        }else if(arr[start] + arr[end] <num) {
	            start++;
	        }else {
	            end--;
	        }
	    }
	    
	}

}
