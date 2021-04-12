package lec5;

public class perfectNumbers {
	
	public static boolean isPerfect(int num) {
		int sum=0;
		for (int i = 1; i <num; i++) {
			if(num%i ==0)
			{
				sum+=i;
			}
			
		}
		if(sum==num)
			return true;
		else
			return false;
	}
	
	public static void printPerfectNumbers(int range)
	{
		for (int i = 1; i <=range; i++) {
			if(isPerfect(i))
				System.out.print(i+", ");
		}
	}
	
	public static void main(String[] args) {
		//	System.out.println(isPerfect(12));
		printPerfectNumbers(1000000);
	}

}
