package basic;

public class StaticVariable {
	
	static int a;
	static int b =10;

	public static void main(String[] args) 
	{
		System.out.println("Static Variable inside Static Method");
		System.out.println(a);
		System.out.println(b);
		
		StaticVariable obj = new StaticVariable();
		obj.A();
	}
	
	public void A()
	{
		System.out.println("Static Variable inside Non-Static Method");
		System.out.println(a);
		System.out.println(b);
	}

}
