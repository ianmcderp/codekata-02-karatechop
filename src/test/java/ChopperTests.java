import data.ChopperTestData;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by ianmcderp on 04.11.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class ChopperTests {
    @Test
    @Parameters(source = ChopperTestData.class, method = "provideTestData")
    public void GuavaChop_ArrayOfValues_ReturnsIndex(int wanted, int[] array, int expectedIndex) {
        // Given
        Chopper sut = new GuavaChopper();

        // When
        int returnedIndex = sut.chop(wanted, array);

        // Then
        assertEquals(expectedIndex, returnedIndex);
    }
}
