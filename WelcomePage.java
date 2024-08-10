import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
	JFrame frame = new JFrame();
	JLabel WelcomeLabel = new JLabel("Secrets");
	
	
	WelcomePage(){
		WelcomeLabel.setBounds(0,0,200 , 35);
		
		frame.add(WelcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
