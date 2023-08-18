package javanado;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int m[][]=new int[2][2];
		int r[][]=new int[2][2];
		int maiorElemento=0;
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.println("Informe o número M["+i+","+j+"]:");
				m[i][j]=entrada.nextInt();
				
				
				//maior elemento
				if(m[i][j]>maiorElemento) {
					maiorElemento=m[i][j];
				}
				
			}
		}
		//Mostrar Multiplicação
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				r[i][j] = m[i][j]*maiorElemento;
				System.out.println("Resultado - Matriz R["+i+","+j+"]:"+r[i][j]);
				
			}
		}
	}

}
