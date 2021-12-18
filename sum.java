import javax.swing.JOptionPane;
class sum
{
	public static void main(String[] args)
	{
		int num1= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the first number : "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the second number : "));
		int sum=num1+num2;
		JOptionPane.showMessageDialog(null,"The sum is "+sum);
	}
}
