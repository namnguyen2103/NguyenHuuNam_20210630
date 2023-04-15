import javax.swing.JOptionPane;
public class OperationsTwoNumbers {
    public static void main(String[] args){
        
        //Input two numbers
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, 
            "Please input the first number: ", "Input the first number");
        double dNum1 = Double.parseDouble(strNum1);
        strNum2 = JOptionPane.showInputDialog(null, 
            "Please input the second number: ", "Input the second number");
        double dNum2 = Double.parseDouble(strNum2);

        //Sum
        double dSum = dNum1 + dNum2;
        JOptionPane.showMessageDialog(null, "The sum of the two numbers is: " + dSum + ".", 
            "Sum of two numbers", JOptionPane.INFORMATION_MESSAGE);

        //Difference
        double dDifference = Math.abs(dNum1 - dNum2);
        JOptionPane.showMessageDialog(null, "The difference of the two numbers is: " + dDifference + ".", 
            "Sum of two numbers", JOptionPane.INFORMATION_MESSAGE);

        //Product
        double dProduct = dNum1 * dNum2;
        JOptionPane.showMessageDialog(null, "The product of the two numbers is: " + dProduct + ".",
            "Sum of two numbers", JOptionPane.INFORMATION_MESSAGE);

        //Quotient 
        String strQoutentNoti;       
        if (dNum2 == 0) {
            strQoutentNoti = "The qoutient does not exist.";
        }
        else {
            double dQoutient = dNum1 / dNum2;
            strQoutentNoti = "The qoutient of the two numbers is: " + dQoutient + ".";
        }
        JOptionPane.showMessageDialog(null, strQoutentNoti, "Qoutent of two numbers",
            JOptionPane.INFORMATION_MESSAGE);
        System.exit(0); 
    }
}