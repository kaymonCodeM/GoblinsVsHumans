package creatures;

import items.Equipment;
import land.Land;

import java.util.HashMap;
import java.util.Map;

public class Player extends Land {
    private int Health = 8;
    private int strength = 3;

    private Map<String,Equipment> inventory = new HashMap<>();

    public Player(int[] position) {
        super(position,'P');
    }

    public int getHealth() {
        return Health;
    }

    public int getStrength() {
        return strength;
    }

    public Map<String, Equipment> getInventory() {
        return inventory;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setInventory(Map<String, Equipment> inventory) {
        this.inventory = inventory;
    }

    public void attachEquipment(Equipment equipment){

        if (this.inventory.containsKey(equipment.getType())){
            Equipment myEquipment = this.inventory.get(equipment.getType());
            if (myEquipment.getRole() =='D'){
                setHealth(this.getHealth()-myEquipment.getHealth());
            } else if (myEquipment.getRole() =='A') {
                setStrength(this.getStrength()-myEquipment.getStrength());
            }
        }else {
            if (equipment.getRole() =='D'){
                setHealth(this.getHealth()+equipment.getHealth());
            } else if (equipment.getRole() =='A') {
                setStrength(this.getStrength()+equipment.getStrength());
            }

        }
        inventory.put(equipment.getType(),equipment);
    }
}
