package lec3;

public class GCD {

	
	public static void main(String[] args) {
		int x= MyConsole.readInt("enter the first number");
		int y = MyConsole.readInt("enter the second number");
		
		if(y>x) {
			int temp=x;
			x=y;
			y=temp;
		}
		boolean flag=true;
		
		for(int i=y;i>0 && flag;i--)
		{
			if(x%i==0 && y%i==0) {
				System.out.println(i);
				flag=false;
			}
		}
	}
}
