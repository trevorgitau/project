import javax.swing.*;
public class interest {
    public static void main(String[]args)
	{
	double A; 
	int P, t; 
	double r; 
	String temp1,temp2, temp3;
	temp1 = JOptionPane.showInputDialog(null,"Input the principle: ");
	P = Integer.parseInt(temp1);

	temp2 = JOptionPane.showInputDialog(null,"Input the rate (e.g. 0.05 for 5%): ");
	r = Double.parseDouble(temp2);
        
    temp3 = JOptionPane.showInputDialog(null,"Input the time period: ");
	t = Integer.parseInt(temp3);

	A=P*Math.pow(1-r,t );
	JOptionPane.showMessageDialog(null,"Compound interest is: " +A);
	    }
}
