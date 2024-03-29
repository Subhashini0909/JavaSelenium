package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm;
import org.apache.poi.hpsf.Array;

public class SetToList {

	public static void main(String[] args) {
		
		//We don't have get() in set. So we have to convert the set to list to get the value
		
		//Set<String> set = new HashSet<String>(); //Random Order
		Set<String> set = new LinkedHashSet<String>(); //Insertion Order
		//Set<String> set = new TreeSet<String>(); //Ascending Order
		set.add("Skoda");
		set.add("Tata");
		set.add("BMW");
		set.add("Benz");
		set.add("Tesla");
		
		//set.get() - Not available in Set
		
		List<String>SetToList = new ArrayList<String>(set);
		for(String list : SetToList)
		{
			System.out.println(list);
		}
		System.out.println();
		System.out.print("Get an element : ");
		System.out.println(SetToList.get(0));

	}

}
