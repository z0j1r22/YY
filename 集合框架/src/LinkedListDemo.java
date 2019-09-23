import java.util.*;

public class LinkedListDemo {
        public static void main(String[] args) {
            LinkedList linkedList = new LinkedList();

            linkedList.add("a");//向链表添加数据
            linkedList.add("b");
            linkedList.add("c");

            linkedList.addFirst("m");//在链表表头增加数据
            linkedList.addLast("n");//在链表表尾增加数据
            System.out.println(linkedList);//输出链表内容
        }

}
