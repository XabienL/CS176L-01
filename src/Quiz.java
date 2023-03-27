
public class Quiz implements Measurable {
//Create a class Quiz that implements the Measurable interface we worked on. 
//Use all the class files we created in our BankAccount and Countries example and add Quiz to that mix. 
//Use the same MeasurableTester and add the quiz objects and call average and max code for them. 
//Each quiz object has a score (0-100). Use the Data class we worked on to process an array of quizzes. 
//Display the average score and the quiz with the highest score.
//Create quizzes with these scores: 95, 80, 90, 50, 75
//Be sure to include expected values: average 78 and max 95 to check your work.
	
	private int score;
	public Quiz(int score) {
	this.score = score;
	}
	public double getMeasure() {
	return score;
	}
}