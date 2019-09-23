package game;

public interface IAttack {
    void  attck(Monster monster);
}
class  Kmife implements IAttack{
    @Override
    public void attck(Monster monster) {
        if (monster instanceof  Fdm){
            System.out.println("用大刀攻击：伏地魔");
        }else {
            System.out.println("砍死哥布林");
        }
    }
}
