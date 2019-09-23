package 排序;

import java.util.Scanner;

public class Charu {
    public static void main(String[] args) {
        int ary[]=new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < ary.length; i++) {
            ary[i]=scanner.nextInt();
        }
        for (int i = 0; i < ary.length; i++) {
            int tmp = ary[i];
            int j;
            for (j = i-1; j >=0;j--) {
                if (ary[j]>tmp){
                    ary[j+1]=ary[j];
                }
                else {
                    break;
                }
            }
            ary[j+1]=tmp;
        }
        for (int i : ary) {
            System.out.print(i+"\t");
        }
    }
}
