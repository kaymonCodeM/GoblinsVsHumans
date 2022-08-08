package items;



public class Equipment {
    public enum Role{ATTACK,DEFEND}
    public enum Type{HELMET,CHEST,GLOVES,BOOTS,SHIELD,SWORD,AXE,HAMMER}
    private String description;
    private Role role;
    private Type type;
    private int health;
    private int strength;

    public Equipment(String description, Role role, Type type, int health, int strength) {
        this.description = description;
        this.role = role;
        this.type = type;
        this.health = health;
        this.strength = strength;
    }

    public String getDescription() {
        return description;
    }

    public Role getRole() {
        return role;
    }

    public Type getType() {
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

    public void setRole(Role role) {
        this.role = role;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
