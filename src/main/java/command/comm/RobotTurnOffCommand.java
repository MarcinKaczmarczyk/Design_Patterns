package command.comm;

import command.Robot;

public class RobotTurnOffCommand implements Command{

    private Robot robot;

    public RobotTurnOffCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.turnoff();
    }

    @Override
    public void undo() {
        robot.turnOn();
    }
}
