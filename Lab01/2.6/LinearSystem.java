import javax.swing.JOptionPane;
public class LinearSystem {
    public static void main (String[] args) {
    
    //Input the coefficients
    String strNum_a11, strNum_a12, strNum_b1, strNum_a21, strNum_a22, strNum_b2, strNoti;
    strNum_a11 = JOptionPane.showInputDialog(null, 
        "Please input a11 (a11x1 + a12x2 = b1): ", "Input a11");
    double dNum_a11 = Double.parseDouble(strNum_a11);
    strNum_a12 = JOptionPane.showInputDialog(null, 
        "Please input a12 (a11x1 + a12x2 = b1): ", "Input a12");
    double dNum_a12 = Double.parseDouble(strNum_a12);
    strNum_b1 = JOptionPane.showInputDialog(null, 
        "Please input b1 (a11x1 + a12x2 = b1): ", "Input b1");
    double dNum_b1 = Double.parseDouble(strNum_b1);
    strNum_a21 = JOptionPane.showInputDialog(null, 
        "Please input a21 (a21x1 + a22x2 = b2): ", "Input a21");
    double dNum_a21 = Double.parseDouble(strNum_a21);
    strNum_a22 = JOptionPane.showInputDialog(null, 
        "Please input a22 (a21x1 + a22x2 = b2): ", "Input a22");
    double dNum_a22 = Double.parseDouble(strNum_a22);
    strNum_b2 = JOptionPane.showInputDialog(null, 
        "Please input b2 (a21x1 + a22x2 = b2): ", "Input b2");
    double dNum_b2 = Double.parseDouble(strNum_b2);

    //Define the determinants
    double D = dNum_a11 * dNum_a22 - dNum_a12 * dNum_a21;
    double Da1 = dNum_b1 * dNum_a22 - dNum_b2 * dNum_a12;
    double Da2 = dNum_a11 * dNum_b2 - dNum_a21 * dNum_b1;

    //Solve the system
    if (D == 0) {
        if (Da1 == 0 && Da2 == 0) {
            strNoti = "There are infinitely many solutions.";
        }
        else {
            strNoti = "There is no solution.";
        }
    }
    else {
        strNoti = "There is one solution: x1 = " + (Da1 / D) + ", x2 = " + (Da2 / D);
    }

    //Print out the solution
    JOptionPane.showMessageDialog(null, strNoti, "Solution",
            JOptionPane.INFORMATION_MESSAGE);
        System.exit(0); 
    }    
}
