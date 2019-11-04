public class Square{
	int length;
	
	public Square(int x){
		length = x;
	}
 	public int Calarea(){
		int area;
		return area = length * length;
	}	
	
	public static void main(String[] args){
		Square one = new Square(10);
		Square two = new Square(35);
		System.out.println(one.Calarea());
		System.out.println(two.Calarea());
	}
}
