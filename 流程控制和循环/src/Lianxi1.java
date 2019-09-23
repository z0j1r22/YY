import java.util.Scanner;

public class Lianxi1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System. in);
        int n=5,sum=0,avg=0,score=0;
        for (int i=1;i<=n;i++){
            System.out.println("请输入第"+i+"次成绩");
            score=scanner.nextInt();
            sum+=score;

            if (score<0){
                break;
            }

        }
        avg=sum/5;
        System.out.println("平均数"+avg);
    }
}
