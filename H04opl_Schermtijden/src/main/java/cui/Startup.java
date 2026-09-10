package cui;

public class Startup {
    void main() {
        new Startup().analyseerSchermtijden();
    }

    private void analyseerSchermtijden() {
        int[] tijden = {800, 750, 700, 720, 700, 680, 650, 620, 630, 620};
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
            IO.println("Wat een ontgoocheling, je schermtijd ging enkel omhoog ipv omlaag!");
        else if (aantalInLangsteReeks == tijden.length - 1) {
            IO.println("Proficiat! Challenge completed! Elke dag ging je schermtijd omlaag.");
            IO.print(String.format("Uiteindelijk is je schermtijd met %d minuten gedaald!",
                    tijden[startLangsteReeks] - tijden[startLangsteReeks + aantalInLangsteReeks]));
        } else {
            IO.println(
                    "De langste reeks van opeenvolgende dagen dat je schermtijd daalde overspande " + aantalInLangsteReeks + " dagen.");
            IO.print(String.format("Deze daling zette zich in van dag %d op dag %d.%n", startLangsteReeks + 1,
                    startLangsteReeks + 2));
            IO.print(String.format("In deze periode daalde je schermtijd met %d minuten. ",
                    tijden[startLangsteReeks] - tijden[startLangsteReeks + aantalInLangsteReeks]));
        }
    }
}
