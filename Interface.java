interface Arith1  
{ 
 public void calculate(int a, int b); // Interface 
 } 
 
class Add implements Arith1
{ 
  public void calculate(int a, int b)
  { 
    int result = a + b;
    System.out.println("Sum:" +result); 
   } 
  
} 
 
class Subtract implements Arith1 
 { 
	 public void calculate(int a, int b)
  { 
    int result = a - b; 
    System.out.println("Subtract:" +result);
   
  }  
} 
 
 class Multiply implements Arith1 
 { 
  public void calculate(int a, int b)
  { 
    int result = a * b; 
    System.out.println("Multiplication:" +result);
  } 
} 
 
public class Interface
{ 
	public static void main(String[] args) 
 { 
   Arith1 a;	 
   
   Add a1 = new Add(); 
   a=a1;
   a.calculate(20, 30);
   
   Subtract s = new Subtract(); 
   a=s;
   a.calculate(10, 5);
 
   Multiply mul = new Multiply(); 
   a=mul;
   a.calculate(10, 20); 
  } 
}

