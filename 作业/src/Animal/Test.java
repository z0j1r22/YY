package Animal;

public class Test {
    public static void main(String[] args) {

        Animal ary[]=new Animal[6];
        Animal animal=new Cat("小花");
        Animal animal1=new Tiger("大胃王");
        Animal animal2=new Dog("二哈");
        Animal animal3=new Eagle("空中之王");
        Animal animal4=new Swllow("小燕子");
        Animal animal5=new Parrot("巧舌");
        ary[0]=animal;
        ary[1]=animal1;
        ary[2]=animal2;
        ary[3]=animal3;
        ary[4]=animal4;
        ary[5]=animal5;
        Food food=new Dadou("变异豆");
        try {
            for (int i = 0; i < ary.length; i++) {
                ary[i].eat(food);
                if (ary[i]instanceof Ifly){
                    Ifly ifly=(Ifly)ary[i];
                    ifly.fly();
                }
                if (ary[i]instanceof attack){
                    attack attack=(attack)ary[i];
                    attack.attack();
                }
                if (ary[i]instanceof Perform){
                    Perform perform=(Perform)ary[i];
                    perform.perform();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("结束");
        }

    }
}
