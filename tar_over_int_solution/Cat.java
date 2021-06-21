package proj4;

public class Cat extends Animal implements ISoudner{

//	private String m_name;
//	private float m_height;
	protected boolean m_is_siami;

	public Cat(String m_name, float m_height, int m_age, boolean m_is_siami) {
		
		super(m_name, m_height, m_age);
		this.m_is_siami = m_is_siami;
	}
	
	//public abstract void make_sound();
	@Override	
	public void make_sound() {
		System.out.println("miawwwwwwwwwww");
	}
	
	@Override
	public void jump() {
		System.out.println("cat is jumping...");
	}

	public boolean isM_is_siami() {
		return m_is_siami;
	}

	public void setM_is_siami(boolean m_is_siami) {
		this.m_is_siami = m_is_siami;
	}

//	public float getM_height() {
//		return m_height;
//	}
//
//	public void setM_height(float m_height) {
//		this.m_height = m_height;
//	}
//
//	public String getM_name() {
//		return m_name;
//	}
//
//	public void setM_name(String m_name) {
//		this.m_name = m_name;
//	}

//	@Override
//	public String toString() {
//		return "Cat [m_name=" + m_name + ", m_height=" + m_height + ", m_is_siami=" + m_is_siami + "]";
//	}

	
	@Override
	public String toString() {
		return "Cat [m_is_siami=" + m_is_siami + " " + super.toString() + " " + "]";
	}


	
}