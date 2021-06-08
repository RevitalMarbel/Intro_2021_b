package OOP;


public class Circle {

	private Point p;
	private double redius;
	
	public Circle(){
		
	}
	
    public Circle(Point p,double redius){
		this.p=new Point(p);
		this.redius=redius;
	}
    
    public Circle(Circle other){
		this(other.p, other.redius);
		
	}
	
	@Override
	public String toString() {
		return "Circle [p=" + p + ", redius=" + redius + "]";
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p=new Point(p);
	}

	public double getRedius() {
		return redius;
	}

	public void setRedius(double redius) {
		this.redius = redius;
	}
	
	public static void main(String[] args) {
		Point cen=new Point(0,0);
		Circle c1 = new Circle(cen,1);
		Circle c2 = new Circle(cen,2);
		c1.setP(cen);
		c2.setP(cen);
//		System.out.println(c1);
//		System.out.println(c2);
		
		cen.setX(3);
		System.out.println(c1);
		System.out.println(c2);
	}

}
