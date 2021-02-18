/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;
import java.text.NumberFormat;
import javax.swing.*;
/**
 *
 * @author Calvin
 */
public class MyProgram {
    public static void main(String[] args) {
        String budget = JOptionPane.showInputDialog("Enter the amount of money you have for your monthly budget");
            double monthlyBudget = Double.parseDouble(budget);
            NumberFormat.getCurrencyInstance().format(monthlyBudget);
        String rent = JOptionPane.showInputDialog("Enter the amount you will spend on rent this month");
            double rentBudget = Double.parseDouble(rent);
            String rentDollars = NumberFormat.getCurrencyInstance().format(rentBudget);
            String rentPercent = NumberFormat.getPercentInstance().format(rentBudget / monthlyBudget);
        String groceries = JOptionPane.showInputDialog("Enter the amount you will spend on grocieries this month");
         double groceryBudget = Double.parseDouble(groceries);
            String groceryDollars = NumberFormat.getCurrencyInstance().format(groceryBudget);
            String groceryPercent = NumberFormat.getPercentInstance().format(groceryBudget / monthlyBudget);
        String otherExpenses = JOptionPane.showInputDialog("Enter the amount you will spend on other expenses this month");
         double otherBudget = Double.parseDouble(otherExpenses);
            String otherDollars = NumberFormat.getCurrencyInstance().format(otherBudget);
            String otherPercent = NumberFormat.getPercentInstance().format(otherBudget / monthlyBudget);
            
        JOptionPane.showMessageDialog(null, "The rent for this month is " + rentDollars + " which is " + rentPercent + " of the budget.\n"
        + "The groceries for this month are " + groceryDollars + " which is " + groceryPercent + " of the budget.\n"
        + "Other expenses for this month are " + otherDollars + " which is " + otherPercent + " of the budget.");
    }
}
