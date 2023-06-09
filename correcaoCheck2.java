import java.text.DecimalFormat;
import java.util.Scanner;

public class correcaoCheck2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mudando a sintaxe do Scanner para 'e'
		Scanner e = new Scanner(System.in);
		//adicionando uma variavel que coloca os numero quebrados em apenas numeros com 2 casas decimais
		DecimalFormat numFormatado = new DecimalFormat("#,##0.00");
		//string = usar palavras como variavel
		String resp = "sim";
		//int = numero inteiro
		int idade = 0, contador = 0, expServico = 0, somaIdade = 0, contHomem = 0, contSim = 0, contNao = 0;
		//char = apenas uma unica letra
		char sexo, escolaridade;
		char contMedio = 0, contSuperior = 0, contPos = 0, contMestrado = 0, contDoutor = 0;

		//enquanto = enquanto a resposta for 'sim' o programa ira rodar
		//resp.equalsIgnoreCase = seria o '==' so que do String, ignorando letra maiuscula e minuscula
		while (resp.equalsIgnoreCase("sim")) {
			//coloca +1 na variavel contador
			contador++;
			//ao ser mostrado na tela
			System.out.println(contador + "� candidato");

			System.out.println("idade:");
			//adiciona o valor escrito acima a variavel idade
			idade = e.nextInt();

			System.out.println("Sexo:");
			//adiciona o valor escrito acima a variavel sexo
			sexo = e.next().toUpperCase().charAt(0);
			// validação
			//enquanto = enquanto a resposta for 'F' e 'M' o programa ira rodar
			while (sexo != 'F' && sexo != 'M') {
				System.out.println("Sexo M/F:");
				sexo = e.next().toUpperCase().charAt(0);
			}
			System.out.println("Digite a escolaridade: ");
			escolaridade = e.next().toUpperCase().charAt(0);
			// valida��o
			//enquanto = enquanto a resposta for diferente de'M', 'S', 'P', 'T' e 'D' o programa ira rodar
			while (escolaridade != 'M' && escolaridade != 'S' && escolaridade != 'P' && escolaridade != 'T'
					&& escolaridade != 'D') {
				System.out.println("Digite corretamente:");
				escolaridade = e.next().toUpperCase().charAt(0);
			}

			System.out.println("Experi�ncia no servi�o:");
			expServico = e.nextInt();
			// valida��o
			//enquanto = enquanto a resposta for diferente de '1' e '2' o programa ira rodar
			while (expServico != 1 && expServico != 2) {
				System.out.println("Experi�ncia no servi�o 1/2");
				expServico = e.nextInt();
			}

			// atualiza variavel resp
			System.out.println("Deseja cadastrar novo candidato?");
			resp = e.next();
			// valida��o
			//enquanto = enquanto a resposta for diferente de 'sim' ou 'nao' o programa ira rodar
			//'||' = ou
			while (!(resp.equalsIgnoreCase("sim") || (resp.equalsIgnoreCase("n�o")))) {
				System.out.println("Digite novamente:");
				resp = e.next();
			}

			// A
			// Idade m�dia de homens com experi�ncia
			//se o sexo for 'M' e a experiencia for '1'
			if (sexo == 'M' && expServico == 1) {
				//adiciona +1 ao cont homem, que seria a contagem de homens com experiencia
				contHomem++;
				//soma da somaidade + idade, ou seja "somaIdade = somaIdade + idade"
				somaIdade += idade;
			}

			// B
			// porcentagem candidatos com e sem experi�ncia
			// se a experiencia for '1' ele adiciona +1 ao contSim, senao, adiciona +1 ao contNao
			if (expServico == 1) {
				contSim++;
			} else {
				contNao++;
			}
			// C
			// Qtd de candidatos por escolaridade
			//switch = escolha
			//case = caso, ou seja, caso o comando seja de acordo, o codigo acontecera naquela linha
			//break = fim do caso
			switch (escolaridade) {
			case 'M':
				contMedio++;
				break;
			case 'S':
				contSuperior++;
				break;
			case 'P':
				contPos++;
				break;
			case 'T':
				contMestrado++;
				break;
			case 'D':
				contDoutor++;
				break;
			}

		} // fecha repeti��o

		// a)
		//mostra o texto, '+' para adicionar o valor ao texto, 'somaIdade / contHomem' seria a divisao das duas variaveis com numero inteiro
		System.out.println("M�dia Idade de homems com experiencia no servi�o: " + somaIdade / contHomem);

		// b)
		//mostra o texto, '+' para adicionar o valor ao texto,'(double)' transformar todos os valores das variaveis em numero real, permitindo assim a conta deles
		//caso contrario a conta nao sera feita
		//numFormatado.format( = variavel que coloca os numero quebrados em apenas numeros com 2 casas decimais 
		System.out.println("Porcentagem candidatos com experi�ncia: " + numFormatado.format((double) contSim / contador * 100));
		System.out.println("Porcentagem candidatos sem experi�ncia: " + (double) contNao / contador * 100);

		// c)
		System.out.println("Escolaridade m�dio: "+contMedio);
		System.out.println("Escolaridade Superior: "+contSuperior);
		System.out.println("Escolaridade P�s: "+contPos);
		System.out.println("Escolaridade Mestrado: "+contMestrado);
		System.out.println("Escolaridade Doutorado: "+contDoutor);

	}

}
