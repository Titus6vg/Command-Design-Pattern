/*
 * @author Titus Gethers, Douglas Stokes, Colton Anderson
 * PickupCommand Class implements Command Interface
 */
package commanddesignpattern;

public class PickupCommand implements Command {
	private Robot robot;

	public PickupCommand(Robot robot) {
		this.robot = robot;
	}
	
	@Override
	public void execute() {
		robot.pickup();
	}
	
	/*
	 * Return Pickup
	 */
	public String getName() {
		return "pickup";
	}
}

