import java.util.Scanner;

public class Counters {
    public static void main(String[] args) {
        Counter counter=new Counter();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数");
        counter.num1=scanner.nextInt();
        System.out.println("请输入第二个数");
        counter.num2=scanner.nextInt();
        System.out.println("请输入运算符");
        counter.ysf=scanner.next();
        counter.S();
    }
}
