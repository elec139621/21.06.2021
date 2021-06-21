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
	}

}
