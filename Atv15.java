package atividade_complementar_1;

import javax.swing.JOptionPane;

public class Atv15 {
	public static void main(String[] args) {

		int n = 1;

        for (int i = 1; i <= n; i++) {
            String nome = JOptionPane.showInputDialog("Informe  o nome do aluno:");
            double media = Double.parseDouble(JOptionPane.showInputDialog("Informe  a m�dia do aluno " + nome + ":"));

            if (media >= 7.0) {
                JOptionPane.showMessageDialog(null, nome + "est� aprovado(a)");
            } else {
                if (media < 2.0) {
                    JOptionPane.showMessageDialog(null, nome + "est� reprovado(a)");
                } else {
                    JOptionPane.showMessageDialog(null, nome + "est� de recupra��o");
                }
            }

            int confirm = JOptionPane.showConfirmDialog(null, "Deseja verificar outro aluno(a)?");

            if (confirm == 0) {
                n++;
            } else {
                i = n + 2;
            }
        }

	}
}
