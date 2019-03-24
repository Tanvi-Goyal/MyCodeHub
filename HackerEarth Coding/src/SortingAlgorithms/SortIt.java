package SortingAlgorithms;

import java.util.*;

public class SortIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
//		int A[] = {7,2,9,3,8,12,6,9,4,8,2,7,3,9,4,1,8,5};
		int A[] = {7,2,4,1,5,3};
		int n = A.length;
		
		//selectionSort
//		selectionSort(A,n);
		
		//bubbleSort
//		bubbleSort(A,n);
		
		//insertionSort
//		insertionSort(A,n);
		
		//mergeSort
//		mergeSort(A,n);
		
		//quickSort
		quickSort(A,0,n);
		
		for(int k = 0 ; k< n;k++) {
			System.out.print(A[k] + " ");
		}
		

	}

	private static void quickSort(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		
		if(start<end) {
			int pIndex = partition(a,start,end);
			quickSort(a, start, pIndex -1);
			quickSort(a, pIndex +1, end);
		}
	
	}

	private static int partition(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		int pivot = a[end];
		int pIndex = start;
		
		for(int i = start ; i<end;i++) {
			if(a[i]<=pivot) {
				swap(a[i] , a[pIndex]);
				pIndex++;
			}
		}
		swap(a[pIndex] , a[end]);
		return pIndex;
	}

	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		
		int temp = i;
		i =j;
		j = temp;
	}

	private static void mergeSort(int[] a, int n) {
		// TODO Auto-generated method stub
		if(n<2) return;
		int mid = n/2;
		int[] left = new int[mid];
		int[] right = new int[n-mid];
		
		for(int i = 0 ;i< mid;i++) {
			left[i] = a[i];
		}
		
		for(int i = mid ; i< n ;i++) {
			right[i-mid] = a[i];
		}
		
		mergeSort(left,left.length);
		mergeSort(right, right.length);
		merge(left,right,a);
	}

	private static void merge(int[] left, int[] right, int[] a) {
		// TODO Auto-generated method stub
		
		int nL= left.length;
		int nR = right.length;
		int i = 0,j =0,k = 0;
		
		while(i<nL && j<nR) {
			if(left[i] < right[j]) {
				a[k] = left[i];
				i++;
 			} else {
 				a[k] = right[j];
 				j++;
 			}
			k++;
		}
		
		while(i<nL) {
			a[k] = left[i];
			i++;
			k++;
		}
		while(j<nR) {
			a[k] = right[j];
			j++;
			k++;
		}
	}

	private static void insertionSort(int[] a, int n) {
		// TODO Auto-generated method stub
		
		for(int  i = 0 ; i<n;i++) {
			int value= a[i];
			System.out.println(value);
			int hole = i;
			System.out.println("Current Hole: "+ hole);
			while(hole>0 && a[hole-1] > value) {
				a[hole] = a[hole-1];
				hole = hole-1;
				System.out.println("Changed Hole: " + hole);
			}
			
			a[hole] = value;
		}
		
	}

	private static void bubbleSort(int[] a, int n) {
		// TODO Auto-generated method stub
		
		for(int i = 1 ; i < n-1 ;i++) {
			int flag = 0;
			for(int j = 0;j<n-i;j++) {
				if(a[j]> a[j+1]) {
					swap(a[j],a[j+1]);
					flag = 1;
				}
			}
			if(flag ==0) {
				System.out.println("No more swaps");
				break;
			}
		}
		
	}

	private static void selectionSort(int[] a, int n) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i <n-1;i++) {
			
			int iMin = i;
			for(int j = i+1;j<n;j++) {
				if(a[j] < a[iMin]) iMin = j;
				}
			
			swap(a[i],a[iMin]);
		}
		
	}

	
	
}
