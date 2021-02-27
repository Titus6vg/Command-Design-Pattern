/*
 * @author Titus Gethers, Douglas Stokes, Colton Anderson
 * InputHandler - Mini Driver
 */
package commanddesignpattern;

import java.util.HashMap;

public class InputHandler {

    private HashMap<String,Command> commands = new HashMap<String,Command>();

    /**
     * initiallizing hashmap with commands
     * @param robot
     */
    public InputHandler(Robot robot) {
        PickupCommand pickup = new PickupCommand(robot);
        JumpCommand jump = new JumpCommand(robot);
        FireCommand fire = new FireCommand(robot);
        HealCommand heal = new HealCommand(robot);
        commands.put(pickup.getName(), pickup);
        commands.put(jump.getName(), jump);
        commands.put(fire.getName(), fire);
        commands.put(heal.getName(), heal);
    }
    /**
     * calls appropiate command, or prints error message if invalid command
     * @param data
     */
    public void inputEntered(String data) {
        if(data.contentEquals("pickup") || data.contentEquals("jump") || 
        data.contentEquals("fire") || data.contentEquals("heal")) {
            commands.get(data).execute();
        }else {
            System.out.println("Invalid Command Entered");
        }
    }
}
