import model.classes.Establishment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EstablishmentTest {
    Establishment e = new Establishment();

    @Test
    public void testEstablishmentName() {
        e.setEstablishment("McDonald's");
        assertEquals(e.getEstablishment(),"McDonald's","Name should return as McDonald's.");
    }

    @Test
    public void testManagerName() {
        e.setManagerName("Johnny Doe");
        assertEquals(e.getManagerName(),"Johnny Doe","Manager name should return as Johnny Doe");
    }

    @Test
    public void testAddress() {
        e.setAddress("1234 Imagine Drive");
        assertEquals(e.getAddress(),"1234 Imagine Drive","Address should return as 1234 Imagine Drive.");
    }

    @Test
    public void testStatus() {
        e.setStatus(true);
        assertTrue(e.getStatus(),"The status should return as true.");
    }
}
