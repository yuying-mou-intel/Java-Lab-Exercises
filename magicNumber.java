import java.util.Random;

public class magicNumber{
	
	int number;

	public magicNumber(int number){
	this.number = number;	
	}
	
	public int getNumber(){
		return number;	
	}		
	
	public static int createmagicNumber(){
		Random rand = new Random();
		int numberToGuess = rand.nextInt(100);
		return numberToGuess;
	}

	public static void main(String[] args){
		
	}
}

