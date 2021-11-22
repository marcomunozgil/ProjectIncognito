package ProjectIncognito.src.inspections;

import ProjectIncognito.src.classes.Establishment;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class InspectionsUnitTest {
    Establishment facility = new Establishment();
    Placard testPlacard;
    String result;

    @Test
    public void testGetPlacardColor(Establishment facility) {
        this.facility = facility;
        testPlacard = facility.getInspectionReport();
        result = testPlacard.getPlacardColorPlacard();

        assertEquals("red", result);
    }
}
