package proj6;

public class Person {

	protected String m_name;
	protected int m_id;
	
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	
	public Person(String m_name, int m_id) {
		super();
		this.m_name = m_name;
		this.m_id = m_id;
	}
	
	// ** ETGAR
	public static String toHex(int decimal){    
	     int rem;  
	     String hex="";   
	     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
	    while(decimal>0)  
	     {  
	       rem=decimal%16;   
	       hex=hexchars[rem]+hex;   
	       decimal=decimal/16;  
	     }  
	    return hex;  
	}    
	
	
	
	// **ETGAR
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof Person == false) 
			return false;
		Person p = (Person)obj;
		return this.m_id == p.m_id; 
	}

	// **ETGAR
	@Override
	public int hashCode() {
		return this.m_id;
	}
	
	// proj6.Person@106d69c
	@Override
	public String toString() {
		//return "Person [m_name=" + m_name + ", m_id=" + m_id + "]";
		return "".format("%s@%s", this.getClass().toString().split(" ")[1], 
				toHex(this.hashCode()).toLowerCase());
	}

	
	
}
