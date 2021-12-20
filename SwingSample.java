import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
class SwingSample
{
	public static void main(String args[])
	{
		guiSample trail = new guiSample();
	}
}
class guiSample extends JFrame implements ActionListener
{
	JLabel intro;
	JLabel intro2;
	JTextField num1;
	JTextField num2;
	JButton b;
	JLabel Result=new JLabel();
	guiSample()
	{
		setVisible(true); //making it visible
		setSize(800,400); //set the size
		setLayout(new FlowLayout()); //changes the cardlayout into FlowLayout
		intro = new JLabel ("Enter the first number : ");
		num1 = new JTextField(5); //creates a textfield
		intro2=new JLabel("Enter the Second number : ");
		num2 = new JTextField(5);
		b = new JButton("Enter");
		add(intro);
		add(num1);
		add(intro2);
		add(num2);
		add(b);
		b.addActionListener(this);
		setVisible(true); //making it visible
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a,b,sum;
		a=Integer.parseInt(num1.getText());
		b=Integer.parseInt(num2.getText());
		sum=a+b;
		Result.setText("The sum is "+sum);
	}
	
}

