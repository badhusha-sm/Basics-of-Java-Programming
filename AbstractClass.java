 
abstract class Arith 
{ 
  protected int result;// To be inherited to derived class
 
  abstract void calculate(int a, int b); // Abstract method. 
  
  void dispdata()// non-abstract method
  {
	  System.out.println("This is to display data in abstract class");
  }
  
 } 
 class Addition extends Arith
{ 
  void calculate(int a, int b)
  { 
    result = a + b;  
   } 
  void dispdata()// non-abstract method
  {
	  System.out.println("Sum:" +result); 
  }
} 
 
 class Subtraction extends Arith 
 { 
  void calculate(int a, int b)
  { 
    result = a - b; 
   
  } 
  
  void dispdata()// non-abstract method
  {
	  System.out.println("Subtract:" +result);  
  }
  
} 
 
 class Multiplication extends Arith 
 { 
  void calculate(int a, int b)
  { 
    result = a * b; 
    
  } 
  
  void dispdata()// non-abstract method
  {
	  System.out.println("Multiplication:" +result);  
  }
} 
 
public class AbstractClass
{ 
 public static void main(String[] args) 
 { 
   Addition 		a = new Addition(); 
   Subtraction  	s = new Subtraction(); 
   Multiplication	m = new Multiplication(); 
    
    a.calculate(20, 30);
    a.dispdata(); 
    s.calculate(10, 5); 
    s.dispdata(); 
    m.calculate(10, 20); 
    m.dispdata(); 
  } 
}
