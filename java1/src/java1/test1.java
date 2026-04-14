package java1;


//This is the main class Question
public class test1{ 
 public static void main(String[] args) { 
     // Object of the main class is created
	 test1 q = new test1();
	 test1.Question a = q.new Question();
     // Print method on object of Question class is called
      a.studentMethod(q);
 }
 
 // 'print()' method is defined in class Question
 void print(){
     System.out.print("Well Done!");
 }
//Define a method named 'studentMethod()' in class Question
//Call the method named 'print()' in class Question
class Question{
   public void studentMethod(test1 a){
         a.print();
    }
}
}