package trinary;
import static org.junit.Assert.*;

import org.junit.Test;

public class TrinaryTest {
    
	@Test
	public void test_toDecimal_NullString_ThrowsException() {
		try {
			Trinary.toDecimal( null );
			fail("Supposed to catch NullPointerException");
		} catch ( NullPointerException npe ) {
			
		} catch ( Exception e ) {
			fail("Expected to catch NullPointerException");
		}
	}
	
	@Test
    public void testNonTrinaryEmptyStringIsZero() {
        assertEquals(0, Trinary.toDecimal(""));
    }
	
	@Test
    public void testNonTrinaryCharacterIsZero() {
        assertEquals(0, Trinary.toDecimal("-"));
    }

    @Test
    public void testNonTrinaryNumberIsZero() {
        assertEquals(0, Trinary.toDecimal("3"));
    }

    @Test
    public void testTrinaryWithNonTrinaryIsZero() {
        assertEquals(0, Trinary.toDecimal("102-12"));
    }

    @Test
    public void testTrinary() {
        assertEquals(302, Trinary.toDecimal("102012"));
    }
}
