import java.util.*;
public class HaspMap {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("睡觉","打呼噜");
        map.put("吃饭","打豆豆");
        map.put("学习","偷玩");
        Object oj=map.get("吃饭");
        System.out.println(oj);
        map.remove("睡觉");
        map.put("休息","打篮球");
        Set set=map.keySet();
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            String key=(String)iterator.next();
            System.out.println(key+":"+map.get(key));
        }

    }
}
