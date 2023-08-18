package javanado;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		//criar matriz
		int [][] numeros = new int [3][3];
		
		//Dois for, uma para linha e um para coluna
		//o primeiro for sera rodado apenas uma vez, ate que o segundo for faça todo seu caminho
		//o primeiro for esta fixando a linha
		for(int linha=0;linha<3;linha++) {
			//o segundo for esta movimentando a coluna
			for(int coluna=0;coluna<3;coluna++) {
				System.out.println("Informe o elemento da matriz - linha:"+linha+" - coluna:"+coluna);
				numeros[linha][coluna]=entrada.nextInt();
				
			}
		}
		System.out.println("");
		//Exibir Matriz
		//Utilizar os for para pedir cada linha e coluna da matriz
		for(int l=0;l<3;l++) {
			for(int c=0;c<3;c++) {
				System.out.print(numeros[l][c]+"\t");
			}
			System.out.println("");
		}
		
	}

}
