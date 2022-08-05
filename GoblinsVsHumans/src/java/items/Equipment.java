package items;

public class Equipment {
    private String description;
    private int health = 0;
    private int strength = 0;

    public Equipment(String description, int health, int strength) {
        this.description = description;
        this.health = health;
        this.strength = strength;
    }

    public String getDescription() {
        return description;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
