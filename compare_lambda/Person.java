package proj8;

public class Person implements Comparable<Person> {

    protected int m_id;
	protected float m_height;
    protected String m_name;
    
    public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public float getM_height() {
		return m_height;
	}
	public void setM_height(float m_height) {
		this.m_height = m_height;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	
	public Person(int m_id, float m_height, String m_name) {
		super();
		this.m_id = m_id;
		this.m_height = m_height;
		this.m_name = m_name;
	}
	
	@Override
	public String toString() {
		return "Person [m_id=" + m_id + ", m_height=" + m_height + ", m_name=" + m_name + "]";
	}
	
	@Override
	public int compareTo(Person o) {

		// person1 -- this
		// person2 -- o
		
		// if I am after 1, 5
		
		// + --> i am after
		// 0     same
		// - --> i am before
		
//		if (this.m_id > o.m_id) 
//			return +;
//		else if (this.m_id< o.m_id)
//			return -;
//		return 0;
		
		//return this.m_id - o.m_id;
		// m_id
		return ((Integer)this.m_id).compareTo(o.m_id);
		
		//return this.m_name.compareTo(o.m_name);
		
		//Create class Car:
//			# Id (String) [i.e. 55-235-22]
			//# Brand (String) [i.e. Mitsubishi]
			//# Model (String) [i.e. Outlander]
			//# Creation (LocalDateTime) [i.e. 2015-12-31 16:32:11]
			//# Color (String)
			//# Seats (Integer)
		
		//Create ArrayList of cars
		//Sort using Id, Seats, model, **ETGAR: creation 
		// each type and print after EACH sort 
	}

	
	
}
