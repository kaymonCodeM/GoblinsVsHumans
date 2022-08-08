package items;

import land.Land;

import java.util.HashMap;
import java.util.Map;

public class TreasureChest extends Land implements EquipmentPool {
    Map<Integer,Equipment> chest = new HashMap();

    public TreasureChest(int[] position) {
        super(position, 'C');

        int count = (int)(Math.random()*4)+1;
        for(int i=1; i<=count;i++){
            this.chest.put(i,selectRandomEquipment());
        }
    }

    public Map<Integer, Equipment> getChest() {
        return chest;
    }

    public void setChest(Map<Integer, Equipment> chest) {
        this.chest = chest;
    }
}
