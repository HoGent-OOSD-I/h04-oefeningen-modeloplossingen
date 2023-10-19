package domein;

public class Tankstation {
	private int[] pompen;

	public Tankstation() {
		pompen = new int[5];
		for (int i = 0; i < pompen.length; i++) {
			pompen[i] = 100;
		}
	}

	public boolean tank(int pompNummer, int aantalLiter) {
		boolean geldigeTankbeurt = pompNummer >= 1 && pompNummer <= 5 && aantalLiter >= 5 && aantalLiter <= 80
				&& pompen[pompNummer - 1] >= aantalLiter;
		if (geldigeTankbeurt)
			pompen[pompNummer - 1] -= aantalLiter;
		return geldigeTankbeurt;
	}

	public int geefInhoud(int pompNummer) {
		if (pompNummer >= 1 && pompNummer <= 5)
			return pompen[pompNummer - 1];
		return -1;
	}

	public String toString() {
		String resultaat = "";
		for (int i = 0; i < pompen.length; i++) {
			resultaat += String.format("Pomp #%d: %d liter%n", i + 1, pompen[i]);
		}
		return resultaat;
	}

}
