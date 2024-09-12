/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;
import javax.swing.JOptionPane;
/**
 *
 * @author msaad
 */
public class Employee {

    public static void main(String[] args) {
        String input;
        String employeeName;
        int IDNumber;
        int numberOfHoursWorked;
        double hourlyPayRate;
        
        employeeName = JOptionPane.showInputDialog("Enter the employees name");
        IDNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter " + employeeName + "'s ID number"));
        numberOfHoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter number of hours " + employeeName + "'s worked"));
        hourlyPayRate = Double.parseDouble(JOptionPane.showInputDialog("Enter " + employeeName + "'s hourly wage"));
        
        
        Payroll employee1 = new Payroll(employeeName, IDNumber);
        
        employee1.setHourlyPayRate(hourlyPayRate);
        employee1.setNumberOfHoursWorked(numberOfHoursWorked);
        
        JOptionPane.showMessageDialog(null, employeeName + "'s gross pay is " + employee1.employeeGrossPay());
    }
}
