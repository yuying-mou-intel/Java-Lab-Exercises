import java.util.Arrays;
class Exercise20{

    public static void main(String[] args){
        int count = 0;
        Character [] vowel = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(int i = 0; i < args[0].length(); i++)
            if(Arrays.asList(vowel).contains(args[0].charAt(i)))
                count = count + 1;
        
        System.out.println(count);

    }
}