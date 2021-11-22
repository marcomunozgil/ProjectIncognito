package ProjectIncognito.Tests;

import ProjectIncognito.src.classes.Establishment;
import ProjectIncognito.src.inspections.Placard;
import org.testng.annotations.Test;

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
