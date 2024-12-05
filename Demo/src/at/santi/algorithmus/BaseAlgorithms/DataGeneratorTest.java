package at.santi.algorithmus.BaseAlgorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DataGeneratorTest {

    @Test
    public void testGenerateDataArrayWithoutRange() {
        int[] result = DataGenerator.generateDataArrayNoRange(10);
        assertEquals(10, result.length, "Arraygröße sollte 10 sein");
    }

    @Test
    public void testGenerateDataArrayWithRange() {
        int[] result = DataGenerator.generateDataArrayYesRange(10, -50, 50);
        assertEquals(10, result.length, "Arraygröße sollte 10 sein");
        for (int value : result) {
            assertTrue(value >= -50 && value <= 50, "Wert liegt nicht im erlaubten Bereich [-50, 50]");
        }
    }

    @Test
    public void testPrintArray() {
        // Da die printArray-Methode nichts zurückgibt, können wir einfach prüfen,
        // ob keine Fehler auftreten.
        int[] result = DataGenerator.printArray(5, 1, 100);
        DataGenerator.printArray(result);
        assertNotNull(result, "Das Array sollte nicht null sein");
    }

}
