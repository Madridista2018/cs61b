import org.junit.Test;
import static org.junit.Assert.*;


public class FlikTest {

    @Test
    public void testIsSameNumber() {
        int a = 1;
        int b = 1;
        int c = 2;
        boolean actual = Flik.isSameNumber(a, b);
        boolean actual2 = Flik.isSameNumber(a, c);

        assertTrue(actual);
        assertFalse(actual2);

    }

}
