package atividade_complementar_1;

import javax.swing.JOptionPane;

public class atv20 {
	public static void main(String[] args) {
	
		double mediaMaior = 0;
		String nomeMaiorMedia = "";
		
		int n = 1;

		for (int i = 1; i <= n; i++) {

			String nomeAluno = JOptionPane.showInputDialog("Informe seu nome do aluno(a):");
			double media = Double.parseDouble((JOptionPane.showInputDialog("Informe a m�dia:")));
			
			if (i == 1) {
				nomeMaiorMedia = nomeAluno;
				mediaMaior = media;
			} else {
				if (media > mediaMaior) {
					mediaMaior = media;
					nomeMaiorMedia = nomeAluno;
				}
			}

			int confirm = JOptionPane.showConfirmDialog(null, "Deseja verificar outro aluno(a)?");

			if (confirm == 0) {
                n++;
            } else {
                i = n + 2;
            }
        }
		JOptionPane.showMessageDialog(null, "Maior nota � de: " + mediaMaior + "\n Com m�dia: " + nomeMaiorMedia);

	}
}
