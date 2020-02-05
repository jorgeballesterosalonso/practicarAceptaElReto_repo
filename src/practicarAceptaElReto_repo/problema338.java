package practicarAceptaElReto_repo;

import java.util.HashMap;
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

			for (int i = 1; i <= cant; i++) {
				examenes.get(i);

			}

			System.out.println(examenes.toString());

		}

	}

}
