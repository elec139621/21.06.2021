package proj7;

public class Shape {

	protected String m_name;

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public Shape(String m_name) {
		super();
		this.m_name = m_name;
	}

	@Override
	public String toString() {
		return "Shape [m_name=" + m_name + "]";
	}
	
	
	
}
