package game;

public class Solider extends Role {
    public Solider(String name, String type, int health) {
        super(name, type, health);
    }

    @Override
    public void attack(Monster monster) {
        super.getAttack().attck(monster);
    }
}
