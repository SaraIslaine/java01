package segundo_projeto;

import java.util.Locale;
import java.util.Scanner;

public class Ativ_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS");	
		for (int i=0; i<n; i++) {
			if (vet[i] < 0) {
			System.out.println(vet[i]);
		}
		}
		sc.close();
	}

}
