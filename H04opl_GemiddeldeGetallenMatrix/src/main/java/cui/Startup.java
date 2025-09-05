package cui;

import java.util.Scanner;

public class Startup {

	public static void main(String arg[]) {
		new Startup().berekenGemiddeldeVanGetallenInTweedimensionaleArray();
	}

	private void berekenGemiddeldeVanGetallenInTweedimensionaleArray() {
		double getallenMatrix[][] = new double[3][2]; // 3 rijen, 2 kolommen

		for (int rij = 0; rij < getallenMatrix.length; rij++)
			for (int kolom = 0; kolom < getallenMatrix[rij].length; kolom++) {
				getallenMatrix[rij][kolom] = geefElement(rij + 1, kolom + 1);
			}

		double som = 0;
		int aantalGetallen = 0;
		for (double[] rij : getallenMatrix) {
			for (double getal : rij) {
				som += getal;
			}
			aantalGetallen += rij.length;
		}

		System.out.printf("%nHet gemiddelde van alle getallen in de matrix is %.1f", som / aantalGetallen);
	}

	private double geefElement(int rij, int kolom) {
		Scanner invoer = new Scanner(System.in);
		System.out.printf("Geef getal op rij %d en kolom %d: ", rij, kolom);
		return invoer.nextDouble();
	}
}
