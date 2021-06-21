package proj5;

public class Employee extends Person {

	protected double m_salary;
	
	public Employee(String m_name, int m_id, double salary) {
		// invoke base [parent] ctor
		// this () -- same class
		// super -- base class
		super(m_name, m_id);
		m_salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [m_salary=" + m_salary + " " + super.toString() + " ]";
	}
	
}
