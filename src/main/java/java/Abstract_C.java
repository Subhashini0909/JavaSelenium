package java;

public class Abstract_C extends Abstract_B{
	
	//The unimplemented method of Abstract_A_Interface in Abstract_B is implemented in Abstract_C

	@Override
	public void A3() {
		System.out.println("A3");
	}
public static void main(String[] args) 
{
	Abstract_C obj = new Abstract_C();
	obj.A1();
	obj.A2();
	obj.A3();
}


}
