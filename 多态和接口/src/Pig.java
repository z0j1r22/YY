public class Pig extends Pet{
  public Pig(String name){
      super(name);
    }

    @Override
    public void eat() {
        System.out.println("小香猪"+this.getName()+"吃饲料");
    }
}
