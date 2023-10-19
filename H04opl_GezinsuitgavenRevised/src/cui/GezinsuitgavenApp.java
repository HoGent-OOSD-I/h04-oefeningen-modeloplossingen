package cui;

import java.util.Scanner;

public class GezinsuitgavenApp {

	public static void main(String[] args) {
		new GezinsuitgavenApp().toonMaandenMetUitgavenBovenGemiddelde();
	}

	private void toonMaandenMetUitgavenBovenGemiddelde() {
		Scanner invoer = new Scanner(System.in);
		double[] uitgaven = new double[12];

		double gemiddelde = 0;
		for (int i = 0; i < uitgaven.length; i++) {
			System.out.printf("Geef de uitgaven in voor maand %d: ", i + 1);
			uitgaven[i] = invoer.nextDouble();
			gemiddelde += uitgaven[i] / uitgaven.length;
		}

		String maandenMetUitgaveGroterDanGemiddelde = "";
		for (int i = 0; i < uitgaven.length; i++)
			if (uitgaven[i] > gemiddelde)
				maandenMetUitgaveGroterDanGemiddelde += String.format("%d ", i + 1);

		if (!maandenMetUitgaveGroterDanGemiddelde.isEmpty())
			System.out.printf("In de volgende maanden werd een omzet behaald groter dan het gemiddelde: %s",
					maandenMetUitgaveGroterDanGemiddelde);
		else
			System.out.printf("Er zijn geen maanden met uitgaven hoger dan het gemiddelde!");
	}
}
