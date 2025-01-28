package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

public final class Main {
    public static void main(String... args) {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Hello World");
        }

        RobotBase.startRobot(Robot::new);

    }
    
}
