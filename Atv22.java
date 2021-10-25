package atividade_complementar_1;

import javax.swing.JOptionPane;

public class Atv22 {

	public static void main(String[] args) {

		int n = 1;
		int andarInicial = Integer.parseInt(JOptionPane.showInputDialog("Informe o andar inical:"));

		for (int i = 1; i <= n; i++) {

			int andarProx = Integer.parseInt(JOptionPane.showInputDialog("Informe o proximo andar:"));

			if (andarInicial< andarProx) {
				JOptionPane.showMessageDialog(null, "Sobe");
				andarInicial = andarProx;
			} else if (andarInicial > andarProx) {
				JOptionPane.showMessageDialog(null, "Desce");
				andarInicial = andarProx;
			} else if (andarInicial == andarProx) {
				JOptionPane.showMessageDialog(null, "Parado");
			}

			int confirm = JOptionPane.showConfirmDialog(null, "Próximo andar?");

			if (confirm == 0) {
				n++;
			} else {
				i = n + 2;
			}
		}
	}
}
