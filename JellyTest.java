public class JellyTest{
    public static void main(String[] args){
        BlueJelly b = new BlueJelly(-1);
        System.out.println(b.type);
        System.out.println(b.health);
        System.out.println(b.isAlive());
        
        RedJelly r = new RedJelly(999);
        System.out.println(r.isAlive());
        System.out.println(r.type);
        System.out.println(r.health);
    }
}