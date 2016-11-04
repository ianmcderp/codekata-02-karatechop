/**
 * Created by Matthias Riedl (ianmcderp) on 04.11.2016.
 */
public class NewtonChopper implements Chopper {

    private int wanted;
    private int[] values;

    @Override
    public int chop(int wanted, int[] values) {
        this.wanted = wanted;
        this.values = values;

        return values.length > 0 ? recursiveChop(0, values.length, -1) : -1;
    }

    private int recursiveChop(int lower, int upper, int previousPivotValue) {
        int pivotIndex = (upper + lower) / 2;
        int currentPivotValue = values[pivotIndex];

        if (currentPivotValue != previousPivotValue) {
            if (currentPivotValue == wanted) {
                return pivotIndex;
            } else if (currentPivotValue < wanted) {
                return recursiveChop(pivotIndex, upper, currentPivotValue);
            } else if (currentPivotValue > wanted) {
                return recursiveChop(lower, pivotIndex, currentPivotValue);
            }
        }

        return -1;
    }
}
