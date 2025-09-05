package cui;

public class Startup {
	public static void main(String[] args) {
		new Startup().analyseerSchermtijden();
	}

	private void analyseerSchermtijden() {
		int[] tijden = { 800, 750, 700, 720, 700, 680, 650, 620, 630, 620 };
		// int[] tijden = { 570, 575, 573, 560, 600, 610, 590, 580, 570, 560 };
		// int[] tijden = { 800, 750, 700, 680, 700, 680, 650, 700, 630, 620 };
		// int[] tijden = { 900, 850, 800, 790, 789, 780, 750, 740, 730, 630 };
		// int[] tijden = { 850, 851, 860, 866, 902, 910, 920, 930, 931, 940 };

		int startHuidigeReeks = 0, aantalInHuidigeReeks = 0;
		int startLangsteReeks = 0, aantalInLangsteReeks = 0;
		
		for (int i = 1; i < tijden.length; i++) {
			if (tijden[i] < tijden[i - 1])
				aantalInHuidigeReeks++;
			else {
				if (aantalInLangsteReeks < aantalInHuidigeReeks) {
					aantalInLangsteReeks = aantalInHuidigeReeks;
					startLangsteReeks = startHuidigeReeks;
				}
				startHuidigeReeks = i;
				aantalInHuidigeReeks = 0;
			}
		}
		if (aantalInLangsteReeks < aantalInHuidigeReeks) {
			aantalInLangsteReeks = aantalInHuidigeReeks;
			startLangsteReeks = startHuidigeReeks;
		}

		if (aantalInLangsteReeks == 0)
			System.out.println("Wat een ontgoocheling, je schermtijd ging enkel omhoog ipv omlaag!");
		else if (aantalInLangsteReeks == tijden.length - 1) {
			System.out.println("Proficiat! Challenge completed! Elke dag ging je schermtijd omlaag.");
			System.out.printf("Uiteindelijk is je schermtijd met %d minuten gedaald!",
					tijden[startLangsteReeks] - tijden[startLangsteReeks + aantalInLangsteReeks]);
		} else {
			System.out.printf(
					"De langste reeks van opeenvolgende dagen dat je schermtijd daalde overspande %d dagen.%n",
					aantalInLangsteReeks);
			System.out.printf("Deze daling zette zich in van dag %d op dag %d.%n", startLangsteReeks + 1,
					startLangsteReeks + 2);
			System.out.printf("In deze periode daalde je schermtijd met %d minuten. ",
					tijden[startLangsteReeks] - tijden[startLangsteReeks + aantalInLangsteReeks]);
		}
	}
}
