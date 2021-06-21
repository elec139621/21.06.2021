package proj5;

public class Person {

	protected String m_name;
	protected int m_id;
	protected String m_address;

	public Person(String m_name, int m_id) {
		this.m_name = m_name;
		this.m_id = m_id;
		
		int x = 1;


	}

	public Person(String m_name) {
		this(m_name, -1);
	}
	
	// solution 1
	// public Person() { }
	
	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	
	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}

	public String getM_address() {
		return m_address;
	}

	public void setM_address(String m_address) {
		this.m_address = m_address;
	}

	@Override
	public String toString() {
		return "Person [m_name=" + m_name + ", m_id=" + m_id + ", m_address=" + m_address + "]";
	}
	
	
	
}
