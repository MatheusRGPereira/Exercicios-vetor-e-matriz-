package ExerciciorVetorMatriz;

//Notas impressas nos vetores e impressão da maior nota
//04/03/2022	
//Matheus

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double[] notas = new double[5];
		double maior = 0;
		int c;

		for (c = 0; c <= 4; c++) {
			System.out.println("Digite a " + c + 1 + " nota da atividade");
			notas[c] = leia.nextDouble();
		}
		System.out.println("Notas finais");
		for (c = 0; c <= 4; c++) {
			System.out.print("[" + notas[c] + "]");
			if (notas[c] > maior) {
				maior = notas[c];
			}
		}
		System.out.println();
		System.out.println("A maior nota foi: " + maior);
	}
}
