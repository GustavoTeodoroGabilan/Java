package javanado;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int[][] sem1 = new int[5][3];
		int[][] sem2 = new int[5][3];
		int[][] anual = new int[5][3];
		int[] somaUni = new int[3];
		int[] somaCurso = new int[5];
		int maiorNum = 0;
		int curso =0;
		int unidade = 0;
		
		//Exercicio A
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 3; c++) {
				sem1[l][c] = (int) (Math.random() * 10);
				sem2[l][c] = (int) (Math.random() * 10);
				anual[l][c] = sem1[l][c] + sem2 [l][c];
				
				}

			}
		//Exercicio B
		for(int c=0;c<3;c++) {
			for(int l=0;l<5;l++) {
				somaUni[c] += anual[l][c];
			}
		}
		
		//Exercicio C
		for(int c=0;c<5;c++) {
			for(int l=0;l<3;l++) {
				somaCurso[c] += anual[c][l];
				
			}
			
		}
				
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(sem1[l][c] + "\t");

			}
			System.out.println("");
		}
		System.out.println("------------------------------------------");
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(sem2[l][c] + "\t");

			}
			System.out.println("");
		}
		System.out.println("------------------------------------------");
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(anual[l][c] + "\t");
				
			}
			System.out.println("");
		}
		
		for(int c=0;c<3;c++) {
			System.out.print(somaUni[c]+"\t");
			
		}
		
		for(int c=0;c<3;c++) {
			System.out.print(somaCurso[c]+"\t");
			
			
		}
		
		//Exercicio D
		System.out.println("------------------------------------------");
		for(int l=0;l<5;l++) {
			maiorNum=0;
			for(int c=0;c<3;c++) {
				
				if(l==0 && c==0) {
					maiorNum = anual[l][c];
					unidade = c+1;
					curso = l+1;
					
				}else {
					if(maiorNum<anual[l][c]) {
						maiorNum=anual[l][c];
						unidade = c+1;
						curso = l+1;
					}
				}
				
				
				
			}
			System.out.println("curso "+curso+" - "+maiorNum+" - Unidade "+unidade );
			
		}
	}

}
