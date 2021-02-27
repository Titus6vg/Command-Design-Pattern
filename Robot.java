/*
 * @author Titus Gethers, Douglas Stokes, Colton Anderson
 */
package commanddesignpattern;

public class Robot {
	
	public Robot() {}
	
	/*
	 * Intialized String
	 */
	public Robot(String name) {
		System.out.println("Welcome my name is( "+name+" ), I'm a friendly robot.");
	}
	
	/*
	 * Outputs set for different methods. 
	 */
	public void pickup() {
		System.out.println("Oh treasure, picking it up!");
	}
	/*
	 * Specialized Jump method-output
	 */
	public void jump() {
		System.out.println("Oh no a hazard, I'm jumping over it.");
	}
	/*
	 * Specialized fire method-output
	 */
	public void fire() {
		System.out.println("Bad guys! Fire my blow torch at them.");
	}
	/*
	 * Specialized heal method-output
	 */
	public void heal() {
		System.out.println("Thanks for healing my wounds");
	}
}
