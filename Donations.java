import java.util.Scanner;


public class Donations {
	private int numIndividual;
	private float amtIndividual;
	private int numBusiness;
	private float amtBusiness;
	private int numOther;
	private float amtOther;
	
	public void processDonations(String c, int a) {
		if (c.equals("individual donation")) {
			numIndividual += a / Math.abs(a);
			amtIndividual += a;
		} else if (c.equals("business donation")) {
			numBusiness += a / Math.abs(a);
			amtBusiness += a;
		} else if (c.equals("other donation")) {
			numOther += a / Math.abs(a);
			amtOther += a;
		}}
		
	
	
	public void getStatistics() {
		System.out.println("Individual: " + "#:" + numIndividual  + " $" + amtIndividual);
		System.out.println("Business: " + "#:" + numBusiness  + " $" + amtBusiness);
		System.out.println("Other: " + "#:" + numOther + " $" + amtOther);


	}
}
