/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

/**
 *
 * @author user
 */
public class JUnit {
    
    public int[][] calculateNumber(boolean par2, int par3, int[][] array2) {      
        int i = 0;
        int j = 0;
        
        if(par3*8 > 300  || par2 == true) {
            while(i < array2.length) {
                while(j < array2[i].length) {
                    array2[i][j] = i * j + 1;
                    j++;
                }
                j = 0;
                i++;
            }
            i = 0;
        }
        
        while(i < array2.length) {
            while(j < array2[i].length) {
                array2[i][j] = (array2[i][j] - 1)*(i * j);
                j++;
            }
            j = 0;
            i++;
        }
        return array2;
    } 
}
