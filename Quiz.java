import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	public Quiz() {
		setSize(600,600);//Size of JFrame
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);//Sets if its visible.

        JButton startButton = new JButton("Start");
        add(startButton);
        startButton.addActionListener(this);
		getContentPane().add(BorderLayout.SOUTH, startButton);
		
		JButton button2 = new JButton("Second");
		add(button2);
		button2.addActionListener(this);
		getContentPane().add(BorderLayout.EAST, button2);
	}

	public static void main( String[] args ){
		new Quiz();
		/*JFrame frame = new JFrame();
		frame.setSize(800,800);
		frame.setVisible(true);
		*/
	}	
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Something");
	}
  
}
