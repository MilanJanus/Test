import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MenschTest {
    private Mensch m = new Mensch("Mickey");

    @Test
    void testName() throws Exception{
        assertEquals("Mickey", m.getName());
        assertEquals("", m.getNachname());
    }

    @Test
    void testAlter() throws Exception {
        // arbeitet nur mit boolean
        assertFalse(m.istAlt());
        // Neue Untertest
        Mensch m = new Mensch("Minny", "", 40);
        assertTrue(m.istAlt());
    }

}