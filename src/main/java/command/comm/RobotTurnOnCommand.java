package command.comm;

import command.Robot;
import command.comm.Command;

public class RobotTurnOnCommand implements Command {
    private Robot robot;

    public RobotTurnOnCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.turnOn();
    }

    @Override
    public void undo() {
        robot.turnoff();
    }
}
