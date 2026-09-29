package exerci;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import list.Ativ1;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Ativ1> list = new ArrayList<>();

		System.out.print("How many employees will be registered ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println("Emplyoee #" + (i + 1) + ":");
			System.out.print("Id : ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already taken! try again: ");
				id = sc.nextInt();
			}
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			Ativ1 emp = new Ativ1(id, name, salary);

			list.add(emp);

		}
		System.out.println();
		System.out.println("Enter the employee id that will salary increase : ");
		int idsalary = sc.nextInt();

		Ativ1 emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

		// Integer pos = position(list, idsalary);
		if (emp == null) {
			System.out.println("this is does not exist ");
		} else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of empoyees:  ");
		for (Ativ1 e : list) {
			System.out.println(e);

		}
		sc.close();

	}

	public static Integer position(List<Ativ1> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static boolean hasId(List<Ativ1> list, int id) {
		Ativ1 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
