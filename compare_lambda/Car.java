package proj8;

import java.time.LocalDateTime;

public class Car implements Comparable<Car> {
    protected String m_id;
    protected String m_brand;
    protected String m_model;
    protected LocalDateTime m_creation;
    protected String m_color;
    protected Integer seats;

    public Car(String m_id, String m_brand, String m_model, LocalDateTime m_creation, String m_color, Integer seats) {
        this.m_id = m_id;
        this.m_brand = m_brand;
        this.m_model = m_model;
        this.m_creation = m_creation;
        this.m_color = m_color;
        this.seats = seats;
    }
    
    

    @Override
	public String toString() {
		return "Car [m_id=" + m_id + ", m_brand=" + m_brand + ", m_model=" + m_model + ", m_creation=" + m_creation
				+ ", m_color=" + m_color + ", seats=" + seats + "]";
	}



	@Override
    public int compareTo(Car o) {
        return this.m_id.compareTo(o.m_id);
    }
}
