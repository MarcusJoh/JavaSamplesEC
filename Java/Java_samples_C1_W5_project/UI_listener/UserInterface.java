import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {

    private JFrame frame;

    

    public UserInterface() {
    	
    }

    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(200, 100));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
       
    	 container.setLayout(new BorderLayout());
    	 JButton button = new JButton("Click!");
         container.add((button),BorderLayout.EAST);
         
         JLabel text = new JLabel("Text.");
         container.add((text),BorderLayout.WEST);
        
        
       
    }

    public JFrame getFrame() {
        return frame;
    }
    
    
    
    
    
}