public class Exercise13{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		for(int i = 1; i <= n; i++){
			for(int j = n-i; j > 0; j--){
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
		// 完成一次outer loop后，换行。
		System.out.println();


		}
	}
}