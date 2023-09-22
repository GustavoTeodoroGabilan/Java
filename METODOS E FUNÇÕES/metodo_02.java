package Javiosa;

import java.util.Scanner;

public class metodo_02 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao = 0;

		while (opcao != 5) {

			System.out.println("1 - Adição");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Sair");

			System.out.println("Digite a opção: ");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				adicao();
				break;
			case 2:
				subtracao();
				break;
			case 3:
				multiplicacao();
				break;
			case 4:
				divisao();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Opção invalida - Digite Novamente:");
			}
		}
	}// final main

	public static void adicao() {
		System.out.println("Rotina Adição");

		int n1 = 0, n2 = 0, r = 0;

		System.out.println("Digite o primeiro numero:");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo numero:");
		n2 = entrada.nextInt();

		r = n1 + n2;
		System.out.println("Resultado: " + r);
	}

	public static void subtracao() {
		System.out.println("Rotina Subtração");

		int n1 = 0, n2 = 0, r = 0;

		System.out.println("Digite o primeiro numero:");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo numero:");
		n2 = entrada.nextInt();

		r = n1 - n2;
		System.out.println("Resultado: " + r);
	}

	public static void multiplicacao() {
		System.out.println("Rotina Multiplicação");

		int n1 = 0, n2 = 0, r = 0;

		System.out.println("Digite o primeiro numero:");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo numero:");
		n2 = entrada.nextInt();

		r = n1 * n2;
		System.out.println("Resultado: " + r);
	}

	public static void divisao() {
		System.out.println("Rotina Divisão");

		int n1 = 0, n2 = 0, r = 0;

		System.out.println("Digite o primeiro numero:");
		n1 = entrada.nextInt();
		System.out.println("Digite o segundo numero:");
		n2 = entrada.nextInt();

		r = n1 / n2;
		System.out.println("Resultado: " + r);
	}

}
