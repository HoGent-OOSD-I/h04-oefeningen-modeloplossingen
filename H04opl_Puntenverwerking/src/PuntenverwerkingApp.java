import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PuntenverwerkingApp
{
	public static void main(String[] args)
	{
		// lijst opvullen
		List<String> studenten = new ArrayList<>();
		studenten.add("Jan");
		studenten.add("Piet");
		studenten.add("Els");
		studenten.add("Joke");
		studenten.add("Evelien");
		studenten.add("Ilse");
		studenten.add("Steven");
		studenten.add("Bart");
		studenten.add("Peter");
		studenten.add("Dirk");
		
		// lijst overlopen en punten laten invullen - zo bepalen in welke deellijst de student terecht moet komen
		Scanner s = new Scanner(System.in);
		int punten;
		List<String> namenGeslaagden = new ArrayList<>();
		List<String> namenNietGeslaagden = new ArrayList<>();
		
		for (String naam : studenten)
		{
			do
			{
				System.out.printf("Geef de punten op 20 (positief geheel getal) van %s: ", naam);
				punten = s.nextInt();
			}
			while (punten < 0 || punten > 20);
			
			if (punten >= 10)
				namenGeslaagden.add(naam);
			else
				namenNietGeslaagden.add(naam);
		}
		
		// lijsten laten zien
		if (namenGeslaagden.isEmpty())
			System.out.println("Er zijn geen geslaagde studenten");
		else
		{
			System.out.println("Volgende studenten zijn geslaagd: ");
			for (String naam : namenGeslaagden)
				System.out.println(naam);
		}
		if (namenNietGeslaagden.isEmpty())
			System.out.println("Alle studenten zijn geslaagd");
		else
		{
			System.out.println("Volgende studenten zijn niet geslaagd: ");
			for (String naam : namenNietGeslaagden)
				System.out.println(naam);
		}
	}
}
