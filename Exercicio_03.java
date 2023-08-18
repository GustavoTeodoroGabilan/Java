package javanado;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		DecimalFormat numF = new DecimalFormat("#,##0.00");

		String[] loja = new String[] { "A", "B", "C", "D", "E", "F", "G", "H" };
		String[] prod = new String[] { "W", "X", "Y", "Z" };
		double[][] preco = new double[4][8];

		// carregar matriz
		for (int i = 0; i < 4; i++) {
			System.out.println("PRODUTO:" + prod[i]);
			for (int j = 0; j < 8; j++) {
				System.out.println("Informe o preço do produto " + prod[i] + " na loja " + loja[j] + ":");
				//preco[i][j] = entrada.nextDouble();
				//Codigo no qual gera 190 numeros automaticamente
				preco[i][j]=(double)(Math.random()*190);

			}
		}
		// Exibir preços inferiores a 120
		for(int i=0;i<4;i++) {
			for(int j=0;j<8;j++) {
				System.out.print(numF.format(preco[i][j])+"\t");
			}
			System.out.println(" ");
		}
		System.out.println("--------LISTA DE PREÇOS INFERIORES A 120----------");
		for(int i=0;i<4;i++) {
			System.out.println(prod[i]);
			for(int j=0;j<8;j++) {
				if(preco[i][j]<120) {
					System.out.println("------Loja: "+loja[j]+" Preços:"+numF.format(preco[i][j]));
				}
				
			}
		}
	}

}
