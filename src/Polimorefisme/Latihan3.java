/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorefisme;

/**
 *
 * @author Nazwajafni
 */
import java.util.ArrayList;
import java.util.List;

interface Payable {
    double pay();
}

class Employee implements Payable {
    private double monthlySalary;

    public Employee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double pay() {
        return monthlySalary;
    }
}

class Contractor implements Payable {
    private double hourlyRate;
    private int hours;

    public Contractor(double hourlyRate, int hours) {
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double pay() {
        return hourlyRate * hours;
    }
}

public class Latihan3 {
    public static void main(String[] args) {
        List<Payable> payroll = new ArrayList<>();
        payroll.add(new Employee(6000000));        
        payroll.add(new Contractor(50000, 40));    
        payroll.add(new Contractor(60000, 30));    

        double totalPayment = 0;
        for (Payable p : payroll) {
            totalPayment += p.pay();
        }

        System.out.println("Total payment = " + totalPayment);
    }
}