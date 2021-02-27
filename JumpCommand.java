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
	
	/**
	 * executes the jump command
	 */
	@Override
	public void execute() {
		robot.jump();
	}
	
	/**
	 * @return jump string
	 */
	public String getName() {
		return "jump";
	}
}

