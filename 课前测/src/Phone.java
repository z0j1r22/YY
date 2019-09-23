import java.util.Scanner;

public class Phone {
    String pinpai;
    int xinghao;
    int price;
    String riqi;
    public void show(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入品牌");
        pinpai=scanner.next();
        System.out.println("请输入型号");
        xinghao=scanner.nextInt();
        System.out.println("请输入价格");
        price=scanner.nextInt();
        System.out.println("请输入出厂日期");
        riqi=scanner.next();
    }
    public void set(){
        System.out.println("手机品牌："+pinpai+"型号："+xinghao+"价格："+price+"出厂日期"+riqi);
    }
}
