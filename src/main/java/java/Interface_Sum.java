package java;

public class Interface_Sum implements Interface_{

	public static void main(String[] args) 
	{
		Interface_Sum obj = new Interface_Sum();
		obj.sum(); //Abstract Method
		obj.num2(); //Default method
		Interface_.num3(); //Static method

	}

	@Override
	public void sum() {
		System.out.println("The given no is : " + Interface_.Num1);
												//Can be called without creating object. 
		
	}

}
/*
 * NOTE : This class can have it's own method along with the methods implemented from the interface
 */
