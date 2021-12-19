import javax.swing.*;
import java.awt.*;
class SwingSample
{
	public static void main(String args[])
	{
		guiSample trail = new guiSample();
	}
}
class guiSample extends JFrame
{	JFrame f;
	JLabel intro;
	JLabel intro2;
	JTextField num1;
	JTextField num2;
	JButton b;
	guiSample()
	{
		f= new JFrame(); //creates a new objects in JFrame
		f.setVisible(true); //making it visible
		f.setSize(400,500); //set the size
		f.setLayout(new FlowLayout()); //changes the cardlayout into FlowLayout
		intro = new JLabel ("Enter the first number : ");
		num1 = new JTextField(10); //creates a textfield
		intro2=new JLabel("Enter the Second number : ");
		num2 = new JTextField(10);
		b = new JButton("Enter");
		f.add(intro);
		f.add(num1);
		f.add(intro2);
		f.add(num2);
		f.add(b);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits the program while closing the window
	}
}
