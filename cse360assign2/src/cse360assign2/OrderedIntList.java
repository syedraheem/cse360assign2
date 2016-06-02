package cse360assign2;
/** Ordered list of 10 integers.
 *  @author Syed Raheemuddin
* pin : 42
* Date 5/31/2016
*/
public class OrderedIntList {
	protected int[] a; // a= array
	protected int c; // c= count
	private boolean debug= true;
	
	/**Create the empty lis*/
	OrderedIntList (){
		a = new int[10];
	}
	/** INsert integer
	 * @param v integer adds to the array 
	 */
	public void insert (int v){
		if(debug){
			System.out.print("debug - value =" + v + " ");
			}
		if (c == a.length){
			grow();
		}
		if(c==0){
			a[0]=v;
			c =c+1;
			}
		else{
			int i =0;
			int j=0;
			while(i<c && v>=a[i]){
				i++;
				j++;
				}
			for(i=c; i>j;i--)
				a[i]=a[i-1];
			//store data 
			a[j]=v;
			//increment count
			c=c+1;
			}
		if(debug){
			System.out.print("debug - c =" + c + "\n");
			}
		}
	/* This grows the array */
	private void grow(){
		int [] t = new int [c * 2];
		for(int i =0; i < c; i++){
			t[i] = a[i];
		}
		a=t;
		}
	/**Displays the list*/
	public void print(){
		for (int i=0;i<c;i++){
			if(i % 5 ==0)
				System.out.println();
			System.out.print(a[i] + "\t");
			}
		System.out.println();
		}
	}

