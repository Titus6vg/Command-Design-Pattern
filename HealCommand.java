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
	
	@Override
	public void execute() {
		robot.heal();
	}
	
	/*
	 * Return heal
	 */
	public String getName() {
		return "heal";
	}
}

