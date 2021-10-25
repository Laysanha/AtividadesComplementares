package atividade_complementar_1;

import javax.swing.JOptionPane;

public class Atv21 {
	
	public static void main(String[] args) {

		double mediaMenor = 0;
		String nomeMenorMedia = "";

		int n = 1;

		for (int i = 1; i <= n; i++) {

			String nomeAluno = JOptionPane.showInputDialog("Informe seu nome do aluno(a):");
			double media = Double.parseDouble((JOptionPane.showInputDialog("Informe a média:")));

			if (i == 1) {
				nomeMenorMedia = nomeAluno;
				mediaMenor = media;
			} else {
				if (media < mediaMenor) {
					mediaMenor = media;
					nomeMenorMedia = nomeAluno;
				}
			}

			int confirm = JOptionPane.showConfirmDialog(null, "Deseja verificar outro aluno(a)?");

			if (confirm == 0) {
				n++;
			} else {
				i = n + 2;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Maior nota é de: " + mediaMenor + "\n Com média: " + nomeMenorMedia);

	}
}
