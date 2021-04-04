package lec_4;

public class max_value {
	
	
	
	public static void main(String[] args) {
		int[] arr= new int[30];
		
		
		//create an arry with random numbers between 0 and 100
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100);
			
		}
		//get the max value
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
				}
		}
		
		//print the array
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ,");
		}
		//pront the maximum value
		System.out.println();
		System.out.println("max:"+max);
	}

}
