import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set set= new HashSet();
//        添加元素
        set.add("张三");
        set.add("李四");
        //重复元素加不进去
        set.add("张三");
        set.add("张三");
        set.add("王二");
//        返回对set 中的元素进行迭代的迭代器
        Iterator iterator=set.iterator();
//        判断迭代器中是否有元素可迭代
        while (iterator.hasNext()){
            System.out.println(iterator.next());//返回迭代器的下一个元素

        }
        System.out.println(set);
    }
}
