import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i = 0; i < list.size(); i++) {
           Object object=list.get(i);
            System.out.print(object+"\t");
        }
    }
}
