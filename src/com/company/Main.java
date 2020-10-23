package com.company;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName(JOptionPane.showInputDialog("Input the employee's name:"));
        employee.setAge(Integer.parseInt(JOptionPane.showInputDialog("Input the employee's age:")));
        employee.setSalary(Double.parseDouble(JOptionPane.showInputDialog("Input the employee's name:")));

        JOptionPane.showMessageDialog(null, "Employee's name:\n" + employee.getName());
        JOptionPane.showMessageDialog(null, "Employee's age:\n" + employee.getAge());
        JOptionPane.showMessageDialog(null, "Employee's salary:\n" + employee.getSalary());

        System.out.println(employee.toString());
    }
}
