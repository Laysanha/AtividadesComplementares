package atividade_complementar_1;

import javax.swing.JOptionPane;

public class Atv19 {
	public static void main(String[] args) {

		int velho = 0;
		int nova = 0;
		String nomeVelho = "";
		String nomeNova = "";

		int n = 1;

		for (int i = 1; i <= n; i++) {
			String nome = JOptionPane.showInputDialog("Informe  o nome :");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe  a idade do funcionario:"));

			if (i == 1) {
				velho = idade;
				nova = idade;
				nomeVelho = nome;
				nomeNova = nome;
			} else {
				if (idade < velho) {
					velho = idade;
					nomeVelho = nome;
				}

				if (idade > velho) {
					nova = idade;
					nomeNova = nome;
				}
			}

			int confirm = JOptionPane.showConfirmDialog(null, "Deseja continuar verificando ?");

			if (confirm == 0) {
				n++;
			} else {
				i = n + 2;
			}
			JOptionPane.showMessageDialog(null, nomeVelho+ " é a pessoa mais nova, com " 
												+ velho + " anos.\n"
												+ nomeNova + " é a pessoa mais velha, com " 
												+ nova + " anos.");
		}
	}
}
