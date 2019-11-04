import java.util.Scanner;
public class ScannerExample{
public static void main(String args[]){
	Scanner gs = new Scanner(System.in);
	System.out.print("Enter your name: ");
	String name = gs.nextLine();
	System.out.println("Name is: " + name);
	}
}
