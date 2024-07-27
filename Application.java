
public class Application {

	public static void main(String[] args) {
		// CS131 Lab 2

				//creating object using empty argument constructor
		Wizard test = new Wizard();
		System.out.println(test);
				
		test.setName("Marc");
		test.setHealth(99);
		test.setKey(17);
				
		System.out.println(test);
				
				//trying key that does not match
		test.lock(test.getKey());
				
				//testing isLocked method on incorrect key
		System.out.println(test.isLocked());
				
		System.out.println(test);
				
				//testing takeDamage method after incorrect key
		test.takeDamage(47);
			
				//testing Wizard toString method
		System.out.println(test.toString());
				
		System.out.println("-------------------------------");	
			
				
				//creating Wizard object using preferred constructor
		Wizard val = new Wizard("Val");
		System.out.println(val);
				
		val.setHealth(99);
		val.setKey(13);
				
		System.out.println(val);
		
				//trying key that matches
		val.lock(val.getKey());
				
		System.out.println(val.isLocked());
				
		System.out.println(val);
				
				//testing takeDamage method after correct key
		val.takeDamage(47);
				
				//testing Wizard toString() method.
		System.out.println(val.toString());

				
	}//end main

}// end class



