package testen;

import org.junit.jupiter.api.*;

import domein.Matrix;

public class MatrixTest
{
    private Matrix m1, m2, m3;

    @BeforeEach
    public void before()
    {
    	m1 = new Matrix(3,2);
    	m2 = new Matrix(2,3);
    	m3 = new Matrix(2,2);
    };

    @Test
    public void maakMatrix_juistAantalRijenEnKolommen_maaktObject() 
    {
    	int[][] getallen = {{0,0},{0,0},{0,0}};
        Assertions.assertArrayEquals(getallen, m1.getGetallen());
    }
    
    @Test
    public void maakMatrix_foutAantalRijen_default1Rij() 
    {
        Matrix foutAantalRijen = new Matrix(-5,4);
        int[][] getallen = {{0,0,0,0}};
        Assertions.assertArrayEquals(getallen, foutAantalRijen.getGetallen());
    }
    
    @Test
    public void maakMatrix_foutAantalKolommen_default1Kolom() 
    {
        Matrix foutAantalKolommen = new Matrix(3,0);
        int[][] getallen = {{0},{0},{0}};
        Assertions.assertArrayEquals(getallen, foutAantalKolommen.getGetallen());
    }
    
    @Test
    public void setGetallen_2dimArrayMet3RijenEn2KolommenToekennenAan3x2Matrix() 
    {
    	int[][] getallen = {{1,2},{3,4},{5,6}};
    	m1.setGetallen(getallen);
        Assertions.assertArrayEquals(getallen, m1.getGetallen());
    }
    
    @Test
    public void setGetallen_2dimArrayMet2RijenEn3KolommenToekennenAan2x3Matrix() 
    {
    	int[][] getallen = {{1,3,5},{2,4,6}};
    	m2.setGetallen(getallen);
        Assertions.assertArrayEquals(getallen, m2.getGetallen());
    }
    
    @Test
    public void setGetallen_2dimArrayMet2RijenEn2KolommenToekennenAan2x2Matrix() 
    {
    	int[][] getallen = {{9,0},{0,9}};
    	m3.setGetallen(getallen);
        Assertions.assertArrayEquals(getallen, m3.getGetallen());
    }
    
    @Test
    public void transponeer_2x3MatrixTransponerenGeeft3x2Matrix() 
    {
    	Assertions.assertArrayEquals(m2.getGetallen(), m1.transponeer());
    }
    
    @Test
    public void transponeer_3x2MatrixTransponerenGeeft2x3Matrix() 
    {
    	Assertions.assertArrayEquals(m1.getGetallen(), m2.transponeer());
    }
    
    @Test
    public void transponeer_2x2MatrixTransponerenGeeft2x2Matrix() 
    {
    	Assertions.assertArrayEquals(m3.getGetallen(), m3.transponeer());
    }
}
