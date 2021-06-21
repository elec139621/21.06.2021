package proj8;

import java.util.Comparator;

public class CarComparatorBySeats implements Comparator<Car> {

	@Override
	public int compare(Car arg0, Car arg1) {
		return arg0.seats.compareTo(arg1.seats);
	}

}
