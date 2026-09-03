package segundo_projeto;

import java.util.Locale;
import java.util.Scanner;

public class Ativ_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        int n;
		
		System.out.print("Quantos numeros voce vai digitar? ");
	    n = sc.nextInt();

	    int[] vetor = new int[n];

	    for (int i=0; i<n; i++) {
	    	System.out.print("Digite um numero: ");
	        vetor[i] = sc.nextInt();
	    }

	    System.out.println("NUMEROS NEGATIVOS:");

	    for (int i=0; i<n; i++) {
	        if (vetor[i] < 0) {
	        	System.out.printf("%d\n", vetor[i]);
	        }
	    }

		sc.close();
	}
}
