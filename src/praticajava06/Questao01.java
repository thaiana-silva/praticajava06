package praticajava06;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			System.out.println("Digite o primeiro número do intervalo: ");
	        int primeiroNumero = leia.nextInt();

	        System.out.println("Digite o último número do intervalo: ");
	        int ultimoNumero = leia.nextInt();

	        if (primeiroNumero >= ultimoNumero) {
	            System.out.println("Intervalo inválido!");
	        } else {
	            System.out.println("No Intervalo entre " + primeiroNumero + " e " + ultimoNumero + ":");
	            for (int i = primeiroNumero; i <= ultimoNumero; i++) {
	                if (i % 3 == 0 && i % 5 == 0) {
	                    System.out.println(i + " é múltiplo de 3 e 5");
	                }
	            }
	        }
		}
	}

}
