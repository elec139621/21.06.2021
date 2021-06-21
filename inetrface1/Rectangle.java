package proj7;

public class Rectangle extends Shape {
	
	protected double m_width;
	protected double m_height;

	public double getM_height() {
		return m_height;
	}

	public void setM_height(double m_height) {
		this.m_height = m_height;
	}

	public double getM_width() {
		return m_width;
	}

	public void setM_width(double m_width) {
		this.m_width = m_width;
	}

	public Rectangle(String m_name, double m_width, double m_height) {
		super(m_name);
		this.m_width = m_width;
		this.m_height = m_height;
	}

	@Override
	public String toString() {
		return "Rectangle [m_width=" + m_width + ", m_height=" + m_height + 
				" " + super.toString() + " ]";
	}
	
	
}
