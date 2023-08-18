package javanado;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		//Criar matriz
		int numeros[][] = new int [4][4];
		int somaLinha=0, somaColuna=0;
		int totalSoma=0;
		
		//Carregar matriz
		for(int l=0;l<4;l++) {
			for(int c=0;c<4;c++) {
				System.out.println("Informe o elemento da matriz - linha:"+l+" - coluna:"+c);
				numeros[l][c]=entrada.nextInt();
				totalSoma+=numeros[l][c];
			}
		}
		
		//Soma Matriz
		for(int l=0;l<4;l++) {//linha(trava)
			somaLinha=0;
			somaColuna=0;
			for(int c=0;c<4;c++) {//coluna(movimenta)
				somaLinha += numeros[l][c];
				somaColuna += numeros[c][l];
			}
			System.out.println("Soma linha "+l+":"+somaLinha);
			System.out.println("Soma linha "+l+":"+somaColuna);
			System.out.println("");
		}
		System.out.println("Soma Total:"+totalSoma);
		
	}

}
