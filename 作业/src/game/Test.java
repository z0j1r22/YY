package game;

public class Test {
    public static void main(String[] args) {
        Person person=new Person("lisi");
        Role role1=new Zhanshi("盖伦战士");
        Role role2=new Fashi("死歌法师");
        Role role3=new Cike("暗影刺客");
        Wuqi wuqi1=new Dao("刀");
        Wuqi wuqi=new Jian("剑");
        Guai guai=new FUdim("伏地魔");
        Guai guai1=new Gebul("哥布林");
        person.start(role1,wuqi1,guai);
        System.out.println();
        person.start(role2,wuqi,guai1);
        System.out.println();
        person.start(role3,wuqi,guai);

    }
}
