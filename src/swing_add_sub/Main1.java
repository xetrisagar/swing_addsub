package swing_add_sub;



import javax.swing.*;
import java.awt.event.*;

public class Main1 implements ActionListener{
	JFrame jf;
	JLabel l1,l2,l3;
	JTextField f1,f2,f3;
	JButton btn1,btn2;
	
	public Main1()
	{
		 jf=new JFrame("hi there!!");
		jf.setSize(500,500);
		jf.setResizable(false);
		jf.setLocation(400,400);
		jf.setLayout(null);
		
		l1=new JLabel("num1");
		l1.setBounds(50, 50, 50, 50);
		jf.add(l1);
		
		
		l2=new JLabel("num2");
		l2.setBounds(50,90,50,50);
		jf.add(l2);
		
		l3=new JLabel("res");
		l3.setBounds(50,130,50,50);
		jf.add(l3);
		
		
		f1=new JTextField();
		f1.setBounds(90,50,100,50);
		jf.add(f1);
		
		f2=new JTextField();
		f2.setBounds(90,90,100,50);
		jf.add(f2);
		
		f3=new JTextField();
		f3.setBounds(90,130,100,50);
		jf.add(f3);
	
		
		btn1=new JButton("sum");
		btn1.setBounds(90,210,100,50);
		btn1.addActionListener(this);
		jf.add(btn1);
		
		
		btn2=new JButton("sub");
		btn2.setBounds(180,210,100,50);
		btn2.addActionListener(this);
		jf.add(btn2);
		
		
		
		
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Main1();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		String n1=f1.getText();
		String n2=f2.getText();
		
		if(n1.equals("")||n2.equals(""))
		{
			javax.swing.JOptionPane.showMessageDialog(null,"plz enter both numbers");
		}
		
		else
		{
			if(obj==btn1)
			{
			double num1=Double.parseDouble(n1);
			double num2=Double.parseDouble(n2);
			
			double result=num1+num2;
			
			f3.setText(String.valueOf(result));
			}
			
			else
			{
				double num1=Double.parseDouble(n1);
				double num2=Double.parseDouble(n2);
				
				double result=num1-num2;
				
				f3.setText(String.valueOf(result));
				
			}
			
		}
		
	}

	
	

}

