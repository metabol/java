package eportal.staff;

public class Staff {
    
	/**
	 * @author JONATHAN
	 * @since 2018-05-02
	 * @title  ePortal
	 * @version v1.0.0
	 */
	
	/** Staff properties */
	private String name;
	private int course;
	
	
	public Staff(){
		System.out.println("Staff");
	}
	
	/** Returns Staff name */
	public String getName(){
		return this.name;
	}
	
	/** Changes Staff name */
	public void setName(String name){
		this.name = name;
	}
	
	/** Returns Staff course */
	public int getCourse(){
		return this.course;	
	}
	
	/** Changes Staff course */
	public void setCourse(int course){
		this.course = course;
	}
	
}
