/**
 * Created by Matthias Riedl (ianmcderp) on 28.05.2017.
 */
public class SimpleBinaryChopper implements Chopper {
    @Override
    public int chop(int wanted, int[] values) {
        int left = 0;
        int right = values.length -1;

        while (left <= right) {
            int center = (left + right) / 2;

            if (values[center] == wanted) {
                return center;
            } else if (values[center] < wanted) {
                left = center + 1;
            } else {
                right = center - 1;
            }
        }

        return -1;
    }
}
