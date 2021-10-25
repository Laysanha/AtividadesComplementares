package atividade_complementar_1;

import javax.swing.JOptionPane;

public class Atv8 {
	public static void main(String[] args) {
		int a = Integer.parseInt (JOptionPane.showInputDialog ("Digite o valor de a:"));
		int b = Integer.parseInt (JOptionPane.showInputDialog ("Digite o valor de b:"));
		
		int mult = 1;
		
		for (int i = 1; i <= b; i++) {
			mult *= a;			
		}
		
		JOptionPane.showMessageDialog(null, "O vaor de a: " + a + "\n o valor de b: " + b + "\n o resultado: " + mult );
	}
}
