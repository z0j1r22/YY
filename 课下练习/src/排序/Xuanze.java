package 排序;

import java.util.Scanner;
public class Xuanze {
    public static void main(String[] args) {
        int ary[]=new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < ary.length; i++) {
            ary[i]=scanner.nextInt();
        }
        for (int i = 0; i < ary.length; i++) {
            int min=i;
            for (int j = i; j < ary.length; j++) {
                if (ary[min]>ary[j]){
                    min=j;
                }
                if (ary[i]!=ary[min]){
                    int tmp=ary[i];
                    ary[i]=ary[min];
                    ary[min]=tmp;
                }
            }
        }
        for (int i : ary) {
            System.out.print(i+"\t");
        }
    }
}
