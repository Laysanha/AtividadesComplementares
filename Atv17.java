package atividade_complementar_1;

import javax.swing.JOptionPane;

public class Atv17 {
	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:"));
		double nMenor = 0;
		
		
		for(int i = 1; i <= n;i++){
			double num = Double.parseDouble((JOptionPane.showInputDialog("Informe número")));
			
			if (i == 1) {
				nMenor = num;
			} else {
				if (num < nMenor) {
					nMenor = num;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Resultado:" + nMenor);
	}
}
