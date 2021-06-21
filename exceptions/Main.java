package project9;

public class Main {

	private static void set_increased(int set_index) {
		int[] nums = new int[3];	

		if (nums.length < set_index) {
			nums[set_index] = 12; // exception was raised
		}
		System.out.println("here? 1");
	} 
	
	private static void update_array(boolean go, int set_index) {
		if (go) {
			set_increased(set_index + 20);
			System.out.println("here? 2");
		}
	}
	
	public static void main(String[] args) {
		try
		{
			// high risk code block
			update_array(true, 0);
			System.out.println("here? 3");
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			// what to do here?
		}		
		catch (Exception ex) {
			System.out.println("i catched it!!!!!!");
			System.out.println("here? 4-1");
		}

		System.out.println("here? 5");
		
		// import class Person
		// Person p = null;
		// sysout (p.hashCode());
		// which exception did you get?
		// try to catch it with the exact exception [like in line 28]
		// try to catch it with a general exception [like in line 31]
	}

}
