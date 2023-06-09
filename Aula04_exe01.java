package repeticao;

import java.util.Scanner;

public class Aula04_exe01 {

	public static void main(String[] args) {

		// classe scanner entrada/saida
		Scanner entrada = new Scanner(System.in);

		// variaveis
		int idade = 0, cont = 0;
		int faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0, faixa5 = 0;

		// repetição variavel de controle
		for (int i = 0; i < 4; i++) {

			System.out.println("Digite sua idade:");
			idade = entrada.nextInt();

			// estrutura de seleção
			if (idade <= 15) {
				faixa1++;
			} // fim if 15
			else if (idade <= 30) {
				faixa2++;
			} // fim if 30
			else if (idade <= 45) {
				faixa3++;
			} // fim if 45
			else if (idade <= 60) {
				faixa4++;
			} // fim if 60
			else {
				faixa5++;
			}//fim else

		} // for
		//mostrar no console (escreval do VisualG)
		System.out.println("1° Faixa:"+faixa1);
		System.out.println("2° Faixa:"+faixa2);
		System.out.println("3° Faixa:"+faixa3);
		System.out.println("4° Faixa:"+faixa4);
		System.out.println("5° Faixa:"+faixa5);
		
		//Conta
		System.out.println("Porcentagem 1° Faixa:"+ (double)faixa1/4*100+"%");
		
	}// void
}// class
