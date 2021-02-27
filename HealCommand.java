/*
 * @author Titus Gethers, Douglas Stokes, Colton Anderson
 * HealCommand class implements Command Interface
 */
package commanddesignpattern;

public class HealCommand implements Command{
	private Robot robot;

	public HealCommand(Robot robot) {
		this.robot = robot;
	}

	/**
	 * executes the heal command
	 */
	@Override
	public void execute() {
		robot.heal();
	}
	
	/**
	 * @return heal string
	 */
	public String getName() {
		return "heal";
	}
}

