import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;

public class MeasurableViewer {
	
	private static final int FRAME_WIDTH = 200;
	private static final int FRAME_HEIGHT = 200;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter metric to use, 1 for maximum, 2 for minimum, 3 for average: ");
		int whichMetric = sc.nextInt();
		
		JFrame frame = new JFrame();
	    JPanel panel = new JPanel();
	    frame.add(panel);
	    
	    Measurable[] countries = new Measurable[3];
	    countries[0] = new Country("Uruguay", 176220);
	    countries[1] = new Country("Thailand", 513120);
	    countries[2] = new Country("Belgium", 30510);
	    Measurable[] bank = new Measurable[3];
	    bank[0] = new BankAccount(176220);
	    bank[1] = new BankAccount(513120);
	    bank[2] = new BankAccount(30510);
	    Measurable[] quiz = new Quiz[5];
	    quiz[0] = new Quiz(95);
	    quiz[1] = new Quiz(80);
	    quiz[2] = new Quiz(90);      
	    quiz[3] = new Quiz(50);
	    quiz[4] = new Quiz(75);

	    String metricToUse;
	    
		if (whichMetric == 1) {
	    	metricToUse = "Maximum";
	    }
	    else if (whichMetric == 2) {
	    	metricToUse = "Minimum";
	    }
	    else {
	    	metricToUse = "Average";
	    }
	    
	    JButton button1 = new JButton("Get " + metricToUse + " Balance");
	   	panel.add(button1);
	    
	   	JButton button2 = new JButton("Get " + metricToUse + " Area");
	   	panel.add(button2);
	    
	   	JButton button3 = new JButton("Get " + metricToUse + " Score");
    	panel.add(button3);
	    
	    
	    ActionListener listener1 = new MeasurableListener(bank, whichMetric);      
	    button1.addActionListener(listener1);
	    
	    ActionListener listener2 = new MeasurableListener(countries, whichMetric);      
	    button2.addActionListener(listener2);
	    
	    ActionListener listener3 = new MeasurableListener(quiz, whichMetric);      
	    button3.addActionListener(listener3);
	    
	    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}

}