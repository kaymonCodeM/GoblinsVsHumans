package items;

import land.Land;

import java.util.HashMap;
import java.util.Map;

public class Drop extends Land implements EquipmentPool {
    Map<Integer,Equipment> drops = new HashMap();

    public Drop(int[] position) {
        super(position, 'D');

        int count = (int)(Math.random()*3)+1;
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

    @Override
    public String toString() {
        String result = "";
        for (Integer key: drops.keySet()){
            result += "ELEMENT: " + key + "\n";
            result += drops.get(key).toString() + "\n\n";
        }
        return result;
    }
}
