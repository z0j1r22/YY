import java.util.Scanner;

public class Test8_17 {
    public static void main(String[] args) {
        int ary[]=new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < ary.length; i++) {
            ary[i]=scanner.nextInt();
        }
        for (int i = 1; i <ary.length ; i++) {
            for (int j = 0; j < ary.length-i; j++) {
                if (ary[j]>ary[j+1]) {
                    int temp = ary[j];
                    ary[j] = ary[j + 1];
                    ary[j + 1] = temp;
                }
            }
        }
        for (int i : ary) {
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("请选择要删除数的下标:");
        int index=scanner.nextInt();
        int []sr=new int[ary.length-1];
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
