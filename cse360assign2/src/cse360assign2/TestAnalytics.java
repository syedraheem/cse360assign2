package cse360assign2;

/** Contains the main method and tests all the methods. 
 * @author Syed Raheemuddin
 * pin : 42
 * Date 5/31/2016
 */

public class TestAnalytics {

	//main method to test all the methods both local and inherited
	public static void main(String[] args){
		int a[] = {-12, -1, 0, 4, 8, 10, 14, 16, 18, 21, 25, 30};
		 
		Analytics analytics = new Analytics();
		 
		 for (int i = 0; i< a.length; i++)
			 analytics.insert(a[i]);
		 
		  //prints the array
		 System.out.println("\n" + "print array: ");
		 analytics.print();
		
		 /* Calculates the mean, median, highest value, lowest value,
		 and number of integers in the list*/
		 System.out.println("\n" + " mean of the numbers in the list is :" + analytics.mean());
		 System.out.println("\n" + " median of the numbers in the list is :" + analytics.median());
		 System.out.println("\n" + " highest value of the numbers in the list is :" + analytics.high());
		 System.out.println("\n" + " lowest value of the numbers in the list is :" + analytics.low());
		 System.out.println("\n" + " number of integers in the list is :" + analytics.numInts());
		 
	}
}
