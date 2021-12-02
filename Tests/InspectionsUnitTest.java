import model.classes.Establishment;
import model.inspections.Placard;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class InspectionsUnitTest {
    Placard testPlacard;
    String result;
    Establishment facility = new Establishment();


    @Test
    public void testGetPlacardColor() {


        testPlacard = facility.getInspectionReport();

        //null because no inspection has been made;
        assertEquals(null, result);
    }
}
