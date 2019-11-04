public class MyCircle{
	public static void main(String args[]){
	double PI = 3.1415926;
	double radius = Double.parseDouble(args[0]);
	double circumference = 2 * radius * PI;
	double area = 4 * radius * radius * PI;
  	
	System.out.println("The radius of the circle is "+ radius+"cm");
	System.out.println("The circumference is " + circumference);
	System.out.println("And its area is "+ area);
	}
}
