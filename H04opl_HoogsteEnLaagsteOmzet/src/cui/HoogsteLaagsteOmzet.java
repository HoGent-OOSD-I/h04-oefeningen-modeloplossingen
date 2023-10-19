package cui;

public class HoogsteLaagsteOmzet {
	public static void main(String args[]) {
		new HoogsteLaagsteOmzet().bepaalEnToonHoogsteLaagsteOmzet();
	}

	private void bepaalEnToonHoogsteLaagsteOmzet() {
		int[] omzetten = { 360, 2100, 450, 1450, 650, 780, 1200, 321, 560, 1850, 960, 420 };
		int indexHoogste = 0, indexLaagste = 0;
		for (int i = 1; i < omzetten.length; i++) {
			if (omzetten[i] < omzetten[indexLaagste]) {
				indexLaagste = i;
			} else if (omzetten[i] > omzetten[indexHoogste]) {
				indexHoogste = i;
			}
		}
		int maandHoogste = indexHoogste + 1;
		int maandLaagste = indexLaagste + 1;
		System.out.printf("Hoogste omzet van %d Euro werd behaald in %d%s maand.%n", omzetten[indexHoogste],
				maandHoogste, geefAchtervoegsel(maandHoogste));
		System.out.printf("Laagste omzet van %d Euro werd behaald in %d%s maand.", omzetten[indexLaagste], maandLaagste,
				geefAchtervoegsel(maandLaagste));
	}

	private String geefAchtervoegsel(int maandNummer) {
		return maandNummer == 1 || maandNummer == 8 ? "ste" : "de";
	}
}
