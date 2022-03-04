package ExerciciorVetorMatriz;

//Notas impressas nos vetores e impressão da maior nota
//04/03/2022	
//Matheus
import java.util.*;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int[][] soma = new int[3][3]; 		
		int l, c,diagonal=0;

		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {
				System.out.println("Digite o numero da " + (c + 1) + "º coluna" + " e " + (l + 1) + "º linha da primeira matriz: ");
				matriz[l][c]=leia.nextInt();
				soma[l][c]=matriz[l][c]+matriz[l][c];
				if (l==c) {
					diagonal=diagonal+soma[l][c];
				}
			}	
		}
		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {
				System.out.print("["+soma[l][c]+"]");
			}
			System.out.println();
		}System.out.println("O valor da sooma da diagonal é: "+diagonal);
	}
}
