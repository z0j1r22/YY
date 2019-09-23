package game;

public class Test {
    public static void main(String[] args) {
        Role role=new Solider("安琪拉","法师",2000);
        IAttack iAttack =new Kmife();
        role.setAttack(iAttack);
        Monster monster=new Gbl();
        role.attack(monster);
    }
}
