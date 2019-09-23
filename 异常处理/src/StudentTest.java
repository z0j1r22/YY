public class StudentTest {
    public static void main(String[] args) {
        Student student=new Student();
        try {
            student.setSex("男");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try {
            student.setAge(200);
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            student.setName("wang4545");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
