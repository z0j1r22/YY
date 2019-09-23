public class Lianxi4 {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.name="讲师";
        teacher.sex='男';
        teacher.age=36;
        int hour=3;
        String score="JAVA";
        System.out.println(teacher.name+teacher.sex+teacher.age);
        teacher.playGame(score,hour);

        Car car=new Car();
        car.size="法拉利";
        car.price=360000;
        System.out.println(car.size+car.price);
        car.Sudu();

        Dog dog=new Dog();
        dog.name="哈士奇";
        dog.sex='公';
        dog.height=0.6;
        System.out.println(dog.name+dog.sex+dog.height);
        int num=dog.Xixing(21);
        System.out.println(dog.name+"买"+num+"个骨头");

    }
}
