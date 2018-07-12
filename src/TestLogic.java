package calc;

import static org.junit.Assert.*;   
import org.junit.Test;  
  
public class TestLogic {  
  
    @Test  
    public void testFindMax(){  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
    
    @Test  
    public void testFindCube(){  
        assertEquals(8,Calculation.findCube(2);  
        assertEquals(27,Calculation.findCube(3);  
    }
    
    @Test  
    public void testFindSqr(){  
        assertEquals(4,Calculation.findSqr(2);  
        assertEquals(9,Calculation.findSqr(3);  
    }
}
