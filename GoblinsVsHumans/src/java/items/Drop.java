package items;

import land.Land;

import java.util.HashMap;
import java.util.Map;

public class Drop extends Land implements EquipmentPool {
    Map<Integer,Equipment> drops = new HashMap();

    public Drop(int[] position) {
        super(position, 'D');

        int count = (int)(Math.random()*4)+1;
        for(int i=1; i<=count;i++){
            this.drops.put(i,selectRandomEquipment());
        }
    }

    public Map<Integer, Equipment> getDrops() {
        return drops;
    }

    public void setDrops(Map<Integer, Equipment> drops) {
        this.drops = drops;
    }
}
