package command;

import command.comm.RobotCutCommand;
import command.comm.RobotDrillCommand;
import command.comm.RobotTurnOffCommand;
import command.comm.RobotTurnOnCommand;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        WorkshopApp workshopApp=new WorkshopApp();

        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
        workshopApp.addToQueue(new RobotDrillCommand(robot));
        workshopApp.addToQueue(new RobotCutCommand(robot));
        workshopApp.addToQueue(new RobotTurnOffCommand(robot));

        workshopApp.run();
//        workshopApp.run();
        System.out.println("__________");
        workshopApp.undoLastCommand();
    }
}
