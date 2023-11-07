package cui;

import java.util.Scanner;

public class GezinsuitgavenApp {

	public static void main(String[] args) {
		new GezinsuitgavenApp().toonMaandenMetUitgavenBovenGemiddelde();
	}

	private Scanner invoer = new Scanner(System.in);

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
			System.out.printf("In de volgende maanden werd een omzet behaald groter dan het gemiddelde: %s%n", result);
		} else {
			System.out.printf("Geen maanden gevonden die meer omzet hebben dan het gemiddelde!%n");
		}
	}

	private double geefUitgave(int maand) {
		System.out.printf("Geef de uitgaven in voor maand %d : ", maand);
		return invoer.nextDouble();
	}
}