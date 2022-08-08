package items;

public class Equipment {
    private String description;
    private char role; // This char will be D for defend and A for attack
    private String type; // Type can be chest, gloves, sword, axe, ect...
    private int health;
    private int strength;


    public Equipment(String description, char role, String type, int health, int strength) {
        this.description = description;
        this.role = role;
        this.type = type;
        this.health = health;
        this.strength = strength;
    }

    public String getDescription() {
        return description;
    }

    public char getRole() {
        return role;
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

    public void setRole(char role) {
        this.role = role;
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
