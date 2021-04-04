package lec_4;

public class Arrays {
	
	
	public static void main(String[] args) {
		
		int[] arr= new int[20];
		int[] arr2= new int[20];
		
		double sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100);
			sum+=arr[i];
		}
		
		double avg=sum/arr.length;
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ,");
		}
		System.out.println();
		System.out.println(avg);
		
		
	
		
		
		
	}

}
