import java.lang.*;
public class Exercise9{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = 0;
		if(a > b){
			System.out.println("error");
		}else{
			for(int i = a; i <= b; i++){
				c += i;
				System.out.println(c);
			}
			
		}

	}
}