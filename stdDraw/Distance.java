package stdDraw;

import java.awt.Point;



public  class Distance implements Comparable<Distance> {
    // variables
    // constructor
    // getters and setters
	double dist;
	Point p1;
	Point p2;
	
	public Distance(Point p1, Point p2){
		dist= p1.distance(p2);
		this.p1=p1;
		this.p2=p2;
	}

    @Override
    public int compareTo(Distance dist) {
    	
    	if(this.dist<dist.dist)
    		return -1;
    	if(this.dist<dist.dist)
    		return 1;
    	return 0;
    }
}