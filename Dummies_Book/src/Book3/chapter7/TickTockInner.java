package Book3.chapter7;
//LISTING7.1
// this application that implements the Ticker class
//as an inner class



import java.awt.event.*;
import javax.swing.*;
public class TickTockInner
{
    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";
    public static void main(String[] args)
    {
        TickTockInner t = new TickTockInner();
        t.go();
    }
    private void go()
    {
// create a timer that calls the Ticker class
// at one second intervals
        Timer t = new Timer(1000, new Ticker());
        t.start();
// display a message box to prevent the
// program from ending immediately
        JOptionPane.showMessageDialog(null,
                "Click OK to exit program");
        System.exit(0);
    }

    class Ticker implements ActionListener
    {
        private boolean tick = true;
        public void actionPerformed(ActionEvent event)
        {
            if (tick)
            {
                System.out.println(tickMessage);
            }
            else
            {
                System.out.println(tockMessage);
            }
            tick = !tick;
        }
    }
}
