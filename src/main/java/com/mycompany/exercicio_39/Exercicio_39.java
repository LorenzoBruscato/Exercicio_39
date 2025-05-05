/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio_39;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Exercicio_39 {

    public static void main(String[] args) {
        int n1 = 0, n2 = 0, n = 0;
        try {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        } catch (NumberFormatException e) {
            System.out.println("Erro teste divisão por 0" + e);
            System.out.println("Atribuir 10 para n1" + e);
        }
        try {
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        } catch (NumberFormatException e) {
            System.out.println("Erro teste divisão por 0" + e);
            System.out.println("Atribuir 10 para n2" + e);
        }
        try {
            n = n1 / n2;
            System.out.println("O resultado é: " + n);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Erro teste divisão por 0" + e);
        }
        System.out.println("O resultado é: " + n);
    }
}
