import javax.swing.JOptionPane;
public class QuadraticEquation {
    public static void main(String[] args){
        
        //Input the coefficients
        String strNum_a, strNum_b, strNum_c, strNoti;
        strNum_a = JOptionPane.showInputDialog(null, 
            "Please input a (ax^2 + bx + c = 0): ", "Input a");
        double dNum_a = Double.parseDouble(strNum_a);
        strNum_b = JOptionPane.showInputDialog(null, 
            "Please input b (ax^2 + bx + c = 0): ", "Input b");
        double dNum_b = Double.parseDouble(strNum_b);
        strNum_c = JOptionPane.showInputDialog(null, 
            "Please input c (ax^2 + bx + c = 0): ", "Input c");
        double dNum_c = Double.parseDouble(strNum_c);

        //Calculate the discriminant 𝛥
        double delta = Math.pow(dNum_b , 2) - 4 * dNum_a * dNum_c; 

        //Solve the equation
        if (delta > 0) {
            strNoti = "There are two solutions: x1 = " + ((- dNum_b + Math.sqrt(delta))/(2 * dNum_a)) +
                ", x2 = " + ((- dNum_b - Math.sqrt(delta))/(2 * dNum_a)) + ".";
        }
        else if (delta == 0) {
            strNoti = "There is one double solution: x = " + (-dNum_b / (2 * dNum_a)) + ".";
        } 
        else {
            strNoti = "There is no real soultion.";
        }
        
        //Print out the solution
        JOptionPane.showMessageDialog(null, strNoti, 
            "Solution", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}