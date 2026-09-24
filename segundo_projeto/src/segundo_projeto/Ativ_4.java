package segundo_projeto;

import java.util.Locale;
import java.util.Scanner;

public class Ativ_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seus Dados : ");
        String nome = sc.nextLine();
        int idade = sc.nextInt();
        int cpf = sc.nextInt();
        int n = sc.nextInt();
        
       
        int[] vetor = new int[n];
        
        for(int i=0; i< n; i++) {
        	System.out.println("Digite um numero");
        	vetor[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++ ) {
        	if (vetor[i] < 0) {
        		System.out.println(vetor[i]);
        	}
        }
        
        sc.close();
	}

}
