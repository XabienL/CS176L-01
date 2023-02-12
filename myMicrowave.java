
public class myMicrowave {
	int time = 0;
	int power = 1;
	
	public void start() {
		System.out.println("Cooking for " + time + " at level " + power + ".");
	}
	public void time() {
		time += 30;
		System.out.println("Time button was pressed. Time is " + time + " seconds.");
	}
	public void power() { 
		power += 1;
		System.out.println("Power button was pressed. Power level is " + power + ".");
	}
	public void reset() {
		time = 0;
		power = 1;
		System.out.println("Reset Button was pressed. Power level is 1. Time is 0 seconds.");
	}
}
