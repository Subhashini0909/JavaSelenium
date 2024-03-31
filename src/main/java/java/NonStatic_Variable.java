package java;

public class NonStatic_Variable {
	
	//INSTANCE VARIABLE
	int a; //Without a value assigned to it
	int b = 10; //Assigned value to it

	public static void main(String[] args) 
	{
		NonStatic_Variable obj = new NonStatic_Variable();
		
		//1
		obj.Using_INSTANCE_VARIABLE_under_Non_STATIC_METHOD();
		
		//2
		obj.Using_INSTANCE_VARIABLE_under_STATIC_METHOD();
		
		//3
		obj.Using_INSTANCE_VARIABLE_under_STATIC_METHOD1(obj);

	}
	
	
	public void Using_INSTANCE_VARIABLE_under_Non_STATIC_METHOD()
	{
		System.out.println("A : " + a);
		System.out.println("B : " + b);
	}
	
	
	
	public static void Using_INSTANCE_VARIABLE_under_STATIC_METHOD()
	{
		/*
		 * Creating an object of the class and assigning it to a variable (obj1)
		 * This is about instantiation and assignment
		 */
		NonStatic_Variable obj1 = new NonStatic_Variable();
		System.out.println("A : " + obj1.a);
		System.out.println("B : " + obj1.b);
	}
	
	public static void Using_INSTANCE_VARIABLE_under_STATIC_METHOD1(NonStatic_Variable obj2)
	{
		/*
		 * This is a method declaration that takes an object of the class as a parameter (obj)
		 * This is about defining a method that works with an object passed to it.
		 */
		System.out.println("A : " + obj2.a);
		System.out.println("B : " + obj2.b);
	}

}
