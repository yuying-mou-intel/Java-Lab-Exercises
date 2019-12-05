
import java.util.ArrayList;
public class StudentMarks{
    
    private double[] marks = new double[7];

    public double getMarks(int pos){
        return marks[pos];
    }
    public void setMark(int pos, double mark){
        marks[pos] = mark;
    }
    
    public double calSum(){
        double sum = 0;
        for(double i : marks){
            sum += i;
        }
        return sum;
    }
    public double calMean(){
        int count = marks.length;
        double mean;
        mean = calSum() / count;
        return mean;
    }

    public ArrayList<Integer> findMax(){
        double tmp = marks[0];
        ArrayList<Integer> index = new ArrayList<Integer>();
        for(int i = 0; i<7; i++){
            if(tmp < marks[i]){
                tmp = marks[i];
                index.clear();
                index.add(i);
            }
        
            else if(tmp == marks[i]){
                index.add(i);
            }
    
        
        }
        return index;
    }   
}