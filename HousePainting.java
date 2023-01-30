import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

System.out.println("Please enter the cost per square foot: ");
int costPerSqFt = sc.nextInt();


System.out.println("Please enter the length of the house: ");
int houseLength = sc.nextInt();

System.out.println("Please enter the width of the house: ");
int houseWidth = sc.nextInt();

System.out.println("Please enter the height of the house: ");
int houseHeight = sc.nextInt();


System.out.println("Please enter the number of windows: ");
int numOfWindows = sc.nextInt();

System.out.println("Please enter the length of a window: ");
int windowLength = sc.nextInt();

System.out.println("Please enter the width of a window: ");
int windowWidth = sc.nextInt();


int totalWindowArea = numOfWindows * windowWidth * windowLength;

System.out.println("Please enter the number of doors: ");
int numOfDoors = sc.nextInt();

System.out.println("Please enter the length of a door: ");
int doorLength = sc.nextInt();

System.out.println("Please enter the width of a door: ");
int doorWidth = sc.nextInt();

int totalDoorArea = numOfDoors * doorWidth * doorLength;

double peakSide = houseLength * houseWidth + 0.5 * (houseLength * (houseHeight - houseWidth));
int normalSide = houseLength * houseWidth;

double totalHouseArea = (2 * peakSide) + (2 * normalSide);
double paintableArea = totalHouseArea - (totalDoorArea + totalWindowArea);
double totalCost = paintableArea * costPerSqFt;

System.out.println("Your total paintable surface area is " + String.format("%.0f", paintableArea) + " square feet.");
System.out.println("Your estimate is " + String.format("%.0f", totalCost) + " dollars.");
	}

}
