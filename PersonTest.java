
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
public class PersonTest {
    @Test
    public void testIsTeenager() {
        assertTrue(Person.isTeenager(13));
        assertTrue(Person.isTeenager(14));
        assertTrue(Person.isTeenager(19));
        assertFalse(Person.isTeenager(12));
        assertFalse(Person.isTeenager(20));
    }
}
