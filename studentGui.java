import java.util.Scanner;
import javax.swing.JOptionPane;
class StudentData
{
	String name;
	int rollno;
	int regno;
	int Mark;
	char grade;
	void readData(String a,int b, int c,int d)
	{
		name=a;
		rollno=b;
		regno= c;
		Mark = d;
		computeGrade();
	}
	void computeGrade()
	{
		if(Mark>40)
			grade='F';
		else if(Mark>=50)
			grade='e';
		else if(Mark>=60)
			grade='d';
		else if(Mark>=70)
			grade='c';
		else if(Mark>=80)
			grade='B';
		else if(Mark>=90)
			grade='A';
		else
			System.out.println("Wrong input");
	}
	void display()
	{
		JOptionPane.showMessageDialog(null,"--------\nName : "+name+"\nRollno : "+rollno+"\nRegno. : "+regno+"\nGrade : "+grade);
	}
}
class studentGui
{
	public static void main(String args[])
	{
		StudentData[] Std = new StudentData[10];
		int b,c,d,n;
		String a;
		n=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of students : "));
		for (int i=0;i<n;i++)
		{
			Std[i]= new StudentData();
			a=JOptionPane.showInputDialog(null,"Enter name : ");
			b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter rollno : "));
			c=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter reg. number : "));
			d=Integer.parseInt(JOptionPane.showInputDialog(null,"mark : "));
			Std[i].readData(a,b,c,d);
		}
		for (int i=0;i<n;i++)
		{
			Std[i].display();
		}
	}
}
