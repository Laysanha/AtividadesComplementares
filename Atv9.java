package atividade_complementar_1;

import javax.swing.JOptionPane;

public class Atv9 {
	public static void main(String[] args) {
		
		int n = Integer.parseInt (JOptionPane.showInputDialog ("Digite o valor de N:"));
		int result = 1;
		
		for (int i = n; i >= 1; i--) {
			
			result *= i;
			
		}
		
		JOptionPane.showMessageDialog(null, "O fatorial é: \n" + result + " fatorial");
	}
}
