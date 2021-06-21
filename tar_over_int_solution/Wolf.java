package proj4;

public class Wolf extends Dog {

	protected String m_pack_name;
	
	@Override
	public void jump() {
		System.out.println("wolf is jumping...");
	}
	
	@Override	
	public void make_sound() {
		System.out.println("awwwwwwwwww");
	}	
	
	@Override
	public boolean isM_is_guard() {
		return true;
	}
	

	public String getPack_name() {
		return m_pack_name;
	}

	public void setPack_name(String pack_name) {
		this.m_pack_name = pack_name;
	}

	public Wolf(String m_name, float m_height, int m_age, boolean is_guard, 
			String pack_name) {
		super(m_name, m_height, m_age, is_guard);
		m_pack_name = pack_name;
	}

	@Override
	public String toString() {
		return "Wolf [pack_name=" + m_pack_name + " " + super.toString() + " " + "]";
	}
	
	

}
