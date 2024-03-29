package basic;

public interface Interface_ {
	
	int Num1 = 10; //Static final
	 
	public void sum(); //Abstract method in interface
	
	//Java 8 feature - Methods in interface can have default/static methods
	default void num2()
	{
		//Default method
	}
	static void num3()
	{
		//static method - Can be called with the interface name itself
	}
}
/*
 * NOTE : Cannot create object for an interface. 
 * A class by default will have a constructor but in interface we don't have it
 * 
 * But an interface can have a reference variable.
 * 		Eg:
 * 			Interface_ obj = new Interface_Sum(); //Can be created in Interface_Sum class.
 * 								this reference variable(obj) can only be used to call the methods in interface
 * 								whereas, 
 * 			Interface_Sum obj1 = new Interface_Sum(); //this reference variable(obj1) can be used to call the methods in interface
 * 														as well as class methods
*/