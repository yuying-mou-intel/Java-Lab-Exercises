public class MonthConverter{
	public static void main(String args[]){
		int month = Integer.parseInt(args[0]);
		String month_name = "";
		if(month == 1)
			month_name = "January";
		System.out.println("Month" + " " + args[0] + " " + "is" + " " + month_name);
	}
}
