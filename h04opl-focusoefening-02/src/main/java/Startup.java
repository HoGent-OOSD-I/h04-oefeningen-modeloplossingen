import java.security.SecureRandom;

void main() {
    doeFocusoefening02();
}

private void doeFocusoefening02() {
    String[] kleuren = {"rood", null, "groen", "oranje", "citroen"};
    double[] getallen = {1.0, 2.0, 3.0, 4.0, 5.0};
    double[] getallen2 = getallen;
    int aantal = new SecureRandom().nextInt(481) + 20;
    char[] karakters = new char[aantal];

    // null-waarde veranderen in "blauw"
    kleuren[1] = "blauw";

    // Derde element (index 2) wordt de som van de eerste twee (index 0 en 1)
    getallen[2] = getallen[0] + getallen[1];

    // Laatste karakter van karakters krijgt waarde 'z'
    karakters[karakters.length - 1] = 'z';

    // Laatste element van getallen kopiëren naar eerste element van getallen2
    getallen2[0] = getallen[getallen.length - 1];
    // Opmerking: getallen[0] krijgt hierdoor nu ook de waarde 5.0!

    // Eerste en laatste element in array getallen vergelijken.
    IO.println(getallen[0] == getallen[getallen.length - 1]);
    // ze zijn gelijk omdat getallen en getallen2 twee referenties zijn naar eenzelfde array!

    // Lengte laatste String vergelijken met lengte van de array kleuren
    IO.println(kleuren[kleuren.length - 1].length() == kleuren.length);
}

