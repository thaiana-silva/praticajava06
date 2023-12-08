package praticajava06;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			int numero;
			int somaMultiplos = 0;
			int quantidadeMultiplos = 0;
			
			do {
			    System.out.print("Digite um número: ");
			    numero = leia.nextInt();
			    
			    if (numero != 0 && numero % 3 == 0) {
			        somaMultiplos += numero;
			        quantidadeMultiplos++;
			    }
			} while (numero != 0);
			
			double media = 0.0;
			if (quantidadeMultiplos != 0) {
			    media = (double) somaMultiplos / quantidadeMultiplos;
			}
			
			System.out.println("A média de todos os números múltiplos de 3 é: " + media);
		}
	}

}
