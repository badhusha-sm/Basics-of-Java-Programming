package classobj;
class Volume
{
private double length,breadth, height;
 Volume(double length, double breadth, double height)
 {
 this. length=length;
 this.breadth=breadth;
  this.height=height;
  }
  
  public void printVolume()
  {
  System.out.printf("The volume of cuboid is : %.2f", length* breadth* height);
  }
  }
  
 public class Volume_Cuboid
  {
  public static void main(String [] args)
{
Volume v= new Volume(6,7,8);
v.printVolume();
}
}
