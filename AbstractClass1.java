 abstract class Arith2
{ 
  protected int a, b,c,d;// To be inherited to derived class

  abstract int calculate(); // Abstract method. 
 
  
  abstract void dispdata();// non-abstract method
 
 } 
 class Addition1  extends Arith2
{ 
	  Addition1(int a, int b, int c )
	  {
		  this.a=a;
		  this.b=b;
		  this.c=c;
	  }
  int calculate()
  { 
    return (a+b+c);  
   } 
  void dispdata()// non-abstract method
  {
	  System.out.println("Sum:" +calculate()); 
  }
} 
 
 class Subtraction1 extends Arith2
 { 
	 Subtraction1(int a, int b)
	  {
		  this.a=a;
		  this.b=b;
	  }
 int calculate()
 { 
   return (a-b);  
  } 
  void dispdata()// non-abstract method
  {
	  System.out.println("Subtract:" +calculate());  
  }
  
} 
 
 class Multiplication1 extends Arith2 
 { 
	 
   Multiplication1(int a, int b, int c, int d)
   {
	      this.a=a;
		  this.b=b;
		  this.c=c;
		  this.d=d;
	  }
   
  int calculate()
  { 
    return a*b*c*d; 
    
  } 
  
  void dispdata()// non-abstract method
  {
	  System.out.println("Multiplication:" +calculate());  
  } 

 }
public class AbstractClass1
{ 
 public static void main(String[] args) 
 { 
   Addition1 		a = new Addition1(20,30,40); 
   Subtraction1 	s = new Subtraction1(60,40);
   Multiplication1 	m = new Multiplication1(60,40,20,10);
  // Multiplication1	m = new Multiplication1(); 
    
    a.calculate();
    a.dispdata(); 
    s.calculate(); 
    s.dispdata(); 
    m.calculate(); 
    m.dispdata(); 
   // m.calculate(10, 20); 
  //  m.dispdata(); 
  } 
}
