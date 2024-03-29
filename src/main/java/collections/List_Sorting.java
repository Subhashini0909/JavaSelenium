package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Sorting {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Pineapple");
		fruits.add("Watermelon");
		fruits.add("Mango"); 
		//fruits.add(null); 
		Collections.sort(fruits); 
				/*
				 * Collections.sort() method cannot handle null elements within the list. 
				 * When attempting to sort a list containing null elements, 
				 * a NullPointerException will be thrown.
				 */
		
		for(String fruit : fruits)
		{
			System.out.println(fruit);
		}

	}

}
