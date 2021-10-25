package atividade_complementar_1;

import javax.swing.JOptionPane;

public class Atv26 {

	public static void main(String[] args) {
		double deposito = 0;
        double retirada = 0;
        String total1 = "";
        double totalFinal = 0;

        int caixas = Integer.parseInt(JOptionPane.showInputDialog("Quantos caixas tem?"));
        for (int i = 1; i <= caixas; i++) {
            int clientes = Integer
                    .parseInt(JOptionPane.showInputDialog("Quantos clientes o " + i + "° caixa atendeu?"));
            for (int j = 1; j <= clientes; j++) {
                JOptionPane.showInputDialog("Nome do " + j + "° cliente: ");
                char depOuRet = JOptionPane.showInputDialog("Deseja realizar um depósito ou retirada (D/R)? ").toUpperCase().charAt(0);
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

                totalFinal = deposito + retirada;
            }
        }
        JOptionPane.showMessageDialog(null, total1 + "Total final de todas operações: " + totalFinal);
	}
}
