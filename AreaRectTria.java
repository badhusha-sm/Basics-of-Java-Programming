import java.lang.Math;

//Method overloading  (basic- Methodoverloading.java)

class Area {
double triarea(float a, float b, float c) {
	float s;
	s=(a+b+c)/2;
 return Math.sqrt(s*(s-a)*(s-b)*(s-c));
					}
double rectarea(float l, float b) {
 return  l*b;
			}
}
public class AreaRectTria{
public static void main(String args[]) {
 Area a = new Area();
 
 double rectangle = a.rectarea(5.1f, 8.12f);
 System.out.printf("Area of ractangle is %.2f ",rectangle);
 System.out.println("");

 double triangle = a.triarea(5.1f,4.2f,3.5f);
 System.out.printf("Area of triangle is %.2f ",triangle);
 System.out.println("");
}

}





