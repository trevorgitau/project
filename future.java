import javax.swing.*;

public class future {
    public static void main(String[] args) {
        //Declare variables
        double A;
        double i;
        int n;
        String temp1, temp2, temp3;
        
        //User input for principal amount, interest rate, and time period
        temp1 = JOptionPane.showInputDialog(null, "Enter Amount (A): ");
        A = Double.parseDouble(temp1);
        
        temp2 = JOptionPane.showInputDialog(null, "Enter interest rate (i): ");
        i = Double.parseDouble(temp2);
        
        temp3 = JOptionPane.showInputDialog(null, "Enter number of years (n): ");
        n = Integer.parseInt(temp3);
        
        // Calculate future value using the formula: V = A * (1 + i)^n
        double V = A * Math.pow((1 + i), n);
        
        // Display the result in a message dialog
        JOptionPane.showMessageDialog(null, "Future Value: K.Shs " + V);
    }
}
        
