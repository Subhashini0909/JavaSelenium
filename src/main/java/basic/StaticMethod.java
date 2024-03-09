package basic;

public class StaticMethod {

	public static void main(String[] args) 
	{
		A(); //Static method can be called directly without object
		StaticMethod.A(); //Else can be called with classname (classname.method())

	}
	
	public static void A()
	{
		System.out.println("Static Method");
	}

	
}
