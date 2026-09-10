package cui;

import java.util.ArrayList;
import java.util.List;

public class Startup {

	void main() {
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
		IO.println(String.format("%nInkomsten (totaal = %.2f Euro):", totaalInkomsten));
		for (Double inkomst : inkomsten) {
			IO.print(String.format("%.2f  ", inkomst));
		}
		IO.println(String.format("%n%nUitgaven (totaal = %.2f Euro):", totaalUitgaven));
		for (Double uitgave : uitgaven) {
			IO.print(String.format("%.2f  ", uitgave));
		}
	}

	private double geefBedrag() {
		String invoer = IO.readln("Geef bedrag op (0 om te stoppen) > ").replace(",",".");
		return Double.parseDouble(invoer);
	}
}
