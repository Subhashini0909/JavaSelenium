package java;

public class AccessModifiers_CabBooking {

	public static void main(String[] args) 
	{
		AccessModifiers_CabBooking obj = new AccessModifiers_CabBooking();
		obj.Cab_Seat_Availability_Checking();
		String User = obj.User_Login();
		System.out.println("Enter User detail : " + User);
		boolean CAC = obj.Cab_Availability_Checking();
		System.out.println("Cabs are available? " +CAC);

	}
	
	//PUBLIC
	public byte Cab_Seat_Availability_Checking() //Can Be used anywhere
	{
		byte Cab_Seat_Availability = 99;
		System.out.println("No.of seats available : " +Cab_Seat_Availability);
		return Cab_Seat_Availability;
	}
	
	//DEFAULT
	boolean Cab_Availability_Checking() //Can be used anywhere inside the package
	{
		return true;
	}
	
	
	//PRIVATE
	private String User_Login() //Can be used only within the class
	{
		return "Subha";
	}
	
}
