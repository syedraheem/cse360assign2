package cse360assign2;

/** Class inherit from the OrderedIntlist.java class
*Also, calculates the mean,median,high,low,and numInt. 
* @author Syed Raheemuddin
* pin : 42
* Date 5/31/2016
*/
public class Analytics extends OrderedIntList {
	Analytics(){	
		
	}
	// Calculates the mean.
	public double mean(){
		double total = 0;
		if(c ==0 || a==null)
	return -1;
		else{
			for (int i =0; i < c ; i++)
				total += a[i];
			return (total/c);
			}
		}
	// Calculates the median.
	public int median(){
		if (c==0||a==null)
			return -1;
		if(c % 2 ==0)
			return (a[c/2] + a[c/2 - 1])/2;
		else
			return a[c/2];
		}
	// Finds the highest number.
	public int high(){
		if (c==0 || a==null)
			return -1;
		return a[c -1];
		}
	// Finds the lowest number.
	public int low(){
		if (c==0 || a == null)
			return -1;
		return a[0];
		}
	// Finds the number of intgeres. 
	public int numInts(){
		if (c==0 || a == null)
			return -1;
		return c;
		}
	}
