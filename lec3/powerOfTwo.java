package lec3;

public class powerOfTwo {

	
	
	public static void main(String[] args) {
//		int i=0; //power
//		int v=1;
		int n=160;
//		while(i<n) {
//			System.out.println("2 ^"+ i+ " is: "+v );
//			v*=2;
//			i++;
//		}
		
		
		for(int i=0,v=1 ;  (i<n && v<100) ;i++,v*=2) {
			System.out.println("2 ^"+ i+ " is: "+v );
		}
		
	}
}
