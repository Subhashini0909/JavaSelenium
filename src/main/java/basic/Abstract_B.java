package basic;

public abstract class Abstract_B implements Abstract_A_Interface {

	@Override
	public void A1() 
	{
		System.out.println("A1");
	}

	@Override
	public void A2() 
	{
		System.out.println("A2");
	}
//Removing A3 Abstract method of Abstract_Interface_A from Abstract_B to create Abstract class
			//@Override
			//public void A3() 
			//{
			//--------------	
			//}
	/*public static void main(String[] args) 
	{
		Abstract_B obj = new Abstract_B(); //Abstract class cannot have object. It can be used in the subclass
		obj.A1();
		obj.A2();
		obj.A3();
	} */
	

}
