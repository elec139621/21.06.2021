package proj5;

public class Cat {

	protected String m_name; // default null
	protected float m_height; // default 0.0f
	protected int m_age;  // default 0
	protected boolean m_is_siami; // default false
	

	public Cat(String m_name, float m_height, int m_age, boolean m_is_siami) {
		this.m_name = m_name;
		this.m_height = m_height;
		this.m_age = m_age;		
		this.m_is_siami = m_is_siami; 	
	}
	
	// ctor overloading
	public Cat(String m_name, float m_height, int m_age) {
		this(m_name, m_height, m_age, false);
		//this.m_name = m_name;
		//this.m_height = m_height;
		//this.m_age = m_age;		
		//this.m_is_siami = false; 
	}
	
	public void make_sound() {
		System.out.println("miawwwwwwwwwww");
	}
	
	public void jump() {
		System.out.println("cat is jumping...");
	}

	public boolean isM_is_siami() {
		return m_is_siami;
	}

	public void setM_is_siami(boolean m_is_siami) {
		this.m_is_siami = m_is_siami;
	}

	@Override
	public String toString() {
		return "Cat [m_name=" + m_name + ", m_height=" + m_height + ", m_age=" + m_age + ", m_is_siami=" + m_is_siami
				+ "]";
	}

	
}