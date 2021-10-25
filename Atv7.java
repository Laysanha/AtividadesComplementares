package atividade_complementar_1;

import javax.swing.JOptionPane;

/* 
 * Faça um algoritmo para somar e mostrar na tela o resultado da seguinte expressão
 * (1+2)+(2+3)+(3+4)+(4+5)+(5+6)+(6+7)+(7+8)+...+(100+101).
*/

/*
 *  LÓGICA (TABALE DA VERDADE)
	soma =0
	i=1

	soma = soma + i + (i+1)
           0       1        2
           3       2        3
           8       3        4
           15      4        5
           24      5        6
           35
*/

public class Atv7 {
	public static void main(String[] args) {

		int soma = 0;

		for (int i = 1; i < 101; i++) {

			soma = soma + i + (i + 1) ;

		}
		
		JOptionPane.showMessageDialog(null, "O VALOR TOTAL É:" + soma);
	}
}
