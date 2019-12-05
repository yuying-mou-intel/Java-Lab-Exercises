
public class Jelly {

	public int type; // to indicate which colour the Jelly is.
	public int health; // health of the Jelly (max health is 100, minimum health is 0).
	public String name;
	
	public Jelly(int type, int health){
		this.type = type;
		this.health = health;		
	}
	public Jelly(int health){
		this.health = health > 100?100 : health < 0?0: health;
	}
		
	public Jelly(){
		this.health = 100;
	}

	public boolean isAlive(){
		return this.health>0;
	}

}
