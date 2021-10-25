package atividade_complementar_1;

import javax.swing.JOptionPane;

public class Atv6 {
	public static void main(String[] args) {

		int soma = 1;

		for (int i = 1; i <= 10; i++) {
			soma = soma * i;
		}

		JOptionPane.showMessageDialog(null, "Valor de Y: " + soma);

	}
}
