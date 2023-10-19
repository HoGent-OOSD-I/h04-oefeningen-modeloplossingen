package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Startup {

	public static void main(String[] args) {
		new Startup().vraagBedragenEnToonInkomstenEnUitgaven();
	}

	private void vraagBedragenEnToonInkomstenEnUitgaven() {
		List<Double> inkomsten = new ArrayList<>();
		List<Double> uitgaven = new ArrayList<>();
		double totaalInkomsten = 0, totaalUitgaven = 0;
		double bedrag = geefBedrag();
		while (bedrag != 0) {
			if (bedrag <= -1) {
				totaalUitgaven -= bedrag;
				uitgaven.add(-bedrag);
			} else if (bedrag >= 1) {
				totaalInkomsten += bedrag;
				inkomsten.add(bedrag);
			}
			bedrag = geefBedrag();
		}
		System.out.printf("%nInkomsten (totaal = %.2f Euro):%n", totaalInkomsten);
		for (Double inkomst : inkomsten) {
			System.out.printf("%.2f  ", inkomst);
		}
		System.out.printf("%n%nUitgaven (totaal = %.2f Euro):%n", totaalUitgaven);
		for (Double uitgave : uitgaven) {
			System.out.printf("%.2f  ", uitgave);
		}
	}

	private double geefBedrag() {
		Scanner invoer = new Scanner(System.in);
		System.out.print("Geef bedrag op (0 om te stoppen) > ");
		return invoer.nextDouble();
	}
}
