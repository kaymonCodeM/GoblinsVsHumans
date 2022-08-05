package items;

import land.Land;

import java.util.HashMap;
import java.util.Map;

public class TreasureChest extends Land {
    Map<Integer,Equipment> drops = new HashMap();

    @Override
    public String toString() {
        return "C";
    }
}
