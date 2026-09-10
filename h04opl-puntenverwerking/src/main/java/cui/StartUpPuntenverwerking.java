package cui;

import java.util.ArrayList;
import java.util.List;

public class StartUpPuntenverwerking {
    void main() {
        verwerkPunten();
    }

    private void verwerkPunten() {

        // lijst opvullen
        List<String> studenten = new ArrayList<>();
        studenten.add("Imani");
        studenten.add("Tanaka");
        studenten.add("Ayana");
        studenten.add("Yaro");
        studenten.add("Diara");
        studenten.add("Lente");
        studenten.add("Jin");
        studenten.add("Sem");
        studenten.add("Zaur");
        studenten.add("Nyasha");

        List<String> geslaagden = new ArrayList<>();
        List<String> nietGeslaagden = new ArrayList<>();

        for (String student : studenten) {
            int resultaat = geefResultaat(student);
            if (resultaat >= 10)
                geslaagden.add(student);
            else
                nietGeslaagden.add(student);
        }

        // lijsten laten zien
        if (geslaagden.isEmpty())
            IO.println("Geen enkele student slaagde...");
        else {
            IO.println("Volgende studenten zijn geslaagd: ");
            toonStudenten(geslaagden);
        }
        if (nietGeslaagden.isEmpty())
            IO.println("Er waren geen niet geslaagden");
        else {
            IO.println("Volgende studenten zijn niet geslaagd: ");
            toonStudenten(nietGeslaagden);
        }
    }

    private int geefResultaat(String student) {
         final int maxResultaat = 20;
        boolean geldigeInvoer;
        int resultaat;
        do {
            resultaat = Integer.parseInt(IO.readln(String.format("Geef resultaat van %s (0-%d) > ", student, maxResultaat)));
            geldigeInvoer = resultaat >= 0 && resultaat <= maxResultaat;
            if (!geldigeInvoer)
                IO.println("Een geldig resultaat ligt tussen 0 en "+ maxResultaat + "!");
        } while (!geldigeInvoer);
        return resultaat;

    }

    private void toonStudenten(List<String> studenten) {
        for (String student : studenten)
            IO.println(student);
    }
}