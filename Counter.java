public class Counter{
	private int count;
	private int max;
	
	public Counter(){
	count = 0;
	max = 10;
	}
	
	public int getCount(){
		return count;	
	}
	
	public int getMax(){
		return max;			
	}
	
	public void setCount(int n){
		count = n;		
	}
	
	public void setMax(int n){
		max = n;		
	}

	public void increase(int n){
		count = n + 1; 	
		if(count == max){
			count = 0;
		}
	}

	public void decrease(int n){
		if(n > 0){
			count = n - 1;			
		}else if(n == 0){
			count = 0;
		}
	}
	public void reset(){
		count = 0;
		System.out.println("Counter Reset!");
	}

	public String toString(){
		return "count is " + count;
	
	}
	public void Nincrease(int n){
		count = n + n;	
	}
	public void Ndecrease(int n){
		count = n - n;
	}
}
