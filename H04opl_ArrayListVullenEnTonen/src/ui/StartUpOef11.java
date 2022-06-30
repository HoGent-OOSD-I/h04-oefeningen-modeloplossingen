package ui;

import java.util.*;

public class StartUpOef11
{
    public static void main(String[] args)
    {
    	new StartUpOef11().vulEnToonArrayList();
    }
    
    
    private void vulEnToonArrayList() 
    {
        double getal;
        List<Double> deLijst = new ArrayList<>();

        getal = leesPositiefGetalOfStopwaarde();
        while(getal != -1)
        {
        	deLijst.add(getal);
            getal = leesPositiefGetalOfStopwaarde();
        }
        if(deLijst.isEmpty())
            System.out.println("De lijst is leeg!");
        else
        {
        	System.out.print("De lijst met bedragen: ");
            for(double get:deLijst)
                System.out.printf("%8.2f",get);
            System.out.println();
        }
    }   
    
    private double leesPositiefGetalOfStopwaarde()
    {
    	Scanner input = new Scanner(System.in);
    	double getal;
    	
    	do
    	{
    	 System.out.print("Geef een positief bedrag, stop met -1: ");
         getal = input.nextDouble();
    	}while(getal < 0 && getal != -1);
    	return getal;
    }
}
