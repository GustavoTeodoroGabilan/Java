package javanado;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double notas[][] = new double[3][4];
		
		for(int a=0;a<3;a++) {
			for(int n=0;n<3;n++) {
				System.out.println("Digite as notas do "+(a+1)+"o. aluno: ");
				notas[a][n] = entrada.nextDouble();
				notas[a][3] += (notas[a][n]);
			}
			notas[a][3] = notas[a][3]/3;
		}
		System.out.println("");
		for(int a=0;a<3;a++) {
			for(int n=0;n<4;n++) {
				System.out.print(notas[a][n]+"\t");
			}
			System.out.println("");
		}
	}

}
