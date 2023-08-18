package javanado;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int tab[][] = new int[4][5];
		int bonus = 0, cat = 0, cont = 0;

		for (int i = 0; i < 4; i++) {

			System.out.println("Digite o codigo do cliente: ");
			tab[i][0] = entrada.nextInt();

			System.out.println("Digite a quantidade de milhagem: ");
			tab[i][1] = entrada.nextInt();

			System.out.println("Digite a sua categoria: ");
			tab[i][2] = entrada.nextInt();

			while (tab[i][2] != 1 && tab[i][2] != 2 && tab[i][2] != 3) {
				System.out.println("Digite a categoria correta: ");
				tab[i][2] = entrada.nextInt();
			}
			if (tab[i][2] == 1) {
				tab[i][3] = 10000;
				;
			} else {
				if (tab[i][2] == 2) {
					tab[i][3] = 5000;
					;

				} else {
					tab[i][3] = 0;
					;
				}

			}
			tab[i][4] = tab[i][3] + tab[i][1];
		}
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 5; c++) {
				System.out.print(tab[l][c] + "\t");
			}
			System.out.println("");
		}
	}

}
