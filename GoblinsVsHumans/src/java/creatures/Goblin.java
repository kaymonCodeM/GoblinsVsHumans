package creatures;

import land.Land;

public class Goblin extends Land {
    int health = 6;
    int strength = 2;

    @Override
    public String toString() {
        return "G";
    }
}
