public class BMICalculator{
	public static void main(String args[]){
	double weight = Integer.parseInt(args[0]);
	double height = Integer.parseInt(args[1]);
	double BMI =  (weight / height / height) * 10000;
	System.out.println("Your weight: "+args[0]);
	System.out.println("Your height: "+args[1]);
	System.out.println("your BMI: "+ BMI);
	if(BMI < 18.5) {
		System.out.println("you are in the underweigth range");
	} else if(BMI > 18.5 && BMI < 24.9) {
		System.out.println("you are in the normal range");
	} else if(BMI > 25 && BMI < 29.9) {
		System.out.println("you are in the overweight range");
	} else if(BMI >= 30) {
		System.out.println("you are in the obese range");
	}
}
}
