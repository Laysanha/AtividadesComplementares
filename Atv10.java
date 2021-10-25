package atividade_complementar_1;

import javax.swing.JOptionPane;

public class Atv10 {
	
	public static void main(String[] args) {
		
		int soma = 0;
		
		for (int i = 0; i <= 100; i++) {
			
			if(i%2 == 0) {
				soma -= i;	
			} else {
				soma += i;
			}
		} 
		
		JOptionPane.showMessageDialog(null, "Soma: " + soma);
	}
}
