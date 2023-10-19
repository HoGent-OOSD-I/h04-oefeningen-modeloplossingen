package cui;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Startup {

	public static void main(String[] args) {
		new Startup().maakLijstMetTevredenheidsscoresEnToonSamenvatting();
	}

	private void maakLijstMetTevredenheidsscoresEnToonSamenvatting() {
		SecureRandom sr = new SecureRandom();
		int aantalScores = sr.nextInt(10, 15);
		List<Integer> scores = new ArrayList<>();
		for (int i = 0; i < aantalScores; i++) {
			scores.add(sr.nextInt(1, 6));
		}

		int[] samenvatting = new int[5];
		for (int score : scores)
			samenvatting[score - 1]++;

		System.out.printf("Samenvatting van %d scores:%n", scores.size());
		System.out.printf("%10s%10s%n", "score", "aantal");
		for (int i = 0; i < samenvatting.length; i++) {
			System.out.printf("%10d%10d%n", i + 1, samenvatting[i]);
		}
	}

}
