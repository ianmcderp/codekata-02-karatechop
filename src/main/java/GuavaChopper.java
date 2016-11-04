import com.google.common.primitives.Ints;

/**
 * Created by Matthias Riedl (ianmcderp) on 04.11.2016.
 */
public class GuavaChopper implements Chopper {
    public int chop(int wanted, int[] values) {
        return Ints.indexOf(values, wanted);
    }
}
