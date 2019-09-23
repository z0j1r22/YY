package game;

public abstract class Role {
    private String name;
    private String type;
    private int health;
    private IAttack attack;

    public Role(String name, String type, int health) {
        this.name = name;
        this.type = type;
        this.health = health;;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public IAttack getAttack() {
        return attack;
    }

    public void setAttack(IAttack attack) {
        this.attack = attack;
    }
    public abstract void attack(Monster monster);
}
