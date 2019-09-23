package Test8_23_2;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
       Numlist numlist=new Numlist();
        HashSet hashSet=numlist.getNumlist();
        Iterator iterator=hashSet.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
        System.out.println(hashSet);
    }
}
