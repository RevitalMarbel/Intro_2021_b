package OOP;

import java.util.Arrays;

public class MyPointArray {

	Point[]arr;
	int size;
	int maxSize=10; //you can't change
	final int startSize=10;
	final int ressize=5;
	
	public  MyPointArray() {
		arr=new Point[startSize];
		size=0;
	}
	
	public void add(Point p) {
		if(size<maxSize) {
		    arr[size++]=p;}
		else{
			Point[]temp= new Point[maxSize+ressize];
			maxSize=maxSize+ressize;
			for (int i = 0; i < arr.length; i++) {
				temp[i]=arr[i];
			}
			arr=temp;
			 arr[size++]=p;
		}
	}
	
	
	@Override
	public String toString() {
		return "MyPointArray [arr=" + Arrays.toString(arr) + ", size=" + size + ", maxSize=" + maxSize + ", startSize="
				+ startSize + ", ressize=" + ressize + "]";
	}

	public static void main(String[] args) {
		 MyPointArray po = new MyPointArray();
		 po.add(new Point(1,3));
		 po.add(new Point(4,1));
		 po.add(new Point(6,7));
		 System.out.println(po);
	}
}
