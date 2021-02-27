/*
 * @author Titus Gethers, Douglas Stokes, Colton Anderson
 * JumpCommand class implements Command Interface
 */
package commanddesignpattern;

public class JumpCommand implements Command {
	private Robot robot;

	public JumpCommand(Robot robot) {
		this.robot = robot;
	}
	
	@Override
	public void execute() {
		robot.jump();
	}
	
	/*
	 * Return Jump
	 */
	public String getName() {
		return "jump";
	}
}

