package lec5;

public class primes {

	public static boolean isPrime(int num) {
		if (num==1)
			return false;
		boolean ans=true;
		for(int i=2;i<=Math.sqrt(num) &&ans ;i++ )
			{
			if(num%i ==0 )
				ans=false;
			}
		return ans;
	}
	
	
	public static void printPrimes(int range) {
		for(int i=2;i<=range;i++) {
			if(isPrime(i))
				System.out.print(i+" ,");
		}
	}
	public static void main(String[] args) {
		System.out.println(isPrime(36));
		
		printPrimes(100);
	}
	
}
