import java.util.Scanner;
public class HelloScanner{
	public static void main(String args[]){
	Scanner reader = new Scanner(System.in);
	System.out.print("Enter your first name: ");
	String first = reader.next();

	System.out.print("Enter your last name: ");
	String last = reader.next();

	System.out.print("Enter your e-mail: ");
	String email = reader.next();

	System.out.println("Hi " + first + "!");
	System.out.println("Your e-mail address is: " + email + ".");
	}

	public boolean checkLength(String str){
	if(first.length <= 3 && last.length <= 3){
		System.out.println("please input a string with over 3 characters");
	}else{
		return true;
		}
	} 

	public boolean checkEmail(String str){
	if(email.indexOf('@') != -1 && email.indexOf('.' != -1)){
		return ture;
		}
	else{
		System.out.println("there is no '@' or '.' in email");
		}
	}
	public void main(String[] args){
		checkLength first = new checkLength();
		checklength last = new checkLength();
		checkEmail email = new checkEmail();	
	first.checkLength(first);
	last.checkLength(last);
	email.checkEmail(email);	
	}
}
