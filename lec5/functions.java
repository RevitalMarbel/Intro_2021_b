package lec5;

public class functions {
	
	static int max(int x, int y) {
		int m=x;
		if(y>x)
		{
			m=y;
		}
		return m;
		
	}
	// creates  an array of size - size with random numbers
	public static int[] randomIntegerArray(int size)
	{
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= (int)(Math.random()*size);
		}
		return arr;
	}
	
	// print the array
	public static void printArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			if(i%20==0){
				System.out.println();
			}
			System.out.print(array[i]+" ");
			if (i==99)
				return;
		}
	}
	
	
	public static void main(String[] args) {
//		int i=6;
//		int j=9;
//		int res=max(i,j);
//		
//		System.out.println(res);
//		int[] res=randomIntegerArray(500);
//		printArray(res);
		
		printArray(randomIntegerArray(200));
		
	}
	
	

}
