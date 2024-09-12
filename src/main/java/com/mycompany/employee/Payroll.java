/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

/**
 * The Payroll class stores and manages payroll information for an employee.
 * It includes the employee's name, ID number, hourly pay rate, hours worked, 
 * and calculates the gross pay.
 */
public class Payroll {
    // Fields for employee details
    private String employeeName;           // Employee's name
    private int IDNumber;                  // Employee's ID number
    private double hourlyPayRate;          // Hourly pay rate
    private int numberOfHoursWorked;       // Number of hours worked by the employee
    private double employeeGrossPay;       // Employee's gross pay (calculated field)
    
    /**
     * Constructor to initialize the employee's name and ID number.
     * 
     * @param employeeName The name of the employee.
     * @param IDNumber The employee's ID number.
     */
    public Payroll(String employeeName, int IDNumber) {
        this.employeeName = employeeName;
        this.IDNumber = IDNumber;
    }
    
    /**
     * Sets the employee's hourly pay rate.
     * 
     * @param hourlyPayRate The hourly pay rate of the employee.
     */
    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
    
    /**
     * Sets the number of hours the employee worked.
     * 
     * @param numberOfHoursWorked The number of hours worked by the employee.
     */
    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }
    
    /**
     * Gets the number of hours the employee worked.
     * 
     * @return The number of hours worked by the employee.
     */
    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }
    
    /**
     * Gets the name of the employee.
     * 
     * @return The employee's name.
     */
    public String getemployeeName() {
        return employeeName;
    }
    
    /**
     * Gets the hourly pay rate of the employee.
     * 
     * @return The hourly pay rate.
     */
    public double gethourlyPayRate() {
        return hourlyPayRate;
    }
    
    /**
     * Gets the employee's ID number.
     * 
     * @return The employee's ID number.
     */
    public int getIDNumber() {
        return IDNumber;
    }
    
    /**
     * Calculates and returns the employee's gross pay.
     * 
     * @return The gross pay, which is the product of the hourly pay rate and the number of hours worked.
     */
    public double employeeGrossPay() {
        this.employeeGrossPay = hourlyPayRate * numberOfHoursWorked;  // Calculate gross pay
        return employeeGrossPay;  // Return calculated gross pay
    }
}
