package ui;

import domein.Rekening;

public class StartUp {
	public static void main(String[] args) {
		new StartUp().werkMetEenArrayVanRekeningObjecten();
	}

	private void werkMetEenArrayVanRekeningObjecten() {

		double[] bedragen = { 100, 777.77, 287.15, -350, 399.99, 123.45, 987.65, -68.18, 413.26 };
		final int aantalRekeningen = bedragen.length;
		Rekening[] rekeningen = new Rekening[aantalRekeningen];
		String houder, uitvoer = "";
		double saldo, gemiddelde = 0;

		for (int i = 0; i < aantalRekeningen; i++) {
			houder = String.format("%c", 'A' + i);
			rekeningen[i] = new Rekening(i, houder);
			rekeningen[i].stort(bedragen[i]);
		}

		for (Rekening r : rekeningen) {
			saldo = r.getSaldo();
			uitvoer += String.format("Rekening %d van %s bevat %.2f%n", r.getRekeningNummer(), r.getNaamHouder(), saldo);
			gemiddelde += saldo;
		}
		gemiddelde /= aantalRekeningen;

		System.out.printf("%s%nHet gemiddelde saldo van deze %d rekeningen bedraagt: %.2f euro%n", uitvoer,
				aantalRekeningen, gemiddelde);
	}
}
