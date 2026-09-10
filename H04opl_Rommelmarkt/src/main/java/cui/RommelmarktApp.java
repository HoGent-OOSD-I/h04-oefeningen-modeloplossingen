package cui;

import domein.Marktkraam;

public class RommelmarktApp {
    void main() {
        new RommelmarktApp().simuleerRommelmarkt();
    }

    private void simuleerRommelmarkt() {
        int aantalKramen = geefAantalKramen();
        Marktkraam[] markt = new Marktkraam[aantalKramen];
        for (int i = 0; i < markt.length; i++)
            markt[i] = new Marktkraam(geefKraamhouder(i + 1), geefBreedteKraam(i + 1));
        IO.println("\nDe rommelmarkt is open!");

        String menu = "";
        for (int i = 0; i < markt.length; i++)
            menu += String.format("%d. Kraam van %s.%n", i + 1, markt[i].getKraamhouder());

        int keuze = geefKeuze(aantalKramen, menu);
        while (keuze != 0) {
            double bedrag = geefBedrag();
            markt[keuze - 1].ontvang(bedrag);
            keuze = geefKeuze(aantalKramen, menu);
        }

        IO.println("\nDe rommelmarkt is gesloten!");
        for (Marktkraam marktkraam : markt) {
            double balans = marktkraam.geefWinst();
            IO.println(String.format("Kraamhouder %s maakte %.2f Euro %s", marktkraam.getKraamhouder(),
                    balans >= 0 ? balans : -1 * balans, balans >= 0 ? "winst" : "verlies"));
        }
    }

    private double geefBedrag() {
        double bedrag;
        boolean geldigeInvoer;
        do {
            String invoer = IO.readln("Geef op voor hoeveel Euro je kocht: ").replace(",", ".");
            bedrag = Double.parseDouble(invoer);
            geldigeInvoer = bedrag > 0;
            if (!geldigeInvoer)
                IO.println("De prijs moet strikt positief zijn...");
        } while (!geldigeInvoer);
        return bedrag;
    }

    private int geefKeuze(int aantalKramen, String menu) {
        int keuze;
        boolean geldigeInvoer;
        do {
            IO.println("\nAan welk kraam wil je iets kopen?");
            IO.println(menu);
            keuze = Integer.parseInt(IO.readln("Kies je kraam (of geef 0 om te stoppen): "));
            geldigeInvoer = keuze >= 0 && keuze <= aantalKramen;
            if (!geldigeInvoer)
                IO.println("Dit is geen geldige keuze! Probeer opnieuw...");
        } while (!geldigeInvoer);
        return keuze;
    }

    private int geefAantalKramen() {
        int aantal;
        boolean geldigeInvoer;
        do {
            aantal = Integer.parseInt(IO.readln("Geef het aantal kramen dat op de rommelmarkt staat op: "));
            geldigeInvoer = aantal > 0;
            if (!geldigeInvoer)
                IO.println("Het aantal moet groter dan 0 zijn, probeer opnieuw...");
        } while (!geldigeInvoer);
        return aantal;
    }

    private String geefKraamhouder(int kraamnummer) {
        String houder;
        boolean geldigeInvoer;
        do {
            houder = IO.readln("Geef de naam van de kraamhouder voor kraam " + kraamnummer + " op: ");
            geldigeInvoer = houder != null && !houder.isBlank();
            if (!geldigeInvoer)
                IO.println("De naam van de kraamhouder moet je opgeven...");
        } while (!geldigeInvoer);
        return houder;
    }

    private int geefBreedteKraam(int kraamnummer) {
        int breedte;
        boolean geldigeInvoer;
        do {
            breedte = Integer.parseInt(IO.readln("Geef de  breedte van kraam " + kraamnummer + " op: "));
            geldigeInvoer = breedte >= 2 && breedte <= 10;
            if (!geldigeInvoer)
                IO.println("De breedte moet tussen 2 en 10 meter liggen...");
        } while (!geldigeInvoer);
        return breedte;
    }

}