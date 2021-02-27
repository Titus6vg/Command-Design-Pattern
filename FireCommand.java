/*
 * @author Titus Gethers, Douglas Stokes, Colton Anderson
 * FireCommand class implements Command Interface
 */
package commanddesignpattern;

public class FireCommand implements Command{
	private Robot robot;

	public FireCommand(Robot robot) {
		this.robot = robot;
	}
	
	/**
	 * executes the fire command
	 */
	@Override
	public void execute() {
		robot.fire();
	}
	
	/**
	 * @return fire string
	 */
	public String getName() {
		return "fire";
	}
}

