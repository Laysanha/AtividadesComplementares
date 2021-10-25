package atividade_complementar_1;

import javax.swing.JOptionPane;

public class Atv25 {
	public static void main(String[] args) {
		int n = 1;
		// int andarInicial = Integer.parseInt(JOptionPane.showInputDialog("Informe o
		// andar inical:"));

		for (int i = 1; i <= n; i++) {

			String nome = JOptionPane.showInputDialog("Informe  o nome do aluno(a): ");
			int nProva = Integer
					.parseInt(JOptionPane.showInputDialog("Informe a quantidade de provas feita pelo aluno:"));

			double media = 0;
			double notaAtual = 0;
			double notaAnt = 0;

			for (int m = 1; m <= nProva; m++) {

				notaAnt = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + m + "ª nota"));
	
				if (m == 1) {
					notaAtual = notaAnt;
				}
			}
			
			media = (notaAtual + notaAnt) / nProva;
		
			JOptionPane.showMessageDialog(null, "A media do aluno(a): " + nome + "\n Média: " + media);

			int confirm = JOptionPane.showConfirmDialog(null, "Próximo aluno ?");

			if (confirm == 0) {
				n++;
			} else {
				i = n + 2;
			}
		}
	}
}
