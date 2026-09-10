package cui;

public class GezinsuitgavenApp {

	void main() {
		toonMaandenMetUitgavenBovenGemiddelde();
	}


	private void toonMaandenMetUitgavenBovenGemiddelde() {

		double[] maanden = new double[12];


		for (int i = 0; i < maanden.length; i++) {
			maanden[i] = geefUitgave(i + 1);
		}

		double gem = 0.0;
		for (double maand : maanden)
			gem += maand;
		gem /= maanden.length;

		String result = "";
		for (int i = 0; i < maanden.length; i++) {
			if (maanden[i] > gem) {
				result += String.format("%d ", i + 1);
			}
		}

		if (!result.isEmpty()) {
			IO.println("In de volgende maanden werd er meer uitgegeven dan het gemiddelde: " + result);
		} else {
			IO.println("Geen maanden gevonden waarin meer werd uitgegeven dan het gemiddelde!");
		}
	}

	private double geefUitgave(int maand) {
		String invoer = IO.readln("Geef de uitgaven in voor maand " + maand + ": ").replace(",",".");
		return Double.parseDouble(invoer);
	}
}