import java.util.Scanner;
public class ScannerExample1{
	public static void main(String args[]){
		String s = "Hello, The lab really sucks!";
		Scanner gs = new Scanner(s);
		System.out.println("Boolean Result:" + gs.hasNext());
		System.out.println("String: " + gs.nextLine());
		gs.close();

		System.out.println("-----Enter Your Details-----");
		Scanner gs1 = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = gs1.next();
		System.out.println("Name: " + name);
		System.out.print("Enter your age:");
		
		int i = gs1.nextInt();
		System.out.println("Age: " + i);
		System.out.print("Enter your salary:");
		double d = gs1.nextDouble();
		System.out.println("Salary: " + d);
		gs1.close();
	}
}
