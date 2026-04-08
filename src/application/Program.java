package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		Triangle X,Y;
		X = new Triangle();
		Y = new Triangle();
		
		System.out.println("Enter the measures of triangle x: ");
		X.a = sc.nextDouble();
		X.b = sc.nextDouble();
		X.c = sc.nextDouble();
	    System.out.println("Enter the measures of triangle y: ");
	    Y.a = sc.nextDouble();
	    Y.b = sc.nextDouble();
	    Y.c = sc.nextDouble();
		
		double p = (X.a + X.b + X.c) / 2.0;
		double areaX = 	Math.sqrt(p * (p - X.a) * (p - X.b) * (p - X.c));
		
		p = (Y.a + Y.b + Y.c) / 2.0;
		double areaY = 	Math.sqrt(p * (p - Y.a) * (p - Y.b) * (p - Y.c));

        System.out.printf("Triangulo x area: %.4f%n", areaX);
        System.out.printf("Triangulo x area: %.4f%n", areaY);
		
        if( areaX > areaY) {
        	System.out.println("Larger area: x");
        }
        else {
        	System.out.println("Larger area: y");
        }
		
		sc.close();
	}

}
