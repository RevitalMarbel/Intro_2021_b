package lec5;

public class function2 {
	
	
	
	public static void swap(int x, int y) {
		int t=x;
		x=y;
		y=t;
		
	}

	
	public static void swap2(int[] arr) {
		int t= arr[0];
		arr[0]=arr[1];
		arr[1]=t;
	}
	
	public static void main(String[] args) {
		
		int x=4;
		int y=3;
		swap(x,y);
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		int[] arr= {2,5};
		swap2(arr);
		functions.max(x, y);
		System.out.println("arr[0]: "+arr[0]);
		System.out.println("arr[1]: "+arr[1]);
	}

}
