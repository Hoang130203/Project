package Entity;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CountdownTimerFrame extends JLabel{
//    private JLabel countdownLabel;
	Timer timer;
    public CountdownTimerFrame() {
//        setTitle("Countdown Timer");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(50, 25);
//        setLayout(new FlowLayout());
    	
    	setText("1:00:00");
     
        setFont(new Font("Arial", Font.PLAIN, 17));
//        add(countdownLabel);

        timer = new Timer(1000, new TimerActionListener());
        timer.start();
    }
    public void stop() {
    	 setText("0:00:00");
    	 timer.stop();
    }
    private class TimerActionListener implements ActionListener {
        private int hours = 1;
        private int minutes = 0;
        private int seconds = 0;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (hours == 0 && minutes == 00 && seconds == 0) {
                ((Timer) e.getSource()).stop();
//                JOptionPane.showMessageDialog(CountdownTimerFrame.this, "HẾT GIỜ!");
            } else {
                seconds--;
                if (seconds < 0) {
                    seconds = 59;
                    minutes--;
                    if (minutes < 0) {
                        minutes = 59;
                        hours--;
                    }
                }
                String timeString = String.format("%d:%02d:%02d", hours, minutes, seconds);
                setText(timeString);
            }
        }
    }

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            CountdownTimerFrame frame = new CountdownTimerFrame();
//            frame.setVisible(true);
//        });
//    }
}