package cui;

import java.security.SecureRandom;

public class VierOpEenRijApp {

	public static void main(String[] args) {
		new VierOpEenRijApp().vulArrayEnControleerOpVierOpEenRij();
	}

	private void vulArrayEnControleerOpVierOpEenRij() {
		SecureRandom sr = new SecureRandom();
		char[] karakters = new char[10];
		for (int i = 0; i < karakters.length; i++) {
			karakters[i] = sr.nextBoolean() ? 'X' : 'O';
		}

		// check hier of karakters vier zelfde karakters op rij bevat
		// en verzorg de uitvoer
		int rijLengte = 0;
		int huidigKarakter = karakters[0];
		for (char c : karakters) {
			if (c == huidigKarakter) {
				rijLengte++;
				if (rijLengte == 4)
					break;
			} else {
				rijLengte = 1;
				huidigKarakter = c;
			}
		}
		System.out.print("De rij karakters: ");
		for (char c : karakters) {
			System.out.print(c + " ");
		}
		System.out.printf("%nDeze rij bevat %svier op een rij...", rijLengte == 4 ? "" : "geen ");
	}

}