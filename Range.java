public class Range{
	public static void main (String args[]) {
		int i = Integer.parseInt(args[0]);
 		int j = Integer.parseInt(args[1]);
		int m;

	if (i < j){
		m = i + j;		
		System.out.println("The sum is " + m);
	}else{
		System.out.println("Error");
		}
	}
}
