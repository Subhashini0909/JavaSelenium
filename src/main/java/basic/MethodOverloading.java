package basic;

public class MethodOverloading {

	public static void main(String[] args) 
	{
		/*
		 * METHOD OVERLOADING - Concept of Polymorphism
		 * Method with same name but with different parameters
		 * println & print - Very good example of Method Overloading
		 */
		
		MethodOverloading obj = new MethodOverloading();
		obj.user("Subha", 628207);
		obj.user("Subha", "628208");
	}
	
	public void user(String name, String zip_Code)
	{
		System.out.println("Name : " +name);
		System.out.println("Address : " + zip_Code);
	}
	
	public void user(String name, int zip_Code)
	{
		System.out.println("Name : " +name);
		System.out.println("Address : " + zip_Code);
		System.out.println("");
	}
	
	//INVALID
//	public void user(int pwd1, String name1)
//	{
//		
//	}

}
