import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        步骤：
       /* 1、添加
            2、读取数据
             3、删除数据
             4、遍历显示
       */

        //创建对象:Object
        List list1=new ArrayList(5);

        //添加
        list1.add("姓名");
        list1.add("张三");
        list1.add(18);
        list1.add('男');
        list1.add("隔壁老王");
        //读取数据
        Object o1= list1.get(0);
        Object o2= list1.get(1);

        System.out.println(o1);
        System.out.println(o2);

        System.out.println("数量:"+list1.size());

//        list1.remove("张三");//删除元素
//        list1.remove(1);//删除指定索引对应的元素
        System.out.println(list1.get(1));


        //遍历显示
        for (int i = 0; i < list1.size(); i++) {
            Object tmp= list1.get(i);
            System.out.println(tmp);

        }

        if(list1.contains("隔壁老王")){
            System.out.println("存在");
        } else{
            System.out.println("不存在");
        }

        //转换数组
        Object[] objs=list1.toArray();
        for (Object obj : objs) {
            System.out.println(obj);
        }

//        list1.clear();

        list1.removeAll(list1);
        System.out.println(list1.size());






    }
}

