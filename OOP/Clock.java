package OOP;


public class Clock {
	
	public static void main(String[] args) {
		Clock c = new Clock();
		c.setHours(10); // like: c.hours = 10;
		c.setMinutes(4);
		c.tick();
		c.show();
		
		Clock[] clock = new Clock [12];
		for (int i = 0; i < clock.length; i++) {
			clock[i] = new Clock();
		}
		clock[2].setHours(6);
		clock[2].setMinutes(5);
		clock[2].show();
		
		
		}

	private int minutes;
	private int hours;
	
	public Clock( int minutes,int hours) {
		this.hours=hours;
		this.minutes=minutes;
	}
	
	public Clock() {
		
	}
	
	public void tick() {
		minutes+=1;
		hours+= minutes/60;
		minutes=minutes%60;
		hours=hours%24;
	}
	
	public void show() {
		if(hours<10)
			System.out.print("0"+hours+":");
		else
			System.out.print(hours+":");
		if(minutes<10)
			System.out.println("0"+minutes);
		else
			System.out.println(minutes);
	}
	
	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "Clock [minutes=" + minutes + ", hours=" + hours + "]";
	}
	
	
}
