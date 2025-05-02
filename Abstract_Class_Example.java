package AbstractClass;

public class Abstract_Class_Example{

	public static void main(String[] args) {
		IA1 i1=new IA1(45,56,78);
		System.out.println("The total mark is "+i1.TotalCalculate());
		System.out.printf("The Average mark is %.2f\n",i1.AvgCalculate());
		
		IA2 i2=new IA2(65,75,80);
		System.out.println("The total mark is "+i2.TotalCalculate());
		System.out.printf("The Average mark is %.2f",i2.AvgCalculate());
	}

}

abstract class Test {
        int mark1,mark2,mark3;
		abstract public int TotalCalculate();
		abstract public double TotalAvg();
}


class IA1 extends Test{
	IA1(int mark1, int mark2, int mark3)
	{
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
   public int TotalCalculate()
   {
	   return this.mark1+this.mark2+this.mark3;
   }
   public double AvgCalculate()
   {
	   return TotalCalculate()/3.0;
   }
}

class IA2 extends Test{
	IA2(int mark1, int mark2, int mark3)
	{
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
   public int TotalCalculate()
   {
	   return this.mark1+this.mark2+this.mark3;
   }
   public double AvgCalculate()
   {
	   return TotalCalculate()/3.0;
   }
}



