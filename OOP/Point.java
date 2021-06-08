package OOP;


public class Point {
	
	
	private int x;
	private int y;
	

	public void printPoint() {
		System.out.println("x:"+x+" y:"+y);
	}

	public Point(int xx, int yy) {
		this.x=xx;
		this.y=yy;
	}
	
	public Point() {
		System.out.println("new point created (0,0):");
	}
	
	//copy constractor
	public Point(Point other) {
		this.x=other.x;
		this.y=other.y;
	}

	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}
	
	public double distance(Point p) {
		return Math.sqrt(diff(p.x,this.x)+diff(p.y,this.y));
	}
	
	public double diff(int pa1, int pa2 ){
		double res = Math.pow(pa1-pa2, 2);
		return res;
	}
	
	
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(3);
		p1.setY(4);
		p1.printPoint();
		
		Point p2 = new Point (1,1);
		p2.printPoint();
		
		System.out.println();
		
		Point [] arr= new Point [5];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=new Point(p1);
			arr[i].printPoint();
		}
		
		System.out.println();
		p1.setX(7);
		for (int i = 0; i < arr.length; i++) {
			//arr[i]=p1;
			arr[i].printPoint();
		}
		
		Point p3 = new Point(5,0);
		Point p4 = new Point(0,3);
		System.out.println(p3.distance(p4));
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
