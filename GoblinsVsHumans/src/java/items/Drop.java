package items;

import land.Land;

import java.util.HashMap;
import java.util.Map;

public class Drop extends Land {
    Map<Integer,Equipment> drops = new HashMap();

    @Override
    public String toString() {
        return "D";
    }
}
