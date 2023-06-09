import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mudando a sintaxe do Scanner para 'e'
		Scanner e = new Scanner(System.in);
		//adicionando uma variavel que coloca os numero quebrados em apenas numeros com 2 casas decimais
		DecimalFormat fMoeda = new DecimalFormat("R$ ##0.00");

		//esse 'nome="" e so para mostrar que o string nao tem valor ainda'
		String nome = "";
		int pc = 0, mod = 0, quantPc = 0, var = 0,quantPc2 = 0;
		double preco = 0;

		System.out.println("Digite o nome do cliente");
		nome = e.next();
		//enquanto var for diferente de '1'
		while ( var != 1) {
			System.out.println("Digite o tipo do computador (1-Desktop e 2-Notebook)");
			pc = e.nextInt();
			//se pc for igual a 0 OU menor que 2
			//pc é o modelo (notebook ou desktop)
			if (pc == 0 || pc > 2) {
				var++;
			}
			//enquanto var for diferente de 1
			if ( var != 1) {
				System.out.println("Digite o modelo do computador");
				System.out.println("3 - processador I3");
				System.out.println("5 - processador I5");
				System.out.println("7 - processador I7");
				//adiciona o valor a variavel mod
				//mod e o modelo do processador (i3,i5,i7)
				mod = e.nextInt();
				System.out.println("Digite a quantidade de computadores: ");
				quantPc = e.nextInt();
				//fazendo as contas da quantidade de computadores requisitados
				quantPc2+= quantPc;
				
				//se pc for igual a 1
				if (pc == 1) {
					// desk
					//preço = valor do produto + quantidade de pcs
					//caso modelo seja o i3
					if (mod == 3) {
						preco += 1801 * quantPc;
					} else {
						//preço = valor do produto + quantidade de pcs
						//caso modelo seja o i5
						if (mod == 5) {
							preco += 2429 * quantPc;
						} else {
							//preço = valor do produto + quantidade de pcs
							//caso modelo seja o i3
							if (mod == 7) {
								preco += 3150 * quantPc;
							} else {
								//se não for nenhuma das alternativas
								System.out.println("Modelo não encontrado");
							}
						}
					}
				} else {
					// note
					//preço = valor do produto + quantidade de pcs
					//caso modelo seja o i3
					if (mod == 3) {
						preco += 1899 * quantPc;
					} else {
						//preço = valor do produto + quantidade de pcs
					    //caso modelo seja o i3
						if (mod == 5) {
							preco += 2799 * quantPc;
						} else {
							//preço = valor do produto + quantidade de pcs
					        //caso modelo seja o i3
							if (mod == 7) {
								preco += 3199 * quantPc;
							} else {
								//se não for nenhuma das alternativas
								System.out.println("Modelo não encontrado");
							}
						}
					}

				}//fim else
				

			}
		}
		System.out.println("Foram: "+quantPc2+" Computadores ");
		System.out.println("Valor Total: "+preco);

	}

}