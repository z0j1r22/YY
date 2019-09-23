import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List list=new ArrayList();
        Student student=new Student();
        list.add("Java app");
        list.add(1);
        list.add(student);
//        list.remove(student);
//        list.remove(1);
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.removeAll(list);
        System.out.println(list.size());
    }
}
