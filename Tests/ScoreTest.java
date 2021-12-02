import model.classes.ReportIterator;
import model.classes.ReportScore;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreTest {
    @Test
    public void testIterator() {
        ReportScore a = new ReportScore();
        a.addScore(85);
        a.addScore(90);
        a.addScore(72);
        ReportIterator iterator = a.getReportIterator();
        iterator.next();
        assertEquals(iterator.next(), 90, "The arraylist index should be 90.");
    }

}
