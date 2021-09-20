package ui;

import java.util.Scanner;

import domein.Matrix;

public class MatrixApplicatie
{   
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int rijen, kolommen;
        int[][] matrix, getransponeerd;
        
        System.out.print("Geef het aantal rijen van de matrix: ");
        rijen = s.nextInt();
        System.out.print("Geef het aantal kolommen van de matrix: ");
        kolommen = s.nextInt();
        
        Matrix m = new Matrix(rijen, kolommen);
        
        matrix = new int[rijen][kolommen];
        for (int rijnr = 0; rijnr < matrix.length; rijnr++)
        {
            for (int kolnr = 0; kolnr < matrix[rijnr].length; kolnr++)
            {
                System.out.printf("Geef het element op rij %d en kolom %d: ", rijnr+1, kolnr+1);
                matrix[rijnr][kolnr] = s.nextInt();
            }  
        }
        m.setGetallen(matrix);
        getransponeerd = m.transponeer();
        System.out.println("De getransponeerde matrix: ");
        for (int[] rij : getransponeerd)
        {
            for (int kol: rij)
            {
            	System.out.printf("%5d", kol);
            }
            System.out.println();
        }
    }
}
