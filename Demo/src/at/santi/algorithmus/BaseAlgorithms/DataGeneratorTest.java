package at.santi.algorithmus.BaseAlgorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class DataGeneratorTest {

    @Test
    public void testGenerateDataArrayWithoutRange() {
        int[] result = DataGenerator.generateDataArrayNoRange(3);
        assertEquals(3, result.length, "");
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testGenerateDataArrayWithRange() {
        int[] result = DataGenerator.generateDataArrayYesRange(3, 0, 187);
        assertEquals(3, result.length, "");
        for (int value : result) {
            assertTrue(value >= 0 && value <= 187, "");
        }
        System.out.println(Arrays.toString(result));
    }

}
