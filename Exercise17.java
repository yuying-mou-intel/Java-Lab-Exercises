import java.util.Scanner;
import java.io.*;
public class Exercise17{
	public static void main(String[] args){
	Scanner myScanner = new Scanner(System.in);
		System.out.print("Please enter string: ");
	String s = myScanner.nextLine();
	String sn = "";
	String snew = "";
	String ssnew = "";
	s = s.replaceAll("[^a-zA-Z]", "");
	
	int length = s.length();
	for(int i = 0; i < length; i++){
		Character c = s.charAt(i);
			if(Character.isLowerCase(c)){
			sn = sn + Character.toUpperCase(c);
			
			}else if(Character.isUpperCase(c)){
			sn = sn + Character.toLowerCase(c);
			}
	}
	for(int j = length-1; j>=0; j--){
		Character n = sn.charAt(j);		
		snew = snew + n; 
	
	}

	// remove whitespace
	for(int k = 0; k < snew.length(); k++){
			if(!Character.isWhitespace(snew.charAt(k))){
					ssnew += snew.charAt(k);
			}
		}
	System.out.println(ssnew);
	}
}