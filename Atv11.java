package atividade_complementar_1;

import javax.swing.JOptionPane;

public class Atv11 {
	public static void main (String [] args) {
	
		for (int i = 1; i <= 10; i++) {
			
			String nome = JOptionPane.showInputDialog("Informe seu nome:");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe seu idade:"));
			
			JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n idade:" + idade);
			
		}
	}
}
