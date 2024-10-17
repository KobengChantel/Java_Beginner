package Book3.chapter5;




//Listing 5-1 shows a program that uses the Timer class to alternately display the
//messages Tick. . . and Tock. . . on the console at 1-second intervals. The JOption
//Pane class is used to display a dialog box; the program runs until the user clicks
//the OK button in this box

//using interfaces for callbacks

//allback is when you show up for an initial audition, they like
//what they see, and they tell you that they want you to come back so they can have
//another look.

import java.awt.event.*;
import javax.swing.*;
public class TickTock
{
    public static void main(String[] args)
    {
// create a timer that calls the Ticker class
// at one second intervals

        Timer t = new Timer(1000, new Ticker());
        t.start();
// display a message box to prevent the
// program from ending immediately
        JOptionPane.showMessageDialog(null,
                "Click OK to exit program");
    }
}
class Ticker implements ActionListener
        {
private boolean tick = true;
public void actionPerformed(ActionEvent event)
        {
        if (tick)
        {
        System.out.println("Tick...");
        }
        else
        {
        System.out.println("Tock...");
        }
tick = !tick;
        }
        }