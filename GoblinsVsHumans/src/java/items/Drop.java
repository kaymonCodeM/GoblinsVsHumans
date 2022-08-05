package items;

import land.Land;

import java.util.HashMap;
import java.util.Map;

public class Drop extends Land implements getEquipmentPool {
    private String symbol = new String("D");
    Map<Integer,Equipment> drops = new HashMap();

    @Override
    public String toString() {
        return this.symbol;
    }
}
