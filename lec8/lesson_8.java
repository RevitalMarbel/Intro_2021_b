package lec8;


public class lesson_8 {
	
	public static void main(String[] args) {
		int [] arr1 = {3,5,6};
		int [] arr2 = {2,4,6,8,10,12};
//		bubbleSort(arr);
//		printArr(arr);
//		selectionSort(arr);
//		printArr(arr);
//		insertionSort(arr);
//		printArr(arr);
//		int []res = mergeArrays(arr1, arr2);
//		printArr(res);
		System.out.println(binarySearch(arr2, 12, 0, arr2.length));
 	}

	public static void swap(int [] arr, int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void bubbleSort(int [] arr) {
		boolean flag=true;
		for (int i = arr.length-1; i >0; i--) {
			flag=false;
			for (int j = 0; j < i; j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
					flag=true;
				}
			}
			if(!flag)
				return;
			printArr(arr);
		}
	}
	
	public static void printArr(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
	
	public static void selectionSort(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			 int minInd=findMin(arr, i);
			 swap(arr, i, minInd);
		}
	}
	
	public static int findMin(int [] arr, int firstInd) {
		int min=arr[firstInd];
		int res=firstInd;
		for (int i = firstInd; i < arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i]; 
			res=i;
			}
		}
		return res;
	}
	
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j >0 && arr[j-1]>arr[j]; j--) {
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	public static int[] mergeArrays(int []arr1 , int[]arr2) {
		int [] res = new int [arr1.length+arr2.length];
		int i=0, j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<=arr2[j])
				res[i+j]=arr1[i++];
			else
				res[i+j]=arr2[j++];
		}
		
		while(i<arr1.length)
			res[i+j]=arr1[i++];
		
		while(j<arr2.length)
			res[i+j]=arr2[j++];
		
		return res;
	}
	
	public static int binarySearch(int [] arr, int item, int left, int right) {
		if(left>right)
			return -1;
		int middle=(left+right)/2;
		if(arr[middle]==item)
			return middle;
		if(arr[middle]>item)
			return binarySearch(arr, item, left, middle-1);
		else
			return binarySearch(arr, item, middle+1, right);
	}
	
}
