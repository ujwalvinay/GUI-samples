import javax.swing.*;
public class loginPage
{
	public static void main(String args[])
	{
		JPanel panel = new JPanel();
		JFrame window = new JFrame();
		window.setSize(200,200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		
		panel.setLayout(null);
		window.setVisibe(true);
		JLabel user = new JLabel ("Username ");
		user.setBounds(15,30,90,25);
		JTextField user_in = new JTextField(20);
		user.setBounds(50,30,180,30);
		JLabel password = new JLabel("Password ");
		password.setBounds(15,60,90,25);
		JPasswordField password_in = new JPasswordField();
		password_in.setBounds(50,60,180,30);
		
		JButton button = new JButton("Login");
		button.setBounds(30,80,60,30);
		

		
		panel.add(user);
		panel.add(user_in);
		panel.add(password);
		panel.add(password_in);
		panel.add(button);
		
		
	}
}
