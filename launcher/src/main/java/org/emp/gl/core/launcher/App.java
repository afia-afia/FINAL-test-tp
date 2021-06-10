package org.emp.gl.core.launcher;

import org.emp.gl.core.lookup.Lookup;
import org.emp.gl.heure.RobotGui;
import org.emp.gl.model.Robot;
import org.emp.gl.reglage.Reglage;
// import org.emp.gl.time.service.impl.DummyTimeServiceImpl;
import org.emp.gl.time.service.impl.delegation.TimerServiceImplWithDelegation;
import org.emp.gl.timer.service.TimerChangeListener;
import org.emp.gl.timer.service.TimerService;
import org.emp.gl.action.RobotAction;

/**
 * Hello world!
 *
 */
public class App {

   
    static {
       
       Lookup.getInstance().register(TimerService.class, new Robot());
       Lookup.getInstance().register(RobotAction.class, new Robot());

       
    }

    public static void main(String[] args) {
        testDuTimeService();
    }


    private static void testDuTimeService() {

       TimerService ts = Lookup.getInstance().getService(TimerService.class);

       
        ts.addTimeChangeListener(Lookup.getInstance().getService(RobotAction.class));
        RobotGui hGui = new RobotGui();
        
        ts.addTimeChangeListener(hGui);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            hGui.setVisible(true);
        }
        });
        
//        
        
        Reglage rGui = new Reglage();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            rGui.setVisible(true);
        }
        });

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
