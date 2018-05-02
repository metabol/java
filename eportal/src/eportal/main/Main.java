/**
 * 
 */
package eportal.main;
import java.util.ArrayList;
import java.util.List;

import eportal.staff.*;
import eportal.student.*;

/**
 * @author Jonathan
 *
 */
public class Main {

	/**
	 * @param args
	 
	
	
	private Student student;
	private Staff staff;
	private List allStudents;
	private List allStaff;
	*/
	
	
	/** Entry point class */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Student student1 = new Student("Jony Bravo",21);
		Student student2 = new Student("Homer Simpson",51);
		
		List<Student> allStudents = new ArrayList<Student>();
		allStudents.add(student1);
		allStudents.add(student2);
		
		System.out.println("*****Student list****");
		printAll(allStudents);
		
		
	}
	
	/**Generic method to Print List members */
	public static <E> void printAll(List<E> mylist){
		int count = 1;
		for(E element: mylist){
			System.out.printf(count + ". %s ", element.toString());
			count++;
			System.out.println();
		}
	}
	

}
