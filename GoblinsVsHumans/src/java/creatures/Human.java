package creatures;

import items.Equipment;
import land.Land;

import java.util.ArrayList;

public class Human extends Land{

    int health = 8;
    int strength = 3;

    ArrayList<Equipment> inventory = new ArrayList<>();

    @Override
    public String toString() {
        return "H";
    }

}
