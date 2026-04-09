import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int y = 32;
		double x = 10.35784;
		String nome = "Sara";
		int idade = 40;
		double renda = 60000.0;
		Scanner sc = new Scanner(System.in);

		System.out.println("qual a sua idade " + y);
		System.out.printf("%.2f%n", x);
		System.out.printf("qual a quilometragem %.4f%n ",+ x);
		Locale.setDefault(Locale.US);
		System.out.println("Bom dia! ");
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f metros%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
        
        
        sc.close();
	}
}
