package proj4;

public class Dog extends Animal {
	
	protected boolean m_is_guard;

	public Dog(String m_name, float m_height, int m_age, boolean is_guard) {
		
		super(m_name, m_height, m_age);
		this.m_is_guard = is_guard;
	}
	
	@Override	
	public void make_sound() {
		System.out.println("raf raf");
	}	

	@Override
	public void jump() {
		System.out.println("dog is jumping...");
	}
	
	public boolean isM_is_guard() {
		return m_is_guard;
	}

	public void setM_is_guard(boolean m_is_guard) {
		this.m_is_guard = m_is_guard;
	}

	
	@Override
	public String toString() {
		return "Cat [m_is_guard=" + m_is_guard + " " + super.toString() + " " + "]";
	}
	
}