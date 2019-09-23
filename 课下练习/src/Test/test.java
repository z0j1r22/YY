package Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        String str="asdafdassdfdfsdfaza";
        char ary[]=str.toCharArray();
        Map<Character,Integer> map=new HashMap();
        for (char c:ary){
            if (map.containsKey(c)){
                Integer integer=map.get(c);
                map.put(c,++integer);
            }else {
                map.put(c,1);
            }
        }
        Iterator<Character>iterator=map.keySet().iterator();
        while (iterator.hasNext()){
            Character key=iterator.next();
            System.out.println("字符："+key+"次数："+map.get(key));
        }
    }
}
