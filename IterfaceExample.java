import java.lang.Math;

interface Cylcone{
	double Volume(int r, int h );
       }

class Cylinder implements Cylcone{
	int  radius,height;
	public double Volume(int r, int h )
	{
		radius=r;
		height=h;
		return Math.PI*radius*radius*height;
	}
}

class Cone implements Cylcone{
	int  radius,height;
	public double Volume(int r, int h )
	{
		radius=r;
		height=h;
		return 1.0/3*Math.PI*radius*radius*height;
	}
}
public class IterfaceExample {
		    public static void main (String[] args) 
		    {
		   Cylcone c;

		   Cylinder cyl= new Cylinder();
		    c=cyl;	    
		   System.out.printf(" The volume of the cylinder is %.2f\n",c.Volume(5,8));
		   
		   Cone co= new Cone();
		    c=co;	    
	   System.out.printf(" The volume of the cone is %.2f",c.Volume(5,8));	  	      		    }
		}





