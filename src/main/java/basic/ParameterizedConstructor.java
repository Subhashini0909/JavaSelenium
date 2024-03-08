package basic;

public class ParameterizedConstructor {
	
	int a;
	
	//PARAMETERIZED CONSTRUCTOR
	ParameterizedConstructor(int a)
		{
			this.a = a;
		}
		
		public void B()
		{
			System.out.println(a);
		}
		
	public static void main(String[] args) {
		ParameterizedConstructor obj = new ParameterizedConstructor(500);
		obj.B();
		ParameterizedConstructor obj1 = new ParameterizedConstructor(200);
		obj1.B();
	}
}
