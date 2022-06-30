package ui;

import java.util.Scanner;

public class StartUpVulArrayMetGetallenEnTel
{
    public static void main(String[] args)
    {
    	new StartUpVulArrayMetGetallenEnTel().vulArrayMetGetallenEnTel();
    }
    
    private void vulArrayMetGetallenEnTel() {
	
		int[] deArray = new int[20];
        int[] tel = new int[10];
        
        Scanner s = new Scanner(System.in);
        for (int i=0; i<deArray.length; i++)
        {   
        	do
        	{
        		System.out.printf("Geef het %de getal uit het interval [1-10]: ", i+1);
        		deArray[i] = s.nextInt();
        	}
        	while (deArray[i] < 1 || deArray[i] > 10);
            tel[deArray[i]-1]++;
        }
        
        System.out.println("De array bevat volgende getallen: ");
        for (int getal : deArray)
            System.out.printf("%d  ", getal);
        System.out.println();
        
        System.out.println("Dit levert volgende telling op:");
        System.out.printf("%n%10S%20S%n", "getal", "aantal keer");
        for (int i=0; i<tel.length; i++)
            System.out.printf("%10d%20d%n", i+1, tel[i]);
    }
}
