package java;

//Employee Details
public class DataTypes {
	
//NON-Static Variable(Instance Variable) -  CAN BE USED ONCE AFTER CREATING THE OBJECT OF THE CLASS
	String name = "Subhashini C";
	
	byte age = 23; //Value-range lies between -128 to 127
	
	long Contact_No = 6379372186l; //Value-range lies between -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)
	
	float savings = 10000.30f; //Value range is unlimited
	
	char sex = 'F'; //To store characters
	
	boolean Disability = false; //Used to store only two possible values: true and false.
	
	public static void main(String[] args) {
		
		DataTypes obj = new DataTypes();
		
		System.out.println("------PRINTING EMPLOYEE DETAILS------");
		System.out.println("Name : " + obj.name);
		System.out.println("Age : " + obj.age);
		System.out.println("Contact No : " + obj.Contact_No);
		System.out.println("Savings : " + obj.savings);
		System.out.println("Sex : " + obj.sex);
		System.out.println("True in case of any disability : " +obj.Disability);

	}

}
