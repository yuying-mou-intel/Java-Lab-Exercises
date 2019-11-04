import java.util.Scanner;
public class Positive{
	public static void main(String[] args){
	Scanner myScanner = new Scanner(System.in);
		System.out.println("please input a value: ");
	double value = myScanner.nextDouble();
	
	if(value >= 0){
		Scanner myScanner1 = new Scanner(System.in);
		System.out.println("please input another value: ");
		double value01 = myScanner1.nextDouble();
		
			if(value >= value01){
			double result = value - value01;
			System.out.println(result);
			}else{
				double result01 = value01 - value;
				System.out.println(result01);
				}
	}
	else{
		System.out.println(Math.abs(value));
	}		
	
		
	}
}

		
