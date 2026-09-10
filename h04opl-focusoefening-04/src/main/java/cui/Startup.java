package cui;

import java.util.ArrayList;
import java.util.List;

public class Startup {
    void main() {
        doeFocusoefening04();
    }

    private void doeFocusoefening04() {
        // Initialiseer karakters
        List<Character> karakters = new ArrayList<>();

        // Voeg de karakters 'A' en 'X' toe
        karakters.add('A');
        karakters.add('X');

        // Vervang het laatste karakter in de verzameling door 'F'
        karakters.set(karakters.size() - 1, 'F');

        // Als de lijst 'A' bevat voeg je 'C' toe
        if (karakters.contains('A')) {
            karakters.add('C');
        }

        // Als de lijst drie of meer karakters bevat voeg je 'P' toe
        if (karakters.size() >= 3) {
            karakters.add('P');
        }

        // Voeg op de middelste index (grootte / 2) een 'E' toe
        karakters.add(karakters.size() / 2, 'E');

        // Vervang 'A' door 'R'
        karakters.set(karakters.indexOf('A'), 'R');

        // Voeg vooraan een 'T' toe
        karakters.addFirst('T');

        // Voeg vóór de letter 'R' een 'E' toe
        karakters.add(karakters.indexOf('R'), 'E');

        // Verwijder het eerste karakter en voeg het achteraan toe
        karakters.addLast(karakters.removeFirst());

        // Verwijder het voorlaatste karakter en voeg het vooraan toe
        karakters.addFirst(karakters.remove(karakters.size() - 2));

        IO.println(karakters);
    }


}
