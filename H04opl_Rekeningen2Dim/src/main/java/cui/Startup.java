package cui;

import java.util.Scanner;

import domein.Rekening;

public class Startup {
	public static void main(String[] args) {
		new Startup().werkMetTweedimArrayVanRekeningObjecten();
	}

	private void werkMetTweedimArrayVanRekeningObjecten() {
		Scanner input = new Scanner(System.in);

		Rekening rekeningen[][] = new Rekening[3][];
		for (int rij = 0; rij < rekeningen.length; rij++) {
			int aantalKolommen = vraagAantalKolommen(rij + 1);
			rekeningen[rij] = new Rekening[aantalKolommen];
			for (int kolom = 0; kolom < rekeningen[rij].length; kolom++) {
				rekeningen[rij][kolom] = new Rekening();
				rekeningen[rij][kolom].stort(10 * (rij + 1) + kolom + 1);
			}
		}

		for (Rekening[] rij : rekeningen) {
			for (Rekening rek : rij)
				System.out.printf("%-8.0f", rek.getSaldo());
			System.out.println();
		}
	}

	private int vraagAantalKolommen(int rij) {
		Scanner invoer = new Scanner(System.in);
		boolean geldigeInvoer;
		int aantalKolommen;
		do {
			System.out.printf("Geef aantal kolommen in voor rij %d: ", rij);
			aantalKolommen = invoer.nextInt();
			geldigeInvoer = aantalKolommen > 0;
			if (!geldigeInvoer)
				System.out.printf("Rij %d moet minstens 1 kolom hebben!%n", rij);
		} while (!geldigeInvoer);
		return aantalKolommen;
	}
}