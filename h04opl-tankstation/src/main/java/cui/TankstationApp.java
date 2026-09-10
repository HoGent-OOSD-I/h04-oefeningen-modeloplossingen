package cui;

import domein.Tankstation;

public class TankstationApp {

    void main() {
        startTanken();
    }

    private void startTanken() {
        Tankstation tankStation = new Tankstation();
        int totaalLiterGetankt = 0, aantalSuccesvolleTankBeurten = 0;
        int pompNummer = geefPompNummer();
        while (pompNummer != 0) {
            int aantalLiter = geefAantalLiter();
            if (tankStation.tank(pompNummer, aantalLiter)) {
                IO.println(String.format("Je hebt %d liter getankt aan pomp %d", aantalLiter, pompNummer));
                totaalLiterGetankt += aantalLiter;
                aantalSuccesvolleTankBeurten++;
            } else
                IO.println(String.format("Sorry, er is onvoldoende brandstof aan pomp " + pompNummer));
            IO.println("\nOverzicht pompen:");
            IO.println(tankStation);
            pompNummer = geefPompNummer();
        }
        if (aantalSuccesvolleTankBeurten != 0)
            IO.println(String.format("Er werd in totaal %d liter getankt in %d tankbeurt%s.", totaalLiterGetankt,
                    aantalSuccesvolleTankBeurten, aantalSuccesvolleTankBeurten == 1 ? "" : "en"));
        else {
            IO.println("Er waren geen tankbeurten:");
            IO.println(tankStation);
        }
    }

    private int geefAantalLiter() {
        boolean geldigeInvoer;
        int aantalLiter;
        do {
            aantalLiter = Integer.parseInt(IO.readln("Hoeveel liter wens je te tanken (5 tot 80)? "));
            geldigeInvoer = aantalLiter >= 5 && aantalLiter <= 80;
            if (!geldigeInvoer)
                IO.println("Je moet minstens 5 en kan maximaal 80 liter tanken...");
        } while (!geldigeInvoer);
        return aantalLiter;
    }

    private int geefPompNummer() {
        boolean geldigeInvoer;
        int pompNummer;
        do {
            pompNummer = Integer.parseInt(IO.readln("Aan welke pomp wil je tanken (1-5), druk 0 om te stoppen? "));
            geldigeInvoer = pompNummer >= 0 && pompNummer <= 5;
            if (!geldigeInvoer)
                IO.println("We hebben geen pomp met nummer " + pompNummer + "! Probeer opnieuw...");
        } while (!geldigeInvoer);
        return pompNummer;
    }
}