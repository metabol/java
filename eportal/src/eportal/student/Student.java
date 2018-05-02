package eportal.student;

public class Student {
    
	/**
	 * @author JONATHAN
	 * @since 2018-05-02
	 * @title  ePortal
	 * @version v1.0.0
	 */
	
	/** Student properties */
	private String name;
	private int age;
	
	
	public Student(String name, int age){
		this.setAge(age);
		this.setName(name);
	}
	
	public Student(){
		System.out.println("Student");
	}
	
	/** Returns Student name */
	public String getName(){
		return this.name;
	}
	
	/** Changes Student name */
	public void setName(String name){
		this.name = name;
	}
	
	/** Returns Student age */
	public int getAge(){
		return this.age;	
	}	
	/** Changes Student age */
	public void setAge(int age){
		this.age = age;
	}
	
	/** Print object as string */
	public String toString(){
		String mystudent = this.getName() + ":" + this.getAge();
		return mystudent;
	}
}
