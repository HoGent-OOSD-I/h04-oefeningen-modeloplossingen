package ui;

import java.util.Scanner;

import domein.Marktkraam;

public class MarktkraamApplicatie 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String naam;
		int aantal, afmeting, keuze;
		double prijs;
		
        do
        {
            System.out.print("Geef het aantal kramen op de rommelmarkt: ");
            aantal = s.nextInt();
        }
        while (aantal < 0);

        Marktkraam[] markt = new Marktkraam[aantal];
        
        for (int i=0; i<markt.length; i++)
        {
        	s.nextLine(); // buffer leegmaken
            System.out.printf("Geef de naam van de eigenaar van kraam %d: ", i+1);
            naam = s.nextLine();
            System.out.printf("Geef de afmeting in meter van kraam %d: ", i+1);
            afmeting = s.nextInt();
            markt[i] = new Marktkraam(naam, afmeting);
        }
        
        do
        {
        	System.out.println("Aan welke kraam wil je iets kopen?");
        	System.out.println("0. Stoppen");
        	for (int i=0; i<markt.length; i++)
        		System.out.printf("%d. Kraam van %s%n", i+1, markt[i].getNaam());
        	System.out.print("Geef je keuze: ");
        	keuze = s.nextInt();
        	if (keuze > 0 && keuze <= markt.length)
        	{
        		System.out.print("Geef de prijs in euro van het gekochte item: ");
        		prijs = s.nextDouble();
        		markt[keuze-1].voegToeAanInkomsten(prijs);
        	}
        }
        while (keuze != 0);
        
        System.out.println("Overzicht van de winst per kraam");
        for (int i=0; i<markt.length; i++)
        {
        	System.out.printf("%5d%20s%30.2f euro%n", i+1, markt[i].getNaam(), markt[i].berekenWinst());
        }
	}
}
