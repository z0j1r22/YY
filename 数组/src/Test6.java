import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        int ary[]={30,40,60,50,90,100};
        System.out.println("请选择要删除数的下标:");
        Scanner scanner=new Scanner(System.in);
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
