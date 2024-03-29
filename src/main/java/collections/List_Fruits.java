package collections;

import java.util.ArrayList;
import java.util.List;

public class List_Fruits {

	public static void main(String[] args) 
	{
		List<String> fruits = new ArrayList<String>();
		
//ADD
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Pineapple");
		fruits.add("Watermelon");
		fruits.add("Mango"); //Allows duplicate element
		fruits.add(null); //Can have null value
		
//CONTAIN
		boolean Mango = fruits.contains("Mango");
		System.out.println(Mango);
		
//REMOVE
		Boolean remove_Value = fruits.remove("Mango"); //FIFO - Removes the 1st Mango
		String remove_Index = fruits.remove(0); //Removing can be done with the element and index
			//Return type of remove with element is boolean
			//return type of remove with index is String
		
		System.out.println("Size of the list : " + fruits.size());

//GET
		System.out.println("-------------USING FOR LOOP------------------");
		//for(int i =0; i<=fruits.size(); i++) - IndexOutOfBoundsException
		for(int i =0; i<=fruits.size()-1; i++)
		{
			System.out.println(fruits.get(i));
		}
		
		System.out.println();
		System.out.println("-------------USING FOREACH LOOP------------------");
		for(String fruit : fruits)
		{
			System.out.println(fruit);
		}
		
//CLEAR
		fruits.clear();
		
//ISEMPTY
		System.out.println("Is empty : " + fruits.isEmpty());
	}

}
