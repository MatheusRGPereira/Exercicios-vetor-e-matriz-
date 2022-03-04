package ExerciciorVetorMatriz;

//Impressão dos lancamentos de dados media e qts vezes foi o maior valor
//04/03/2022	
//Matheus
import java.util.*;

public class Exercicio02 {
		public static void main(String[] args) {
				
			Scanner leia = new Scanner(System.in);
			
			int lancamentos[] =new int[10];
			double media, soma=0 , maior=0;
			int n, contador=0;
			
			for(n=0;n <=9;n++) {
				System.out.println("Digite o valor nr " +(n+1)+" do dado: ");
				lancamentos[n]=leia.nextInt();
				soma=soma+lancamentos[n];
				if(lancamentos[n]>maior) {
				maior=lancamentos[n];
				contador=1;
				}else if(lancamentos[n]==maior) {
					contador=contador+1;
				}
				
			}
			System.out.println("Os resultados dos lançamentos foram:");
			for(n=0;n<=9;n++) {
				System.out.print("["+lancamentos[n]+"]");
			}
			media=soma/n;
			System.out.println();
			System.out.println("A media de lançamentos é:" +media);
			System.out.println("O maior valor dos dados foi: "+maior);
			System.out.println("Que foi lançado "+contador+" vezes!!");
			
		}
}
