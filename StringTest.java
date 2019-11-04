import java.util.Scanner;
public class StringTest{
public static void main(String args[]){
	Scanner gs = new Scanner(System.in);
	System.out.print("Enter your name: ");
	String str = gs.nextLine();
	System.out.println(str);
	System.out.println(str.length());
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	System.out.println(str.charAt(0));
	System.out.println(str.charAt(str.length()-1));
	System.out.println(str.trim());
	}
}
