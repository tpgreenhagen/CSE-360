/**
 * Tanner Greenhagen
 * CSE 360 Wednesday
 * Assignment 1
 * Class ID: 426
 * This program creates a list that can hold numbers. 
 * Numbers can be added to the front or back, removed, searched for in the list.
 * The first number can be returned, the number of elements in the list can be returned
 * and the size of the list can be returned.
 */
package cse360assign2;

public class SimpleList //This class contains the 10 integer list and its operations
{
	private int[] list;
	private int count;
	private int size;
	
	/**
	 * Simple List Constructor
	 * sets up the list of size 10 and its number if elements is set to 0
	 */
	public SimpleList()
	{
		list = new int[10];
		count = 0;
		size = 10;
	}
	
	/**
	 * Add method
	 * Adds a number to the front of the list
	 * @param 	toAdd a number to be added to the list
	 * @return 	returns nothing
	 */
	public void add(int toAdd)
	{
		count++;
		
		if (count > size) 
			size *= 1.5;	
		
		int[] temp = new int[size];
		temp[0] = toAdd;
		
		for(int i = 1; i < count; i++)
			temp[i] = list[i-1];
		list = temp;
	}
	
	/**
	 * Append method
	 * Adds a number to the end of the list
	 * @param	toAaa a number to be added to the list
	 * @return	returns nothing
	 */
	public void append(int toAdd) {
		count++;
		if (count > size) 
			size *= 1.5;
		int[] temp = new int[size];
		for(int i = 0; i < count-1; i++)
			temp[i] = list[i];
		
		temp[count-1] = toAdd;
		list = temp;
	}
	/**
	 * Remove method
	 * Removes the desired number
	 * @param 	toRemove the number to be removed
	 * @return 	returns nothing
	 */
	public void remove(int toRemove)
	{
		for(int i = 0; i < count; i++)
		{
			if(list[i] == toRemove) {
				
				for(int j = i; j < count - 1; j++) {
					list[j] = list[j+1];
				}
				
				i = count;
				list[count - 1] = 0;
				count--;
			}
			
		}
		if(count < size * 0.75) {
			size *= 0.75;
			int[] temp = new int[size];
			for(int i = 0; i < count; i++) {
				temp[i] = list[i];
			}
			list = temp;
		}
	}
	
	/**
	 * first method
	 * Returns the first element of the list
	 * @return	returns the first integer or -1 if there is no value in first entry
	 */
	public int first() {
		if(count == 0){
			return -1;
		}
		return list[0];
		
	}
	
	/**
	 * size method
	 * Returns the size of the list
	 * @return	returns the number of possible elements the current list could hold.
	 */
	public int size() {
		return size;
	}
	
	
	/**
	 * Count method
	 * Returns number of elements in the list
	 * @return	returns the number of elements in the list
	 */
	public int count() {
		return count;
	}
	
	/**
	 * toString() method
	 * Displays the list
	 * @return 	returns a string of the list contents 
	 */
	public String toString()
	{
		String str = "";
		if(count != 0) {
			str+= (list[0]);
			for(int i = 1; i < count; i++) {
				str += " " + list[i];
			}
		}
		return str;
	}
	
	/**
	 * Search method
	 * Returns index or -1 depending on if number is in list
	 * @param 	search, the integer searched for
	 * @return 	returns the index of the requested integer
	 */
	public int search(int search) {
		int search_return = -1;
		for(int i = 0; i < count; i++)
		{
			if(list[i] == search) {
				search_return = i;
			}
		}
		return search_return;
		
	}
}
