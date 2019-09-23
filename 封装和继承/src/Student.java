public class Student extends Person{
    public Student(){
        super("王二");
        System.out.println("在吃饭");
    }
    public void play(){
        System.out.println(this.getName()+"在玩游戏");
    }
    public Student(String name,char sex,int age){
        super(name,sex,age);
    }
    public  void study(){
        System.out.println(getName()+"在学习");
    }

}
