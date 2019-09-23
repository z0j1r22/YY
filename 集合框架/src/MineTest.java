import java.util.*;
public class MineTest {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add(new Mine("YYK", '男',184,64));
        arrayList.add(new Mine("ZJR",'女',165,50));
        arrayList.add(new Mine("LX",'男',175,70));
        arrayList.remove(2);
        System.out.println(arrayList.get(1));
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()){
            Mine mine=(Mine)iterator.next();
            System.out.println(mine);
        }
    }

}
