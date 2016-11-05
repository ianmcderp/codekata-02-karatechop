import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by ianmcderp on 04.11.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class ChopperTest {
    @Test
    @Parameters(source = ChopperTestData.class, method = "provideTestData")
    public void GuavaChop_ArrayOfValues_ReturnsIndex(int wanted, int[] array, int expectedIndex) {
        assertChopping(new GuavaChopper().chop(wanted, array), expectedIndex);
    }

    @Test
    @Parameters(source = ChopperTestData.class, method = "provideTestData")
    public void IterativeChop_ArrayOfValues_ReturnsIndex(int wanted, int[] array, int expectedIndex) {
        assertChopping(new IterativeChopper().chop(wanted, array), expectedIndex);
    }

    @Test
    @Parameters(source = ChopperTestData.class, method = "provideTestData")
    public void NewtonChop_ArrayOfValues_ReturnsIndex(int wanted, int[] array, int expectedIndex) {
        assertChopping(new NewtonChopper().chop(wanted, array), expectedIndex);
    }

    private void assertChopping(int returnedIndex, int expectedIndex) {
        assertEquals(expectedIndex, returnedIndex);
    }
}
