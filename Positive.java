import java.util.*;

public class Positive{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
		System.out.println("please input: ");
	double a = scan.nextDouble();
	double b = scan.nextDouble();

	try{

		System.out.println(Math.abs(Math.abs(a)-Math.abs(b)));

	}
	catch(Exception e){
		System.out.println("something is wrong");
	}


	}
}