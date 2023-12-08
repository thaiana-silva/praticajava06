package praticajava06;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			int idade;
			int identidadeGenero;
			int pessoaDesenvolvedora;
			int totalBackend = 0;
			int totalMulheresFrontend = 0;
			int totalHomensMobileAcima40 = 0;
			int totalNaoBinariosFullStackMenor30 = 0;
			int totalPessoas = 0;
			int somaIdades = 0;

			String continuar;

			do {
			    System.out.print("Idade: ");
			    idade = leia.nextInt();
			    System.out.print("Identidade de Gênero: ");
			    identidadeGenero = leia.nextInt();
			    System.out.print("Pessoa Desenvolvedora: ");
			    pessoaDesenvolvedora = leia.nextInt();

			    if (pessoaDesenvolvedora == 1) {
			        totalBackend++;
			    } else if (pessoaDesenvolvedora == 2 && (identidadeGenero == 1 || identidadeGenero == 4)) {
			        totalMulheresFrontend++;
			    } else if (pessoaDesenvolvedora == 3 && (identidadeGenero == 2 || identidadeGenero == 5) && idade > 40) {
			        totalHomensMobileAcima40++;
			    } else if (pessoaDesenvolvedora == 4 && identidadeGenero == 3 && idade < 30) {
			        totalNaoBinariosFullStackMenor30++;
			    }

			    totalPessoas++;
			    somaIdades += idade;

			    System.out.print("Deseja continuar (S/N): ");
			    continuar = leia.next();
			} while (continuar.equalsIgnoreCase("S"));

			System.out.println("Total de pessoas desenvolvedoras Backend: " + totalBackend);
			System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + totalMulheresFrontend);
			System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + totalHomensMobileAcima40);
			System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + totalNaoBinariosFullStackMenor30);
			System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);

			double mediaIdades = (double) somaIdades / totalPessoas;
			System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f%n", mediaIdades);
		}
	}

}
