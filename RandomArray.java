/**
 *  A class that represents a random array
 *
 *@author     Ling Ma
 *@created    Jan 19, 2009
 */
public class RandomArray {

	private int[] numbers; //instance variable

	/**
	 *  Constructor
	 *
	 *@param  size  The size of the array
	 */
	public RandomArray(int size){
		numbers = new int[size];
		for(int i=0; i<numbers.length;i++){
			numbers[i] = (int)(Math.random()*10); // a random number between 0-9
		}
	}
	
	/**
	 *  a method to print the array elements
	 */
	
	public void printArray(){
		//WRITE YOUR CODE HERE
		for(int j=0; j<numbers.length;j++){
			System.out.println(numbers[j]+ " ");
		}
	}
	
	/**
	 *  A method to calculate the sum of all elements
	 *
	 *@return    The sum
	 */
	public int calSum(){
		//WRITE YOUR CODE HERE
		int sum = 0;
		for(int k=0; k<numbers.length; k++){
			sum += numbers[k];
		}
		return sum;
	}

	/**
	 *  A method to calculate the mean of all elements
	 *
	 *@return    The mean
	 */
	public double calMean(){
		//WRITE YOUR CODE HERE
		int mean;
		int sum = calSum();
		int count = numbers.length;
		mean = sum / count;
		return mean;
	}
    
    /**
     *  a method to print the array elements in reverse order
     */
    public void printReverse(){
        //WRITE YOUR CODE HERE
        for(int i=(numbers.length - 1); i >= 0; i--){
			System.out.println(numbers[i]+" ");
		}
    }
	
	/**
	 *  A main method to test
	 */
	public static void main(String[] args) {
		// Check to see if the user has actually sent a paramter to the method
		if (args.length != 1){
			System.out.println("Usage: java RandomArray <NUM>. Example: java RandomArray 5");
			System.exit(-1);
		}

		// Create an instance of the class 
		RandomArray test = new RandomArray(Integer.parseInt(args[0]));

		
		// Print the array
		test.printArray();
		
		// Calculate the sum of all the values in the array and print it
		System.out.println("Sum: "+ test.calSum());
		
		// Calculate the mean of all the values in the array and print it
		System.out.println("Mean: "+ test.calMean());
        
        System.out.print("Reverse: ");
        test.printReverse();
	}

}
