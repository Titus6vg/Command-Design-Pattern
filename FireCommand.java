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
	
	@Override
	public void execute() {
		robot.fire();
	}
	
	/*
	 * Return fire
	 */
	public String getName() {
		return "fire";
	}
}

