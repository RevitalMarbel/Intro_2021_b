package lec6;

public class Geometric {
	
	
	
	public static double distance(double x1, double y1, double x2, double y2 )
	{
		return sqrt(Math.pow(x1-x2, 2)+ Math.pow(y1-y2, 2));
	}
	
	public static double sqrt(double s)
	{
		if (s<0)
			return -1;
		return Math.sqrt(s);
	}

}
