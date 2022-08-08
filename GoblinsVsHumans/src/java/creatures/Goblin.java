package creatures;

import items.Drop;
import land.Land;

public class Goblin extends Land {
    private int health = 6;
    private int strength = 2;
    private Drop drops;

    public Goblin(int[] position) {
        super(position, 'G');
        this.drops = new Drop(this.getPosition());
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public Drop getDrops() {
        return drops;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDrops(Drop drops) {
        this.drops = drops;
    }
}
