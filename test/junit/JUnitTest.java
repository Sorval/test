/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class JUnitTest {
    
    public JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateNumber method, of class JUnit.
     */
    @Test
    public void testCalculateNumber() {
        boolean par2 = true;
        int par3 = 0;       
        int[][] array2 = new int[2][2];
        
        JUnit instance = new JUnit();
        int[][] expResult = {{0, 0}, {0, 1}};
        int[][] result = instance.calculateNumber(par2, par3, array2);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testCalculateNumber1() {
        boolean par2 = false;
        int par3 = 40;       
        int[][] array2 = new int[2][2];
        
        JUnit instance = new JUnit();
        int[][] expResult = {{0, 0}, {0, 1}};
        int[][] result = instance.calculateNumber(par2, par3, array2);
        assertArrayEquals(expResult, result);
    }
    
    @Test(expected = NullPointerException.class)
    public void testCalculateNumber2() {
        boolean par2 = false;
        int par3 = 40;    
        int[][] array2 = new int[2][2];
        
        JUnit instance = new JUnit();
        int[][] expResult = {{0, 0}, {0, 1}};
        int[][] result = instance.calculateNumber(par2, par3, array2);
        assertArrayEquals(expResult, result);
    }
    
    @Test(timeout = 1)
    public void testCalculateNumber3() {
        boolean par2 = true;
        int par3 = 0;       
        int[][] array2 = new int[2][2];
        
        JUnit instance = new JUnit();
        int[][] expResult = {{0, 0}, {0, 1}};
        int[][] result = instance.calculateNumber(par2, par3, array2);
        assertArrayEquals(expResult, result);
    }
}
