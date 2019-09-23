public class StudentTest {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="张三";
        student.age=21;
        student.tel="13838383838";
        student.hobby="吃饭睡觉打豆豆";
        System.out.println(student.introduce());
    }
}
