package items;

public class Equipment {
    private String description;
    private String type;
    private int health;
    private int strength;

    public Equipment(String description, String type, int health, int strength) {
        this.description = description;
        this.type = type;
        this.health = health;
        this.strength = strength;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
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

    public void setType(String type) {
        this.type = type;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
