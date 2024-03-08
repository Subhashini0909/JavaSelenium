package basic;

public class Local_Constant_Variables {
	
	//STATIC VARIABLE
	
	//NON-STATIC / INSTANCE VARIABLE
	
	//CONSTANT VARIABLE
	
	//LOCAL LARIABLE - Private Variables. Local variable should be assigned with values.

	public static void main(String[] args) 
	{	
		Local_Constant_Variables obj = new Local_Constant_Variables();
		obj.id();
		
		int sum = obj.sum(7);
		System.out.println(sum);
		
		obj.User();
		
	}
	
	//VALID - LOCAL VARIABLE
	public int sum(int a)
	{
		int b =10;
		return a+b;
	}
	
	//INVALID - LOCAL VARIABLE
	public void id()
	{
			/*
				int id;
				System.out.println("ID : " + id);
			*/
	}
	
	//CONSTANT VARIABKE
	public void User()
	{
		final int USER_ID = 9090;
		final int a;
		System.out.println(USER_ID);
		//Invalid
			//USER_ID=9091;
			//System.out.println(a); - Constant variable cannot be left unassigned
	}

}


