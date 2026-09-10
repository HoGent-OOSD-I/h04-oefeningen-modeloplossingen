package cui;

import java.util.ArrayList;
import java.util.List;

public class Startup {

    void main() {
        new Startup().vraagGetalEnToonIndividueleCijfers();
    }

    private void vraagGetalEnToonIndividueleCijfers() {
        int getal = geefGetal(), oorspronkelijkGetal = getal;
        List<Integer> uniekeCijfers = new ArrayList<>();
        for (int deeltal = 10000000; deeltal != 0; deeltal /= 10) {
            int cijfer = getal / deeltal;
            getal %= deeltal;
            if (!uniekeCijfers.contains(cijfer))
                uniekeCijfers.add(cijfer);
        }
        IO.println("In volgorde van voorkomen zijn de unieke cijfers in " + oorspronkelijkGetal + ":");
        for (int cijfer : uniekeCijfers) {
            IO.println(cijfer + " ");
        }
    }

    private int geefGetal() {
        boolean geldigeInvoer;
        int getal;
        do {
            getal = Integer.parseInt(IO.readln("Geef een getal van 8 betekenisvolle cijfers in > "));
            geldigeInvoer = getal >= 10000000 && getal <= 99999999;
            if (!geldigeInvoer)
                IO.println("Het getal moet 8 betekenisvolle cijfers bevatten...");
        } while (!geldigeInvoer);
        return getal;
    }

}
