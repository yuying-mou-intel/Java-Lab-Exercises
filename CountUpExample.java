/** 
 * This is my first properly documented piece java code.
 * When the javadoc tool is run over this code, it will 
 * HTML maintenance manual.
 * @author Yuying Mou
 * @version 1.0
 */
public class CountUpExample {

      /** 
       * This method counts up from 1
       * to a specific number. It will print its progress to the 
       * command line.
       * @param count The number to count from.
       */
	public void countUp(int count) {
	    /* Note: if there are no brackets after a for 
             * loop it is only the the sentance that 
             * immediatly follows that is part of the loop 
             */
		for (int i = 1; i <= count; i++)
			System.out.println(i);
		
		System.out.println("\nAll done!");
	}

      /**
       * Main now only creates a new instance of my 
       * program and calls the program's method.
       * @param args This program does not use this parameter.
       */
	public static void main (String[] args) {
	    CountUpExample q = new CountUpExample();
            q.countUp(5);
	}
}
