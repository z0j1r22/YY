package game;

public abstract class Monster {
    public abstract void attack(Role role);
}
class Fdm extends Monster{
    @Override
    public void attack(Role role) {
        if (role instanceof Solider){
            System.out.println("伏地魔攻击战士，掉血少");
        }
    }
}
class Gbl extends Monster{
    @Override
    public void attack(Role role) {
        if (role instanceof Solider){
            System.out.println("哥布林攻击战士");
        }
    }
}
