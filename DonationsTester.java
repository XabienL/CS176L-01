import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DonationsTester {

	
		public static void main(String[] args) throws FileNotFoundException {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Would you like to process donations now? (enter 'Yes' to continue): ");
			String choice  = sc.nextLine();
			if (choice.equals("Yes")) {
				//process the data
				File inputFile = new File("Donations.txt");
				Scanner in = new Scanner(inputFile);
				Donations giveToMe = new Donations();
				while (in.hasNextLine()) {
				String what = in.nextLine();
				String[] result = what.split(">");
				//System.out.println(result[0]);
				//System.out.println(result[1]);
				//String digits = what.replaceAll("[^0-9.-]", "");
				//System.out.println(digits);
				//Determine category of donation and convert make amount into a number
				//Send category and amount to givetome.processDonations(cat,amt)
				//System.out.println(what);
				
				if (result.length > 1) {										
					String category = result[0];						
					category = category.substring(1);
					int amount = Integer.parseInt(result[1]);
					giveToMe.processDonations(category, amount);
				}
			}
				giveToMe.getStatistics();
				}	
				 else {
				System.out.println("Ending now without processing donations");
				}
				
		}
	}