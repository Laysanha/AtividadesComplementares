package atividade_complementar_1;

import javax.swing.JOptionPane;

public class Atv14 {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Informe seu nome:");
		double saldo = Double.parseDouble((JOptionPane.showInputDialog("Informe seu saldo:")));
		// double deposito = 0;
		// double retirada = 0;

		for (int i = 1; i <= 3; i++) {

			char acaoBancaria = JOptionPane
					.showInputDialog("(D/d) para adiconar mais dinheiro a conta \n (R/r) para retirada").charAt(0);

			if (acaoBancaria == 'D' || acaoBancaria == 'd') {
				double addSaldo = Double.parseDouble((JOptionPane.showInputDialog("Adicione mais saldo:")));
				saldo = saldo + addSaldo;
			} else {
				if (acaoBancaria == 'R' || acaoBancaria == 'r') {
					double exSaldo = Double.parseDouble((JOptionPane.showInputDialog("Retire saldo:")));
					saldo = saldo - exSaldo;
				}

//				double exSaldo = Double.parseDouble((JOptionPane.showInputDialog("Retire saldo:")));
//				saldo = saldo - exSaldo;
			}

		}

		JOptionPane.showMessageDialog(null, "Bem-vinda " + nome + "\n Seu Saldo: " + saldo);

	}

}
