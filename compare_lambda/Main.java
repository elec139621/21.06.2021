package proj8;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        
        System.out.println("============================");
        
        ArrayList<Car> garage = new ArrayList<>();
        garage.add(new Car("56-777-65", "Nissan   ", "Juke     ", LocalDateTime.of(2016,3,20,0,0,0), "Black", 5 ));
        garage.add(new Car("32-333-23", "Nissan   ", "Sentra   ", LocalDateTime.of(2019,4,20,0,0,0), "Black", 5 ));
        garage.add(new Car("55-333-56", "Lincoln  ", "Navigator", LocalDateTime.of(2020,4,3,0,0,0),  "White", 7 ));
        garage.add(new Car("55-333-55", "Bugatti  ", "Chiron   ", LocalDateTime.of(2021,11,15,0,0,0),"Red  ", 2 ));
        garage.add(new Car("77-888-77", "Hennessey", "VenomGT  ", LocalDateTime.of(2018,10,5,0,0,0), "Blue ", 2 ));

        System.out.println("============================");
        garage.forEach(System.out::println);
        
        System.out.println("============================ id");
        Collections.sort(garage); // Comparable
        garage.forEach(System.out::println);
        
        System.out.println("============================ seats");
        Collections.sort(garage, new CarComparatorBySeats() ); //
        garage.forEach(System.out::println);
        
        // anyonynmous class
        System.out.println("============================ seats [shorter]");
        Collections.sort(garage, new Comparator<Car>() {
        	@Override
        	public int compare(Car arg0, Car arg1) {
        		return arg0.seats.compareTo(arg1.seats);
        	}

        });       		
        garage.forEach(System.out::println);
        
        // anyonynmous function
        System.out.println("============================ seats [shorter shorter]");
        Collections.sort(garage, (arg0, arg1) -> arg0.seats.compareTo(arg1.seats));
        garage.forEach(System.out::println);   
        
        // create comparator class for color
        // sort by color + print
        // create comparator for brand -- inline using anyonynmous class
        // create comparator for m_creation (or seats) -- inline using anyonynmous function        
	}

}
