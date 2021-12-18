import javax.swing.*; //imports the swing libray

class GUI_window
{
	JFrame f;
	GUI_window() //creating a constructor of class GUI
	{
		f=new JFrame();//creating an object of JFrame
		JButton b = new JButton("Click");
		b.setBounds(130,100,100,40);
		f.add(b);//adding button in JFrame
		f.setSize(400,500);//set the dimension
		f.setLayout(null); //not using any layout managers
		f.setVisible(true); //for making the frame visible 
	}
	public static void main(String args[])
	{
		new GUI_window();
	}
}
