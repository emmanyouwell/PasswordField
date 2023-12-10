import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	private JFrame frame;
	private JLabel lbl1;
	private JLabel lbl2;
	private JTextField username;
	private JPasswordField password;
	private JButton btn1;
	private JLabel user;
	private JLabel pass;
	
	
	GUI() {
		frame = new JFrame();
		
		lbl1 = new JLabel("Username:");
		lbl1.setBounds(10, 10, 100, 30);
		frame.add(lbl1);
		
		username = new JTextField();
		username.setBounds(80, 10, 210, 30);
		frame.add(username);
		
		lbl2 = new JLabel("Password:");
		lbl2.setBounds(10, 50, 100, 30);
		frame.add(lbl2);
		
		password = new JPasswordField();
		password.setBounds(80,50,210,30);
		frame.add(password);
		
		btn1 = new JButton("Log in");
		btn1.setBounds(10, 90, 280, 30);
		frame.add(btn1);
		
		user = new JLabel("Username:");
		user.setBounds(10,130, 200, 30);
		frame.add(user);
		
		pass = new JLabel("Password:");
		pass.setBounds(10,170, 200, 30);
		frame.add(pass);
		

		btn1.addActionListener(this);
		
		
		

		
		frame.setLayout(null);
		frame.setSize(325, 250);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Log in");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			//Get the value of TextField and PasswordField
			//Compare it with the correct credentials
			//Open a new window
			user.setText("Username:");
			pass.setText("Password:");
			
			String userVal = username.getText();
			String passVal = new String(password.getPassword());
			user.setText(user.getText() + " " + userVal);
			pass.setText(pass.getText() + " " + passVal);
			
			if (userVal.equals("admin") && passVal.equals("admin1234")) {
				frame.setVisible(false);
				new Calculator(frame);
			}
			else {
				JOptionPane.showMessageDialog(frame, "Wrong credentials", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
		}
		
		
	}
}
