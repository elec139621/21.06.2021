package proj7;

public class Circle extends Shape implements IHaveRadius {

	protected double m_radius;

	public double getM_radius() {
		return m_radius;
	}

	public void setM_radius(double m_radius) {
		this.m_radius = m_radius;
	}

	@Override
	public double getRadius() {
		return m_radius;
	}
	
	public Circle(String m_name, double m_radius) {
		super(m_name);
		this.m_radius = m_radius;
	}

	@Override
	public String toString() {
		return "Circle [m_radius=" + m_radius + 
				" " + super.toString() + " ]";
	}


	
	
}
