import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Used to test the BlankLinesRemover class.
 */
public class InputOutputFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFilePath;
        boolean validInput = false;

        
        while (!validInput) {
            System.out.print("Please enter the path to open the input file (e.g. C:\\Downloads\\lines.txt): ");
            inputFilePath = scanner.nextLine();

            try {
                File inputFile = new File(inputFilePath);
                Scanner fileScanner = new Scanner(inputFile);
                PrintWriter outputFile = new PrintWriter(System.out);

                while (fileScanner.hasNext()) {
                    String what = fileScanner.next();
                    outputFile.println(what);
                }

                 
                outputFile.close();

                System.out.println("File has been processed successfully.");
                validInput = true;
            } catch (FileNotFoundException e) {
                System.out.println("File not found, please try again.");
            }
        }
    }
}