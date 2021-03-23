package lec2;

public class c2 {
	
	
	public static void main(String[] args) {
//		int a=MyConsole.readInt("Enter the first number");
//		int b=MyConsole.readInt("Enter the second number");
//		boolean res=a<b;
//		
//		System.out.println(res);
		
		
//		
//		final double tax=17; 
//		
//		double  price=MyConsole.readDouble("enter the product price");
//		
//		price= price + price*(tax/100);
//	
//		
//		
//		System.out.println("the new price is "+ price);
		
		
//		double s=MyConsole.readInt("enter a nuber to sqrt");
//		//double t=Math.sqrt(s);
//		System.out.println((int)Math.sqrt((s)));
		
		
//		int n1= MyConsole.readInt("enter1");
//		int n2=MyConsole.readInt("enter 2");
//		int n3= MyConsole.readInt("enter 3");
//		
//		
//		if(n1>n2 && n1>n3) {
//			System.out.println(n1 + " is the maximum");
//		}
//		else {
//			if(n2>n3)
//			{
//				System.out.println(n2+ "is max");
//			}
//			else
//			{
//				System.out.println(n3 + "is max");
//			}
//		
//		}
		
		int N= 60;
		int i=20;
		while(i>0) 
			{
			double d= Math.random();
			int res=(int)(d*N);
			System.out.println(res+", "+ i);
			i=i-1;
			}
		
		
	}

}
