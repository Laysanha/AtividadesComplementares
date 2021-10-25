package atividade_complementar_1;

import javax.swing.JOptionPane;

public class Atv16 {
	public static void main(String[] args) {

		int nAluno = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos alunos tem na sala:"));
		int masc = 0;
		int fem = 0;

		for (int i = 1; i <= nAluno; i++) {

			//String nomeAluno = JOptionPane.showInputDialog("Informe seu nome do aluno(a):");

			char sexoAluno = JOptionPane.showInputDialog("Informe o sexo do aluno (F/M):").charAt(0);

			if (sexoAluno == 'M' || sexoAluno == 'm') {
				masc = masc + 1;
			} else {
				if (sexoAluno == 'F' || sexoAluno == 'f') {
					fem = fem + 1;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Tabela do alunos \n Masculino: \n" + masc + "\n Feminino: \n" + fem);
	}
}
