import java.util.Random;
import java.util.Scanner;
public class GuessGame{
	
	public static int createMagicNumber(){
		magicNumber numbertoGuess = new magicNumber (magicNumber.createmagicNumber());
		int value_numbertoGuess = numbertoGuess.getNumber();
		return value_numbertoGuess; 
	}
	
	public static boolean checkTheNumber(int value_numbertoGuess, boolean notGuessed){
		System.out.println("Guess a number between 1 and 100: ");
		Scanner input = new Scanner(System.in);		
		int guess = input.nextInt();
		if (guess == value_numbertoGuess){
				System.out.println("Correct Guess!!!!");
				notGuessed = false;	
			}
		return notGuessed;
				
	}	
	
	public static void main(String[] args){
		int value_numbertoGuess = createMagicNumber();
		System.out.println(value_numbertoGuess);
		boolean notGuessed = true; 
		while (notGuessed){
			notGuessed = checkTheNumber(value_numbertoGuess, notGuessed);
		}

	}

}



//import java.util.Random;
//import java.util.Scanner;
//public class GuessGame{
//	public static void main(String[] args){
//		Random rand = new Random();
//		int numberToGuess = rand.nextInt(100);
//		int numberOfTries = 0;
//		Scanner input = new Scanner(System.in);
//		int guess;
//		boolean win = false;
//
//		while(win == false){
//		
//			System.out.println("Guess a number between 1 and 100: ");
//			guess = input.nextInt();
//			numberOfTries++;
//
//			if(guess == numberToGuess){
//				win = true;
//			}else if(guess < numberToGuess){
//			System.out.println("Your guess is too low");
//			}else if(guess > numberToGuess){
//				System.out.println("Your guess is too high");
//			}
//		}
//		System.out.println("You win!");
//		System.out.println("The number was" + numberToGuess);
//		System.out.println("It took you " + numberOfTries + "tries");
//		
//	}
//}

