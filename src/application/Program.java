package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();

		System.out.print("How many studentes for course A? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int amount = sc.nextInt();
			a.add(amount);

		}

		System.out.print("How many studentes for course B? ");
		int y = sc.nextInt();

		for (int i = 0; i < y; i++) {
			int amount = sc.nextInt();
			b.add(amount);

		}

		System.out.print("How many studentes for course C? ");
		int z = sc.nextInt();

		for (int i = 0; i < z; i++) {

			int amount = sc.nextInt();
			b.add(amount);

		}

		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total students: " + total.size());
		
		sc.close();
	}
}
