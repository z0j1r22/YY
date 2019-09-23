package Test8_24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一串字符串");
        String str=scanner.next();
        char[] ary =str.toCharArray();
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (char c:ary) {
            if (hashMap.containsKey(c)) {
                Integer integer = hashMap.get(c);
                hashMap.put(c, ++integer);
            } else {
                hashMap.put(c, 1);
            }
        }
        Iterator<Character>iterator=hashMap.keySet().iterator();
        while (iterator.hasNext()){
            Character key=iterator.next();
            System.out.println("字符："+key+"值："+hashMap.get(key));
        }
    }
}
