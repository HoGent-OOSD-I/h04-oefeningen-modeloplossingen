package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartUpPuntenverwerking {
	public static void main(String[] args) {
		new StartUpPuntenverwerking().verwerkPunten();
	}

	private void verwerkPunten() {

		// lijst opvullen
		List<String> studenten = new ArrayList<>();
		studenten.add("Imani");
		studenten.add("Tanaka");
		studenten.add("Ayana");
		studenten.add("Yaro");
		studenten.add("Diara");
		studenten.add("Lente");
		studenten.add("Jin");
		studenten.add("Sem");
		studenten.add("Zaur");
		studenten.add("Nyasha");

		List<String> geslaagden = new ArrayList<>();
		List<String> nietGeslaagden = new ArrayList<>();

		for (String student : studenten) {
			int resultaat = geefResultaat(student);
			if (resultaat >= 10)
				geslaagden.add(student);
			else
				nietGeslaagden.add(student);
		}

		// lijsten laten zien
		if (geslaagden.isEmpty())
			System.out.println("Geen enkel student slaagde...");
		else {
			System.out.println("Volgende studenten zijn geslaagd: ");
			for (String student : geslaagden)
				System.out.println(student);
		}
		if (nietGeslaagden.isEmpty())
			System.out.println("Er waren geen niet geslaagden");
		else {
			System.out.println("Volgende studenten zijn niet geslaagd: ");
			for (String student : nietGeslaagden)
				System.out.println(student);
		}
	}

	private int geefResultaat(String student) {
		Scanner invoer = new Scanner(System.in);
		boolean geldigeInvoer;
		int resultaat;
		do {
			System.out.printf("Geef resultaat van %s (0-20) > ", student);
			resultaat = invoer.nextInt();
			geldigeInvoer = resultaat >= 0 && resultaat <= 20;
			if (!geldigeInvoer)
				System.out.println("Een geldig resultaat ligt tussen 0 en 20!");
		} while (!geldigeInvoer);
		return resultaat;

	}
}
