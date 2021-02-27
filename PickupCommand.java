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
	
	/**
	 * executes the pickup command
	 */
	@Override
	public void execute() {
		robot.pickup();
	}
	
	/**
	 * @return pickup string
	 */
	public String getName() {
		return "pickup";
	}
}

