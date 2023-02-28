//Xabien Loor
//CS176L
public class ArrayAssignment1 {

	public static void main(String[] args) {
		{
		double[] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		double largest = 0;
		int count = 0;
				 

		for (double value : values)
		{
			System.out.print(value);
			System.out.print(" ");
			if (value > largest) {
				largest = value;
			}
			if (value < 0) {
				count += 1;
			}
		}
		System.out.println("");
		System.out.println("The largest element in the array is " + largest);
		System.out.println("There are " + count + " negative numbers in the array");
		}

	}

}
