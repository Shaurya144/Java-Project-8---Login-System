import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{
	JFrame frame = new JFrame();
	JButton LoginButton = new JButton("Login");
	JButton ResetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPassword = new JPasswordField();
	JLabel userIDLabel = new JLabel("User ID: ");
	JLabel userPasswordLabel = new JLabel("Password: ");
	JLabel messageLabel = new JLabel();
	
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	LoginPage(HashMap<String, String> loginInfoOriginal){
		loginInfo = loginInfoOriginal;
		
		userIDLabel.setBounds(50, 100, 75, 25);
		userPasswordLabel.setBounds(50, 150, 75, 25);
		messageLabel.setBounds(125, 250, 250, 35);
		userIDField.setBounds(125,100,200,25);
		userPassword.setBounds(125,150,200,25);
		
		LoginButton.setBounds(125,200,100,25);
		LoginButton.setFocusable(false);
		LoginButton.addActionListener(this);
		
		ResetButton.setBounds(225,200,100,25);
		ResetButton.setFocusable(false);
		ResetButton.addActionListener(this);
		
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(userIDField);
		frame.add(userPassword);
		frame.add(LoginButton);
		frame.add(ResetButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==ResetButton) {
			userIDField.setText("");
			userPassword.setText("");
		}
		
		if (e.getSource()==LoginButton) {
			String userID = userIDField.getText();
			String password = String.valueOf(userPassword.getPassword());
			
			if (loginInfo.containsKey(userID)) {
				if(loginInfo.get(userID).equals(password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login Successful!");
					frame.dispose();
					WelcomePage wecomePage = new WelcomePage();
					
				} else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Incorrect Password");
				}
			} else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("UserName not Found");
			}
		}
	}

}
