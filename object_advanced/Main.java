package proj6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape circle = new Shape("circle");
		System.out.println(circle);
		
		System.out.println(circle.getClass());
		
		System.out.println(circle.hashCode());
		// 1dB9742
		
		// create a class called Person
		// String m_name
		// int m_id
		// ctor(id, name)
		// tostring
		// create a toString which prints the getClass and the hashcode
		// *etgar: print hashcode in hexa
		// override the hashcode function 
		//     return the person ID
		// *etgar: override equals .. compare the id
		
		Person p = new Person("itay", 1);
		System.out.println(p);
	}

}
