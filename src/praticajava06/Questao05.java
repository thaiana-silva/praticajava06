package praticajava06;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			int numero;
			int somaPositivos = 0;
			
			do {
			    System.out.print("Digite um número: ");
			    numero = leia.nextInt();
			    
			    if (numero > 0) {
			        somaPositivos += numero;
			    }
			} while (numero != 0);
			
			System.out.println("A soma dos números positivos é: " + somaPositivos);
		}
	}

}
