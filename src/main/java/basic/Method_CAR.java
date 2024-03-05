package basic;

public class Method_CAR {

	public static void main(String[] args) 
	{
		Method_CAR obj = new Method_CAR(); //Object Creation
		
		//Method Calling
		String wash = obj.wash();
		System.out.println(wash);
		obj.Owner_Detail(12334556576l, 122233445);

	}
	
	//Simple method
	public String wash()
	{
		return "Car wash is available";
	}
	
	//Parameterized Method
	private void Owner_Detail(long license, int rc_no)
	{
		System.out.println("License : " + license);
		System.out.println("RC No. : " + rc_no);
	}

}
