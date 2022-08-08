package creatures;

import items.Equipment;
import items.EquipmentPool;
import land.Land;

import java.util.HashMap;
import java.util.Map;

public class Human extends Land implements EquipmentPool {

    private int health = 8;
    private int strength = 3;
    private Map<Integer,Equipment> inventory = new HashMap();

    public Human(int[] position) {
        super(position, 'H');
        int count = (int)(Math.random()*4)+1;
        for(int i=1; i<=count;i++){
            this.inventory.put(i,selectRandomEquipment());
        }
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public Map<Integer, Equipment> getInventory() {
        return inventory;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setInventory(Map<Integer, Equipment> inventory) {
        this.inventory = inventory;
    }
}
