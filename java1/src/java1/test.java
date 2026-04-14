package java1;

class School { 
    // This is a method in class School
    public void print() { 
		System.out.println("Hi! I class SCHOOL."); 
    } 
} 
// This is the class named Student
class Student { 
	// This is a method in class Student
    public void print() { 
		System.out.println("Hi! I am class STUDENT"); 
    } 
}

public class test{ 
    public static void main(String args[]){
    	Student stud = new Student();
    	stud.print();
    	School sch = new School();
    	sch.print();
    }
    }
