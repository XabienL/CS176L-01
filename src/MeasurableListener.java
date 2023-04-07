import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeasurableListener implements ActionListener{
	private Measurable[] objects;
	private int whichMetric;
   
   public MeasurableListener(Measurable[] objects, int whichMetric){
	   this.objects = objects;
	   this.whichMetric = whichMetric; 
   }

   public void actionPerformed(ActionEvent event){
	   double result = 0;
	   if (whichMetric == 1) {
		   result = Data.max(objects);
	   }
	   if (whichMetric == 2) {
		   result = Data.min(objects);
	   }
	   if (whichMetric == 3) {
		   result = Data.average(objects);
	   }
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
	   if (objects[0].getClass().getName().equals("BankAccount")) {
		   System.out.println(metricToUse + " Account Balance is " + result);
	   }
	   else if (objects[0].getClass().getName().equals("Country")) {
		   System.out.println(metricToUse + " Country Area is " + result);
	   }
	   else if (objects[0].getClass().getName().equals("Quiz")) {
		   System.out.println(metricToUse + " Quiz Score is " + result); 
	   }
   }
   
}
   
