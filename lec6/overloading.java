package lec6;

public class overloading {
	
	
	/**
	 * return minimum of 2 numbers.
	 * @param  number1
	 * @param  number2
	 *
	 */
	public static int min(int x, int y) {
		if( x<y)
			return x;
		return y;
		
	}
	/**
	 * return minimum of 3 numbers.
	 * @param  number1
	 * @param  number2
	 * @param  number3
	 *
	 */
	public static int min(int x, int y, int z) {
		if( x<y && x<z)
			return x;
		if(y<z)
			return y;
		return z;
		
	}
	public static boolean min(double x, double y) {
		if(x<y)
		{
			return true;
		}
		return false;
	}
	
	public static int sum(int...nums)
	{
		int sum=0;
		System.out.println(nums.length);
		for(int i : nums) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
//		System.out.println(min(3,4));
//		System.out.println(min(3,4,5));
//		System.out.println(min(3.5,6.7));
//		
//		int res= min(3,5)*7;
//		System.out.println(res);
		
		System.out.println(sum(5,5,5,5));
	}

}
