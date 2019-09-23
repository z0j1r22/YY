public class Person {
    private String name;
    private char sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Person(){
        System.out.println("在打架");
    }
    public Person(String name){
        this.name=name;
        System.out.println("Person构造方法");
    }
    public Person(String name,char sex,int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }
}
