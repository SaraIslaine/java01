
public class Ativ_01 {
public static void main(String[] args) {
	
	String product1 = "Computer";
	String product2 = "office desk";
	
	int age = 30;
	int code = 5290;
	char gender = 'F';
	
	double prince1 = 2100.0;
	double prince2 = 650.50;
	double measure = 53.234567;
	
	System.out.println("Products : ");
	System.out.printf("Computer, which is $ %.2f%n" , prince1);
	System.out.printf("office desk, which prince is $ %.2f%n " , prince2);
	System.out.println();
	System.out.printf("Record: %s years old, code %d and gender: %s %n", age,code,gender );
	System.out.println();
	System.out.printf("Measue With eight decimal places: %.8f%n", measure);
	System.out.printf("Roud (three decimal places): %.3f%n", measure);
	System.out.printf("US decimal point: %.3f%n", measure);
}
}
