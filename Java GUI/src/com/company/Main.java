package com.company;


import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Main {
    public static JTextArea ta;
    public static GUI gui;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a window
        gui = new GUI();
        ta = new JTextArea(10, 50);
        ta.setFont(new Font("Monospaced", Font.PLAIN, 12));
        gui.getContentPane().add(ta);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void quadSolver() {
        String a, b, c;
        String message = " ";
        double aValue, bValue, cValue;
        double answer1, answer2;
        a = JOptionPane.showInputDialog("Insert value for a:  ");
        aValue = Double.parseDouble(a);
        b = JOptionPane.showInputDialog("Insert value for b:  ");
        bValue = Double.parseDouble(b);
        c = JOptionPane.showInputDialog("Insert value for c:  ");
        cValue = Double.parseDouble(c);

        double determinant = bValue * bValue - 4 * aValue * cValue;

        if (determinant > 0) {
            answer1 = (-bValue + Math.sqrt(determinant)) / (2 * aValue);
            answer2 = (-bValue - Math.sqrt(determinant)) / (2 * aValue);
            message += "Root 1 = " + answer1 + "Root 2: " + answer2;
        } else if (determinant == 0) {
            answer1 = answer2 = -bValue / (2 * aValue);

            message += ("Root 1 = root2 = " + answer1);
        } else {
            double realPart = -bValue / (2 * aValue);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * aValue);

            message += "Root1 = " + realPart + "+" + imaginaryPart + "i and Root 2 = " + realPart + "-" + imaginaryPart + "i";
        }
        ta.setText(message);
    }

    public static void factSolver() {
        String message = "";
        double i, fact = 1.00;
        String numStr;
        double num;
        numStr = JOptionPane.showInputDialog("Insert value for Factorial Solve:  ");
        num = Double.parseDouble(numStr);
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        message += ("Factorial of " + num + " is: " + fact);
        ta.setText(message);

    }

    public static void areaOfCircle() {
        int r;
        double pi = 3.14, area;
        String numStr, message = "";
        double num;
        numStr = JOptionPane.showInputDialog("Insert value for Area:  ");
        num = Double.parseDouble(numStr);
        area = pi * num * num;

        message += ("Area of circle: " + area);
        ta.setText(message);
    }

    public static void findElem() {
        String message = "Lookup chemical element selected";
        ta.setText(message);
    }

    public static void calcExit() {
        String message = "Calculate exit velocity selected.";
        ta.setText(message);
    }
}
