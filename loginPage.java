import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LoginFrame extends JFrame implements ActionListener
{
	Container container = getContentPane();
	JLabel userLabel=new JLabel("Username : ");
	JLabel passwordLabel = new JLabel("Password : ");
	JTextField user = new JTextField();
	JPasswordField password = new JPasswordField();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	
	LoginFrame()
	{
		setLayoutManager();
		setLocationAndSize();
		addComponents();
	}
	public void setLayoutManager()
	{
		container.setLayout(null);
	}
	public void setLocationAndSize()
	{
		userLabel.setBounds(50,150,100,30);
		passwordLabel.setBounds(50,220,100,30);
		user.setBounds(150,150,150,30);
		password.setBounds(150,220,150,30);
		loginButton.setBounds(50,300,100,30);
		resetButton.setBounds(200,300,100,30);
	}
	public void addComponents()
	{
		container.add(userLabel);
		container.add(passwordLabel);
		container.add(user);
		container.add(password);
		container.add(loginButton);
		container.add(resetButton);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
	}
}
public class loginPage
{
	public static void main(String[] args)
	{
		LoginFrame frame=new LoginFrame();
		frame.setTitle("Login Panel");
		frame.setVisible(true);
		frame.setBounds(10,10,370,600);
		frame.setDefaultCloseOperation(3);
		frame.setResizable(false);
	}
}
