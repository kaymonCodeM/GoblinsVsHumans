package creatures;

import items.Equipment;
import land.Land;

import java.util.ArrayList;

public class Human extends Land{

    private int health = 8;
    private int strength = 3;
    private String symbol = new String("C");

    ArrayList<Equipment> inventory = new ArrayList<>();

    @Override
    public String toString() {
        return this.symbol;
    }

}
