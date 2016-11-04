/**
 * Created by Matthias Riedl (ianmcderp) on 04.11.2016.
 */
public class IterativeChopper implements Chopper {
    @Override
    public int chop(int wanted, int[] values) {
        int wantedIndex = -1;

        for (int valueIndex = 0; valueIndex < values.length; valueIndex++) {
            if (values[valueIndex] == wanted) {
                wantedIndex = valueIndex;
                break;
            } else if (values[valueIndex] > wanted) {
                break;
            }
        }

        return wantedIndex;
    }
}
