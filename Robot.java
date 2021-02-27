/**
 * A Robot
 * @author Titus Gethers, Douglas Stokes, Colton Anderson
 */
package commanddesignpattern;

public class Robot {
	
	public Robot() {}
	
	/**
	 * prints out robot name
	 * @param name
	 */
	public Robot(String name) {
		System.out.println("Welcome my name is "+name+", I'm a friendly robot.");
	}
	
	/**
	 * prints pickup string 
	 */
	public void pickup() {
		System.out.println("Oh treasure, picking it up!");
	}
	/**
	 * prints jump string
	 */
	public void jump() {
		System.out.println("Oh no a hazard, I'm jumping over it.");
	}
	/**
	 * prints fire string
	 */
	public void fire() {
		System.out.println("Bad guys! Fire my blow torch at them.");
	}
	/**
	 * prints heal string
	 */
	public void heal() {
		System.out.println("Thanks for healing my wounds");
	}
}
