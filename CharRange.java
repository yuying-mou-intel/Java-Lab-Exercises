import java.util.Arrays;

class CharRange{
    // String char;
    Character c;
    
    public CharRange(Character c){
        this.c = c;
    }

    public boolean isCapital(){
        if(c <= 'Z' && c >='A')
            return true;
        return false;
    
    }
    public boolean isRoman(){
        Character[] roman = {'M','D','C','L','V','I'};
        // ArrayList<Character> roman = new ArrayList<Character> ();
        // roman.add('M','D','C','L','V','I');
        // for(int i = 0; i < roman.size(); i++)
        //     if(character == roman[i])
        //         return true;
        return Arrays.asList(roman).contains(c);

    }

    public static void main(String[] args){
        Character t = args[0].charAt(0);
        CharRange x = new CharRange(t);

        System.out.println(x.isCapital());
        System.out.println(x.isRoman());
    }
}