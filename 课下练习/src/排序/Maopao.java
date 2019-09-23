package 排序;

import java.util.Scanner;

public class Maopao {
    public static void main(String[] args) {
        int ary[]=new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < ary.length; i++) {
            ary[i]=scanner.nextInt();
        }
        for (int i = 1; i < ary.length; i++) {
            for (int j = 0; j < ary.length-i; j++) {
                if (ary[j]>ary[j+1]){
                    int tmp=ary[j];
                    ary[j]=ary[j+1];
                    ary[j+1]=tmp;
                }
            }
        }
        for (int i : ary) {
            System.out.print(i+"\t");
        }
    }
}
