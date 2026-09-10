package cui;

import domein.Rekening;

public class Startup {
    void main() {
        new Startup().werkMetTweedimArrayVanRekeningObjecten();
    }

    private void werkMetTweedimArrayVanRekeningObjecten() {

        Rekening rekeningen[][] = new Rekening[3][];
        for (int rij = 0; rij < rekeningen.length; rij++) {
            int aantalKolommen = vraagAantalKolommen(rij + 1);
            rekeningen[rij] = new Rekening[aantalKolommen];
            for (int kolom = 0; kolom < rekeningen[rij].length; kolom++) {
                rekeningen[rij][kolom] = new Rekening();
                rekeningen[rij][kolom].stort(10 * (rij + 1) + kolom + 1);
            }
        }

        for (Rekening[] rij : rekeningen) {
            for (Rekening rek : rij)
                IO.print(String.format("%-8.0f", rek.getSaldo()));
            IO.println();
        }
    }

    private int vraagAantalKolommen(int rij) {
        boolean geldigeInvoer;
        int aantalKolommen;
        do {
            aantalKolommen = Integer.parseInt(IO.readln("Geef aantal kolommen in voor rij " + rij + " > "));
            geldigeInvoer = aantalKolommen > 0;
            if (!geldigeInvoer)
                IO.println("Rij " + rij + " moet minstens 1 kolom hebben!");
        } while (!geldigeInvoer);
        return aantalKolommen;
    }
}