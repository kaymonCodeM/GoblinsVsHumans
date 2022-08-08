package creatures;

import items.Drop;
import land.Land;

public class Goblin extends Land {
    private int health = 6;
    private int strength = 2;
    private Drop drops;

    public Goblin(int[] position) {
        super(position, 'G');
        this.drops = new Drop(position);
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

    @Override
    public String toString() {
        String result = "";
        result += "Symbol: " + this.getSymbol() + "\n";
        result += "Position: " + "x = " + this.getPosition()[1] + ", " + "y = " + this.getPosition()[0] + "\n";
        result += "Health: " + this.getHealth() + "\n";
        result += "Strength: " + this.getStrength() + "\n\n";
        result += "DROPS: " + "\n\n";
        result += drops.toString();
        return result;
    }
}
