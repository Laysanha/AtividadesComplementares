package atividade_complementar_1;

import javax.swing.JOptionPane;

public class Atv18 {
	public static void main(String[] args) {

		int nAluno = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos dados a serem registrados"));
		int qtdIdade = 0;
		int tubarao = 0;
		int jagua  = 0;

		for(int i = 1;i<=nAluno;i++){

			//String nomeAluno = JOptionPane.showInputDialog("Informe seu nome:");
			char cidade = JOptionPane.showInputDialog("Informe a cidade onde mora (Tubarão/Jaguaruna):").charAt(0);
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));

			if (cidade == 't' || cidade == 'T') {
				tubarao = tubarao + 1;
			} else {
				if (cidade == 'j' || cidade == 'J') {
					jagua = jagua + 1;
				}
			}
		
			if (idade <= 17) {
				qtdIdade = qtdIdade + 1;
			}
		}JOptionPane.showMessageDialog(null,"Tabela \n Tubarão: \n" + tubarao + "\n Jagaruna: \n" + jagua + "\n menor que 17 anos: \n" + qtdIdade);
	}
}
