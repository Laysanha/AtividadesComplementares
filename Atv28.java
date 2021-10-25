package atividade_complementar_1;

import javax.swing.JOptionPane;

public class Atv28 {
	public static void main(String[] args) {

		float total = 0;
		float deposito = 0;
		float retirada = 0;
		String total1 = "";
		float maiorDep = 0;
		float menorReti = 0;
		int numFilaDep = 0;
		int numFilaReti = 0;

		int caixa = Integer.parseInt(JOptionPane.showInputDialog("Quantos caixas tem?"));
		for (int i = 1; i <= caixa; i++) {
			int clientes = Integer
					.parseInt(JOptionPane.showInputDialog("Quantos clientes o " + i + "° caixa atendeu?"));
			for (int j = 1; j <= clientes; j++) {
				JOptionPane.showInputDialog("Nome do " + j + "° cliente: ");
				char depOuRet = JOptionPane.showInputDialog("Deseja realizar um depósito ou retirada (D/R)? ")
						.toUpperCase().charAt(0);
				if (depOuRet == 'D') {
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor deseja depositar?"));
					deposito += valor;
				} else if (depOuRet == 'R') {
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor deseja retirar?"));
					retirada += valor;
				} else {
					JOptionPane.showMessageDialog(null, "Comando inválido. Digite novamente.");
					j--;
				}

				if (i == 1) {
					maiorDep = deposito;
					menorReti = retirada;
					numFilaDep = i;
				}
				if (deposito > maiorDep) {
					maiorDep = deposito;
					numFilaDep = i;
				}
				if (retirada < menorReti) {
					menorReti = retirada;
					numFilaReti = i;
				}

				deposito = 0;
				retirada = 0;
				total = 0;

				total = deposito + retirada;
			}
		}
		JOptionPane.showMessageDialog(null, "Fila com maior depósito: " + numFilaDep + " de " + maiorDep
				+ "\nFila com menor retirada: " + numFilaReti + " de " + menorReti);

		JOptionPane.showMessageDialog(null, total1
				);

		JOptionPane.showMessageDialog(null, total1 + "Total final de todas operações: " + total);
	}
}