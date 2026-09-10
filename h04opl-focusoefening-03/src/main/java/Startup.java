package cui;

import java.security.SecureRandom;

public class Startup {
    void main() {
        doeFocusoefening03();
    }

    private void doeFocusoefening03() {
        toonElementenVanLaatsteTotEerste();
    }

    private void toonElementenVanLaatsteTotEerste() {
        int lengte = new SecureRandom().nextInt(5, 16);
        int[] getallen = new int[lengte];

        // de array opvullen
        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = i * 100;
        }

        IO.println("In gewone volgorde: ");
        for (int getal : getallen) {
            IO.print(getal + " ");
        }
        IO.println();

        // de elementen van laatste tot eerste
        IO.println("In omgekeerde volgorde:");
        for (int i = getallen.length - 1; i >= 0; i--) {
            IO.print(getallen[i] + " ");
        }
    }
}
