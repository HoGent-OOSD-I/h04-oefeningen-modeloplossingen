package cui;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Startup {

    void main() {
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

        IO.println("Samenvatting van " + scores.size() + " scores:");
        IO.println(String.format("%10s%10s", "score", "aantal"));
        for (int i = 0; i < samenvatting.length; i++) {
            IO.println(String.format("%10d%10d", i + 1, samenvatting[i]));
        }
    }

}
