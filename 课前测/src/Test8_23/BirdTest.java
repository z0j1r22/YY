package Test8_23;

import java.util.ArrayList;

public class BirdTest {
    public static void main(String[] args) {
        ArrayList arrayList= (ArrayList) Test.getFly();
        for (Object o : arrayList) {
            Bird bird= (Bird) o;
            bird.fly();
            System.out.println(o);
        }
    }
}
