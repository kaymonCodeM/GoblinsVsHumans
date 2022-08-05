package items;

import land.Land;

import java.util.HashMap;
import java.util.Map;

public class TreasureChest extends Land implements getEquipmentPool {
    private String symbol = new String("C");
    Map<Integer,Equipment> drops = new HashMap();

    @Override
    public String toString() {
        return this.symbol;
    }
}
