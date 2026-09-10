package cui;

import java.time.LocalDate;
import java.util.Arrays;

public class Startup {
    void main() {
        doeFocusoefening01();
    }

    private void doeFocusoefening01() {
        // 99000 gehele getallen die allemaal 0 zijn
        int[] getallen = new int[99000];
        IO.println(Arrays.toString(getallen));

        // De karakters 'A', 'B', 'C', 'D', 'E' bevat
        char[] karakters = {'A', 'B', 'C', 'D', 'E'};
        IO.println(Arrays.toString(karakters));

        // 7 lege String-s bevat
        String[] legeStrings = {"", "", "", "", "", "", ""};
        IO.println(Arrays.toString(legeStrings));

        // 7 LocalDate-s bevat die allemaal null zijn
        LocalDate[] datums = new LocalDate[7];
        IO.println(Arrays.toString(datums));

        // 3 booleans bevat die allemaal true zijn
        boolean[] vlaggen = {true, true, true};
        IO.println(Arrays.toString(vlaggen));
    }
}
