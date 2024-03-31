package java;

public class ConstructorChaining {

	public static void main(String[] args) 
	{
		ConstructorChaining cc = new ConstructorChaining(); //1
			//ConstructorChaining cc1 = new ConstructorChaining("hello"); //2

	}
	
	ConstructorChaining()
	{
		this("Hi"); // 1(a) This calls parameterized constructor with string
		System.out.println("Default Constructor"); //4 And then Default Constructor will be called
	}
	
	ConstructorChaining(String a)
	{
		this(1); //2 //This calls parameterized constructor with int 1st
		System.out.println("Parameterized Constructor with String datatype"); //3
	}
	
	ConstructorChaining(int a) //2
	{
		System.out.println("Parameterized Constructor with int datatypes");
	}
	

}
