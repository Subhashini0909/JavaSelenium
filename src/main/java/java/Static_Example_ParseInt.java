package java;

public class Static_Example_ParseInt {
	
	static String a = "1";
	static String b = "2";

	public static void main(String[] args) {
		
		//Integer.parseInt() helps to convert string value into int
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		
		System.out.println(a+b);
		System.out.println(c+d);

	}

}
