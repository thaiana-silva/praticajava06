package praticajava06;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
	Scanner leia = new Scanner(System.in)) {
	int totalPares = 0;
	int totalImpares = 0;
	
	for (int i = 1; i <= 10; i++) {
	    System.out.print("Digite o " + i + "º número: ");
	    int numero = leia.nextInt();
	    
	    if (numero % 2 == 0) {
	        totalPares++;
	    } else {
	        totalImpares++;
	    }
	}
	
	System.out.println("Total de números pares: " + totalPares);
	System.out.println("Total de números ímpares: " + totalImpares);
}

	}

}
