package lec_4;

public class Array2D {
	
	
	public static void main(String[] args) {
		
		//int[][] arr2= {{1,2,3,4},{5,6},{7,8,9}};
		
		int[][] arr= new int[10][];
		
		for (int i = 0; i < arr.length; i++) {
			int n = (int)(Math.random()*10);
			arr[i]=new int[n];
			}
			
		for (int i = 0; i < arr.length; i++) {	
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] );
			}
			System.out.println();
			
		}
		
	}

}
