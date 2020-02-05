package practicarAceptaElReto_repo;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class problema338 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			HashMap<Integer, Integer> examenes = new HashMap<Integer, Integer>();

			int cant = sc.nextInt();
			int mem = sc.nextInt();

			for (int i = 1; i <= cant; i++) {
				int exam = sc.nextInt();
				examenes.put(i, exam);

			}
			LinkedHashSet<Integer> memoria = new LinkedHashSet<Integer>();

			// Copias detectadas
			for (int i = 1; i <= mem + 1; i++) {
				memoria.add(examenes.get(i));
				
			}
			// Averiguar copias totales
			LinkedHashSet<Integer> copiastot = new LinkedHashSet<Integer>();
			for (int i = 1; i <= cant; i++) {
				copiastot.add(examenes.get(i));

			}
			int totalcopias = examenes.size() - copiastot.size();
			// copias totales terminado

			System.out.println(totalcopias);
			System.out.println(examenes.toString());
			System.out.println(memoria.toString());

		}
	}
}
