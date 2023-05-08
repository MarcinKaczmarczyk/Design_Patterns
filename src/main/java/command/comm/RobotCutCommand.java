package command.comm;

import command.Robot;

public class RobotCutCommand implements Command{

    private Robot robot;

    public RobotCutCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.cut();
    }

    @Override
    public void undo() {

    }
}