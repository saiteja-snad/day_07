package day07part;
import java.util.*;

class student{
	int id;
	String name;
	String course;
	 
	student(int id,String name,String course){
		this.id=id;
		this.name=name;
		this.course=course;
	}
	
	 public void displayStudent() {
		System.out.println("id "+id+" name "+name+" course "+course);
	}
	 
	 public void updateCourse(String subject) {
		 this.course=subject;
		 
	 }
}

public class StudentManagement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	student obj1=new student(sc.nextInt(),sc.next(),sc.next());
	student obj2=new student(sc.nextInt(),sc.next(),sc.next());
	student obj3=new student(sc.nextInt(),sc.next(),sc.next());
	obj1.displayStudent();
	obj2.displayStudent();
	obj3.displayStudent();
	
	obj2.updateCourse(sc.next());
	obj2.displayStudent();
	sc.close();
}

}
