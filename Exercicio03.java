package ExerciciorVetorMatriz;
//impressáo de soma e subtração das matrizes
//04/03/2022	
//Matheus
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];
		int[][] n1 = new int[4][6];
		int[][] n2 = new int[4][6];
		int l, c;

		for (l = 0; l <= 3; l++) {
			for (c = 0; c < 5; c++) {
				System.out.println("Digite o numero da " + (c + 1) + "º coluna" + " e " + (l + 1)
						+ "º linha da primeira matriz: ");
				n1[l][c] = leia.nextInt();
				System.out.println("Digite o numero da " + (c + 1) + "º coluna" + " e " + (l + 1)
						+ "º linha da primeira matriz: ");
				n2[l][c] = leia.nextInt();
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
			}
		}
		System.out.println("O resultado das somas é: ");
		System.out.println();
		for (l = 0; l <= 3; l++) {
			for (c = 0; c < 5; c++) {
				System.out.print("[" + m1[l][c] + "]");
			}
		System.out.println();
		}
		System.out.println();
		System.out.println("O resultado da subtração é: ");
		for (l = 0; l <= 3; l++) {
			for (c = 0; c < 5; c++) {
				System.out.print("[" + m2[l][c] + "]");

			}
			System.out.println();
		}

	}

}
