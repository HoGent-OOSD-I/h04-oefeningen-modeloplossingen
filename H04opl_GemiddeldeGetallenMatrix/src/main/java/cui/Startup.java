package cui;

public class Startup {

	void main() {
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

		IO.println(String.format("%nHet gemiddelde van alle getallen in de matrix is %.1f", som / aantalGetallen));
	}

	private double geefElement(int rij, int kolom) {
        String invoer = IO.readln("Geef getal op rij " + rij + " en kolom "+ kolom + ": ").replace(",", ".");
		return Double.parseDouble(invoer);
	}
}
