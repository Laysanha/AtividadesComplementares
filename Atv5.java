package atividade_complementar_1;

import javax.swing.JOptionPane;

public class Atv5 {
	public static void main(String[] args) {
		
		int soma = 0;
		
		for (int i = 0; i <= 10;  i++) {
			soma = soma + i;
		} 
		
		JOptionPane.showMessageDialog(null, "Valor de Y: " + soma);
		
	}
}
