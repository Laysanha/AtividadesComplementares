package atividade_complementar_1;

import javax.swing.JOptionPane;

public class Atv13 {
	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de N:"));

		int result = 1;
		int numFixo = 0;
		double total = 0;

		for (double i = 1; i <= n1; i++) {
			
			numFixo += i; 
			result *= i ;
			 
			 total += 1/i;
			//JOptionPane.showMessageDialog(null, i
			// "O valor total é:" + result + "\n numfixo" + numFixo + "\n SOMA" + total
			//);

		}

		JOptionPane.showMessageDialog(null, "O valor total é: " + numFixo + "/" + result + " = " + total);
	}
}
