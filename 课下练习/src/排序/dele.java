package 排序;

import java.util.Scanner;

public class dele {
    public static void main(String[] args) {
        int ary[]=new int[]{10,20,30,40,50};
        System.out.println("请输入要删除元素的下标：");
        Scanner scanner=new Scanner(System.in);
        int index=scanner.nextInt();
        int sr[]=new int[ary.length-1];
        for (int i = 0; i < ary.length; i++) {
            if (i<index){
                sr[i]=ary[i];
            }
            if (i>index) {
                sr[i - 1] = ary[i];
            }
        }
        ary=sr;
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i]+"\t");

        }
    }
}
