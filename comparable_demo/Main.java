package proj8;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(3, 1.87f, "Dana"));
        people.add(new Person(2, 1.55f, "Nira"));
        people.add(new Person(1, 1.92f, "Moshe"));
        people.add(new Person(4, 1.90f, "Ranny"));
        
        people.forEach(System.out::println);
        
        Collections.sort(people);
        
        System.out.println("============================");
        people.forEach(System.out::println);
        
	}

}
