package atividade_complementar_1;

import javax.swing.JOptionPane;

public class Atv12 {
	public static void main(String[] args) {

		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de pessoas desejadas:"));
		int soma = 0;
		double media = 0;

		for (int i = 1; i <= qtd; i++) {

			String nome = JOptionPane.showInputDialog("Informe seu nome:");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe seu idade:"));

			soma += idade;
			media = soma / qtd;

			JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n idade:" + idade);

		}
		JOptionPane.showMessageDialog(null, "Sua soma é: " + soma + "\n média: " + media);
	}
}
