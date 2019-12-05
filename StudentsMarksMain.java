import java.util.Scanner;
import java.util.ArrayList;;

public class StudentsMarksMain{
    public static void main(String args[]){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("please insert the mark: ");
        StudentMarks test = new StudentMarks();
        //scanner input 7 marks
        for(int i=0; i<7; i++){
            int mark = myScanner.nextInt();
            test.setMark(i, mark);
        }
        myScanner.close();

    System.out.println(test.calMean());
    ArrayList<Integer> index = test.findMax();
    
    for(int i : index){
        System.out.println(i);
    }
    }
}