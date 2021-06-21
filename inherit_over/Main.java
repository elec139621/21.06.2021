package proj5;

public class Main {

	
	private static void printWithStarts(int x) {
		System.out.println("".format("*** %d ****", x));
	}
	
	private static void printWithStarts(String s) {
		System.out.println("".format("-----** %s **------", s));
	}
	
	public static void main(String[] args) {

		// interface basics
		// override basics
		
		printWithStarts(1);
		printWithStarts("itay");
		
		Employee e = new Employee("dana", 1, 80000d);// new Person ( )
		
		
		// create class MobilePhone
		// protected String model
		// protected String color
		// getter/setter Alt +Shift + S -- not for ctor!!
		// toString
		// ctor (String model, String color)
		// ctor (String model) -- calls other ctor with color "black"
		// create dervied class IPhone
		// protected float ios_version
		// getter / setter
		// to string 
		// ctor (all base fields... , ios_version)
		// create dervied class Samsung
		// protected String android_candy_name
		// getter / setter
		// to string 
		// ctor (all base fields... , android_candy_name)		
		// Main:
		// create iphone, android
		// public static void showPhone(Android a) {
		//   ... print android candy name }
		// public static void showPhone(IPhone a) {
		//   ... print ios_version }		
		
		
		
	}

}
