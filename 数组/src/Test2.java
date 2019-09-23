import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int min=1000;
        int max=0;
        int sum=0;
        int ary[]=new int[5];
        for (int i = 0; i <ary.length ; i++) {
            System.out.println("请输入第"+(i+1)+"个人的成绩：");
            ary[i]=scanner.nextInt();
            if (ary[i]>max){
                max=ary[i];
            }
            if (ary[i]<min){
                min=ary[i];
            }
            sum+=ary[i];
        }
        System.out.println("最大值："+max+"最小值"+min+"平均值"+sum/5);
    }
}
