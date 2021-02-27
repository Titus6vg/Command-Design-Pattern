/*
 * @author Titus Gethers, Douglas Stokes, Colton Anderson
 * The Command Interface that is to be implemented for -
 * execution.
 */
package commanddesignpattern;

public interface Command {
	public String getName();
	public void execute();
}
