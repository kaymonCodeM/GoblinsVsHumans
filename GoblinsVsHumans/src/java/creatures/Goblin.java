package creatures;

import land.Land;

public class Goblin extends Land {
    private int health = 6;
    private int strength = 2;
    private String symbol = new String("G");

    @Override
    public String toString() {
        return this.symbol;
    }
}
