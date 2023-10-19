package cui;

import java.util.Scanner;

import domein.Tankstation;

public class TankstationApp {

	public static void main(String[] args) {
		new TankstationApp().startTanken();
	}

	private void startTanken() {
		Tankstation tankStation = new Tankstation();
		int totaalLiterGetankt = 0, aantalSuccesvolleTankBeurten = 0;
		int pompNummer = geefPompNummer();
		while (pompNummer != 0) {
			int aantalLiter = geefAantalLiter();
			if (tankStation.tank(pompNummer, aantalLiter)) {
				System.out.printf("Je hebt %d liter getankt aan pomp %d%n", aantalLiter, pompNummer);
				totaalLiterGetankt += aantalLiter;
				aantalSuccesvolleTankBeurten++;
			} else
				System.out.printf("Sorry, er is onvoldoende brandstof aan pomp %d%n", pompNummer);
			System.out.printf("%nOverzicht pompen:%n");
			System.out.printf("%s%n", tankStation);
			pompNummer = geefPompNummer();
		}
		if (aantalSuccesvolleTankBeurten != 0)
			System.out.printf("Er werd in totaal %d liter getankt in %d tankbeurt%s.", totaalLiterGetankt,
					aantalSuccesvolleTankBeurten, aantalSuccesvolleTankBeurten == 1 ? "" : "en");
		else {
			System.out.println("Er waren geen tankbeurten:");
			System.out.printf("%s%n", tankStation);
		}
	}

	private int geefAantalLiter() {
		Scanner invoer = new Scanner(System.in);
		boolean geldigeInvoer;
		int aantalLiter;
		do {
			System.out.print("Hoeveel liter wens je te tanken (5 tot 80)? ");
			aantalLiter = invoer.nextInt();
			geldigeInvoer = aantalLiter >= 5 && aantalLiter <= 80;
			if (!geldigeInvoer)
				System.out.println("Je moet minstens 5 en kan maximaal 80 liter tanken...");
		} while (!geldigeInvoer);
		return aantalLiter;
	}

	private int geefPompNummer() {
		Scanner invoer = new Scanner(System.in);
		boolean geldigeInvoer;
		int pompNummer;
		do {
			System.out.print("Aan welke pomp wil je tanken (1-5), druk 0 om te stoppen? ");
			pompNummer = invoer.nextInt();
			geldigeInvoer = pompNummer >= 0 && pompNummer <= 5;
			if (!geldigeInvoer)
				System.out.printf("We hebben geen pomp met nummer %d! Probeer opnieuw...%n", pompNummer);
		} while (!geldigeInvoer);
		return pompNummer;
	}
}
