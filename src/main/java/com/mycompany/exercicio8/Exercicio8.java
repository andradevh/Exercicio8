package com.mycompany.exercicio8;

import javax.swing.JOptionPane;

public class Exercicio8 {

    public static void main(String[] args) {
        int valor1, valor2, soma;
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
        
        soma = valor1 + valor2;
        
        JOptionPane.showMessageDialog(null, soma);
    }
}
