import java.util.Scanner;

public class Test8_19 {

    static int ary[]=new int[]{1,21,3,45,65};
/**
 *
 * 冒泡排序
 */

    public static void Maopao(){
        for (int i = 1; i < ary.length; i++) {
            for (int j = 0; j < ary.length-i; j++) {
                if (ary[j]>ary[j+1]){
                    int temp=ary[j];
                    ary[j]=ary[j+1];
                    ary[j+1]=temp;
                }
            }
        }
    }
    public static void xZ(){
        for (int i = 0; i < ary.length; i++) {
            int minIndex =i;
            for (int j = i; j < ary.length; j++) {
                if (ary[minIndex]>ary[j]){
                    minIndex=j;
                }
            }
            if (ary[i]!=ary[minIndex]) {
                int temp = ary[i];
                ary[i] = ary[minIndex];
                ary[minIndex] = temp;
            }
        }
    }
    public static void show(){
        for (int i : ary) {
            System.out.print(i+"\t");
        }
    }
}
