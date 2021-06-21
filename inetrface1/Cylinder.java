package proj7;

public class Cylinder extends Shape implements IHaveRadius {

	protected double m_radius;
	protected double m_height;
	
	@Override
	public double getRadius() {
		return m_radius;
	}
	
	public double getM_height() {
		return m_height;
	}
	public void setM_height(double m_height) {
		this.m_height = m_height;
	}
	public double getM_radius() {
		return m_radius;
	}
	public void setM_radius(double m_radius) {
		this.m_radius = m_radius;
	}
	
	public Cylinder(String m_name, double m_radius, double m_height) {
		super(m_name);
		this.m_radius = m_radius;
		this.m_height = m_height;
	}
	@Override
	public String toString() {
		return "Cylinder [m_radius=" + m_radius + ", m_height=" + m_height + 
				" " + super.toString() + " ]";
	}
	
	
}
