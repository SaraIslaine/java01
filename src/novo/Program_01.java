package novo;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;


public class Program_01 {
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumferencia(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("circumferencia %.2f%n", c);
		System.out.printf("volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		sc.close();
	}	
}