package using_robotclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Program1 {
    public static void main(String[] args) {
        try
        {
            Robot robot=new Robot();
            robot.delay(2000);
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyRelease(KeyEvent.VK_WINDOWS);


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
