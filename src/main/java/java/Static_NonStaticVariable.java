package java;

public class Static_NonStaticVariable {

	static int a;
	int b;
	
	void A()
	{
		a++;
		b++;
		System.out.println("Static : " + a + "==>" + "Non-Static : " + b);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Static is associated with class. So even if we change the object it keeps adding");
		System.out.println("Whereas on-static is associated with object. So it starts from first");
		
		Static_NonStaticVariable obj = new Static_NonStaticVariable();
		obj.A();
		obj.A();
		
		System.out.println(" ");
		
		Static_NonStaticVariable obj1 = new Static_NonStaticVariable();
		obj1.A();
		obj1.A();
	}

}
