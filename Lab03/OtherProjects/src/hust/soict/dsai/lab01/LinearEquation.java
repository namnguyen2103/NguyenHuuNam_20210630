package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;

public class LinearEquation {
	public static void main(String[] args){
        
        //Input the coefficients
        String strNum_a, strNum_b, strNoti;
        strNum_a = JOptionPane.showInputDialog(null, 
            "Please input a (ax + b = 0): ", "Input a");
        double dNum_a = Double.parseDouble(strNum_a);
        strNum_b = JOptionPane.showInputDialog(null, 
            "Please input b (ax + b = 0): ", "Input b");
        double dNum_b = Double.parseDouble(strNum_b);

        //Solve the equation
        if (dNum_a == 0) {
            if (dNum_b == 0) {
                strNoti = "There are infinitely many solutions.";
            }
            else {
                strNoti = "There is no solution.";
            }
        }        
        else {
            strNoti = "There is one solution: x = " + (-dNum_b / dNum_a) + ".";
        }

        //Print out the solution
        JOptionPane.showMessageDialog(null, strNoti, 
            "Solution", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
