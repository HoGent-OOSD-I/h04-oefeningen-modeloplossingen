package ui;

import java.util.Scanner;

import domein.Marktkraam;

public class RommelmarktApp {
	public static void main(String[] args) {
		new RommelmarktApp().simuleerRommelmarkt();
	}

	private void simuleerRommelmarkt() {
		int aantalKramen = geefAantalKramen();
		Marktkraam[] markt = new Marktkraam[aantalKramen];
		for (int i = 0; i < markt.length; i++)
			markt[i] = new Marktkraam(geefKraamhouder(i + 1), geefBreedteKraam(i + 1));
		System.out.printf("%nDe rommelmarkt is open!%n%n");

		String menu = "";
		for (int i = 0; i < markt.length; i++)
			menu += String.format("%d. Kraam van %s.%n", i + 1, markt[i].getKraamhouder());

		int keuze = geefKeuze(aantalKramen, menu);
		while (keuze != 0) {
			double bedrag = geefBedrag();
			markt[keuze - 1].ontvang(bedrag);
			keuze = geefKeuze(aantalKramen, menu);
		}

		System.out.printf("%nDe rommelmarkt is gesloten!%n");
		for (Marktkraam marktkraam : markt) {
			double balans = marktkraam.geefWinst();
			System.out.printf("Kraamhouder %s maakte %.2f Euro %s%n", marktkraam.getKraamhouder(),
					balans >= 0 ? balans : -1 * balans, balans >= 0 ? "winst" : "verlies");
		}
	}

	private double geefBedrag() {
		Scanner invoer = new Scanner(System.in);
		double bedrag;
		boolean geldigeInvoer;
		do {
			System.out.print("Geef op voor hoeveel Euro je kocht: ");
			bedrag = invoer.nextDouble();
			geldigeInvoer = bedrag > 0;
			if (!geldigeInvoer)
				System.out.println("De prijs moet strikt positief zijn...");
		} while (!geldigeInvoer);
		return bedrag;
	}

	private int geefKeuze(int aantalKramen, String menu) {
		Scanner invoer = new Scanner(System.in);
		int keuze;
		boolean geldigeInvoer;
		do {
			System.out.printf("%nAan welk kraam wil je iets kopen?%n");
			System.out.println(menu);
			System.out.print("Kies je kraam (of geef 0 om te stoppen): ");
			keuze = invoer.nextInt();
			geldigeInvoer = keuze >= 0 && keuze <= aantalKramen;
			if (!geldigeInvoer)
				System.out.println("Dit is geen geldige keuze! Probeer opnieuw...");
		} while (!geldigeInvoer);
		return keuze;
	}

	private int geefAantalKramen() {
		Scanner invoer = new Scanner(System.in);
		int aantal;
		boolean geldigeInvoer;
		do {
			System.out.print("Geef het aantal kramen dat op de rommelmarkt staat op: ");
			aantal = invoer.nextInt();
			geldigeInvoer = aantal > 0;
			if (!geldigeInvoer)
				System.out.println("Het aantal moet groter dan 0 zijn, probeer opnieuw...");
		} while (!geldigeInvoer);
		return aantal;
	}

	private String geefKraamhouder(int kraamnummer) {
		Scanner invoer = new Scanner(System.in);
		String houder;
		boolean geldigeInvoer;
		do {
			System.out.printf("Geef de naam van de kraamhouder voor kraam %d op: ", kraamnummer);
			houder = invoer.nextLine();
			geldigeInvoer = houder != null && !houder.isBlank();
			if (!geldigeInvoer)
				System.out.println("De naam van de kraamhouder moet je opgeven...");
		} while (!geldigeInvoer);
		return houder;
	}

	private int geefBreedteKraam(int kraamnummer) {
		Scanner invoer = new Scanner(System.in);
		int breedte;
		boolean geldigeInvoer;
		do {
			System.out.printf("Geef de  breedte van kraam %d op: ", kraamnummer);
			breedte = invoer.nextInt();
			geldigeInvoer = breedte >= 2 && breedte <= 10;
			if (!geldigeInvoer)
				System.out.println("De breedte moet tussen 2 en 10 meter liggen...");
		} while (!geldigeInvoer);
		return breedte;
	}

}
