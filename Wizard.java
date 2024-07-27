

public class Wizard implements Lockable{
		
	private String name;
	private int health;
	private int key;
	boolean locked;
		
		
	public Wizard() {
		this.name = "";
		this.health = 0;
		this.key = 0;
		this.locked = false;
		}//end empty-argument constructor
		
		
	public Wizard(String name) {
		setName(name);
		setHealth(health);
		this.key = 0;
		this.locked = false;
		}//end preferred constructor
		
	public String getName() {
	
		return name;
		
		}//end getName
		
	public void setName(String name) {
	
		this.name = name;
		
		}//end setName
		
		
	public int getHealth() {
	
		return health;
		
		}//end getHealth
		
		
	public void setHealth(int health) {
		
		this.health = health;
		
		}//end setHealth
		
		
	public int getKey() {
		
		return key;
		
		}//end getKey

	@Override
	public void setKey(int key) {
	
		if(key > 0 && this.key == 0)
			this.key = key;
		else
			this.key = 0;
	}//end setKey

	@Override
	public void lock(int key) {
		
		if(this.key == 13) {
			locked = true;
			System.out.println("Key successfully locked!");
		}
		else {
			locked = false;
			System.out.println("Incorrect key.");
			}
		}// end lock method
		
	@Override
	public void unlock(int key) {
		
		if(this.key == 13) {
			locked = false;
		}
		else {
			locked = true;
			}
	}//end unlock method

	@Override
	public boolean isLocked() {
		
		return locked;
	}//end isLocked method
	
	public void takeDamage(int power) {
		if (!locked) {
			this.health -= power;
			System.out.println("Health after damage: "+ health);
		}
			if (this.health < 0) {
	            this.health = 0;
			}
	            if(locked) {
	            	System.out.println("No damage taken.");
	            }
	}//end takeDamage
		
	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
		}//end toString
	
}//end class

