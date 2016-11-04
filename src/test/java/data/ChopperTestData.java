package data;

/**
 * Created by ianmcderp on 04.11.2016.
 */
public class ChopperTestData {
    public static Object[] provideTestData() {
        return new Object[] {
                new Object[]{ 1, new int[]{}, -1 },

                new Object[]{ 0, new int[]{ 1 }, -1 },
                new Object[]{ 1, new int[]{ 1 }, 0 },

                new Object[]{ 1, new int[]{ 1, 3, 5}, 0 },
                new Object[]{ 3, new int[]{ 1, 3, 5}, 1 },
                new Object[]{ 5, new int[]{ 1, 3, 5}, 2 },
                new Object[]{ 2, new int[]{ 1, 3, 5}, -1 },
                new Object[]{ 4, new int[]{ 1, 3, 5}, -1 },
                new Object[]{ 6, new int[]{ 1, 3, 5}, -1 },

                new Object[]{ 1, new int[]{ 1, 3, 5, 7 }, 0 },
                new Object[]{ 3, new int[]{ 1, 3, 5, 7 }, 1 },
                new Object[]{ 5, new int[]{ 1, 3, 5, 7 }, 2 },
                new Object[]{ 2, new int[]{ 1, 3, 5, 7 }, -1 },
                new Object[]{ 4, new int[]{ 1, 3, 5, 7 }, -1 },
                new Object[]{ 6, new int[]{ 1, 3, 5, 7 }, -1 },
                new Object[]{ 8, new int[]{ 1, 3, 5, 7 }, -1 }
        };
    }
}
