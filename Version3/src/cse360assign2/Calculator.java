//Name: Zian Zhang
//Class ID: 596
package cse360assign2;

/**
 * Description: This class is used to do basic calculation.
 * @author zhangzian
 *
 */
public class Calculator {

	private int total;
	private String history;
	
	/**
	 * Description: this is class constructor
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Description: This method get the total sum
	 * @return an integer
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Description: This method is calculate summation 
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value; 
	}
	
	/**
	 * Description: This method is calculate subtraction
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * Description: THis method is calculate multiplication
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	/**
	 * Description: This method is calculate division 
	 * @param value
	 */
	public void divide (int value) {
		if(value == 0)
		{
			total = 0;
		}
		else
		{
			total = total / value;
		}
		history = history + " / " + value;
	}
	
	/**
	 * Description: This method get the history
	 * @return history
	 */
	public String getHistory () {
		return history;
	}
}