package src;

public class exemple_ {
	public static void main(String[] args) { // Laço for each

		String[] vect = new String[] { "Maria", "Bob", "Alex" };

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);

		}
		System.out.println("-----------------");
		for (String obj : vect) {
			System.out.println(obj);
		}
	}
}