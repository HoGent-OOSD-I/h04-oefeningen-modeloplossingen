package domein;

public class Parking {
	private String[] nummerplaten = new String[5];

	public int parkeer(String nummerplaat) {
		if (nummerplaat == null || nummerplaat.isBlank() || nummerplaat.length() < 3 || nummerplaat.length() > 9)
			return -1;
		for (int index = 0; index < nummerplaten.length; index++) {
			if (nummerplaten[index] == null) {
				nummerplaten[index] = nummerplaat;
				return index;
			}
		}
		return -1;
	}

	public boolean verlaat(String nummerplaat) {
		for (int index = 0; index < nummerplaten.length; index++) {
			if (nummerplaten[index] != null && nummerplaten[index].equals(nummerplaat)) {
				nummerplaten[index] = null;
				return true;
			}
		}
		return false;
	}

	public int geefAantalVrijePlaatsen() {
		int aantalVrij = 0;
		for (String np : nummerplaten) {
			aantalVrij += np == null ? 1 : 0;
		}
		return aantalVrij;
	}

	public String toString() {
		String plaatsen = "";
		for (int i = 0; i < nummerplaten.length; i++) {
			plaatsen += String.format("%12d", i);
		}
		plaatsen += "\n";
		for (String np : nummerplaten) {
			plaatsen += String.format("%12s", np == null ? "--vrij--" : np);
		}
		return plaatsen;
	}
}
