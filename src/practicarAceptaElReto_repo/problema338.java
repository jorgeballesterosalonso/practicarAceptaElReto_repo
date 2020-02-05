package practicarAceptaElReto_repo;

import java.util.ArrayList;
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
			ArrayList<Integer> memoria = new ArrayList<Integer>();

			for (int i = 1; i <= cant; i++) {

				for (int j = 1; j <= mem; j++) {
					memoria.add(examenes.get(j));

				}

			}

			// Averiguar copias totales
			LinkedHashSet<Integer> copiastot = new LinkedHashSet<Integer>();
			for (int i = 1; i <= cant; i++) {
				copiastot.add(examenes.get(i));
			}
			int totalcopias = examenes.size()-copiastot.size();
			System.out.println(totalcopias);
			//copias totales terminado

			System.out.println(examenes.toString());
			System.out.println(memoria.toString());

		}

	}

}
