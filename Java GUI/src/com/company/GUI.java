package com.company;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Arfan
 */
public class GUI extends JFrame {

    private JLabel message;

    private JMenu mathMenu, scienceMenu;
    private JMenuItem quadraSolver, factSolver, areaOfCircle, findElem, calcExit;
    private JMenuBar bar;

    public GUI() {
        setTitle("Java GUI");
        mathMenu = new JMenu("Math");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MenuListener ml = new MenuListener();

        quadraSolver = new JMenuItem("Quadratic Solver");
        quadraSolver.addActionListener(ml);
        mathMenu.add(quadraSolver);

        factSolver = new JMenuItem("Factorial Solver");
        factSolver.addActionListener(ml);
        mathMenu.add(factSolver);

        areaOfCircle = new JMenuItem("Area of a Circle");
        areaOfCircle.addActionListener(ml);
        mathMenu.add(areaOfCircle);

        scienceMenu = new JMenu("Science");

        findElem = new JMenuItem("Find Element");
        findElem.addActionListener(ml);
        scienceMenu.add(findElem);
        calcExit = new JMenuItem("Calc Exit Velocity");
        calcExit.addActionListener(ml);
        scienceMenu.add(calcExit);

        bar = new JMenuBar();
        bar.add(mathMenu);
        bar.add(scienceMenu);
        setJMenuBar(bar);
    }

    private class MenuListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            String source = event.getActionCommand();

            if (source.equals("Quadratic Solver")) {
                Main.quadSolver();
            } else if (source.equals("Factorial Solver")) {
                Main.factSolver();
            } else if (source.equals("Area of a Circle")) {
                Main.areaOfCircle();
            } else if (source.equals("Find Element")) {
                Main.findElem();
            } else if (source.equals("Calc Exit Velocity")) {
                Main.calcExit();
            }
        }
    }
}
