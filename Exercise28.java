import java.util.*;

public class Exercise28{
/*	public static void main(String[] args){
	
	String[] myTest = {"Yuying Mou", "female", "ffstnt@outlook.com"};
	
	for(int i = 0; i < myTest.length; i++){
		System.out.println(myTest[i]);	

	}

}
}
*/

	public static void main(String[] args){

	ArrayList<String> myTest = new ArrayList<String>();
	myTest.add("Yuying Mou");
	myTest.add("female");
	myTest.add("ffstnt@outlook.com");

	for(int i = 0; i < myTest.size(); i++){
		System.out.println(myTest.get(i));
	}
}
}	
