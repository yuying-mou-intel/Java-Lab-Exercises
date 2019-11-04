import java.util.Scanner;
public class ScannerExample2{
	public static void main(String args[]){
	Scanner gs = new Scanner(System.in);
	String example = gs.nextLine();
	String new_example = example.replaceAll("\\W]|_", "");
	System.out.println(new_example);
	}
}
