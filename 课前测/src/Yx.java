import java.util.Scanner;

public class Yx {
    public void Yx(){
        Scanner scanner=new Scanner(System.in );
        System.out.println("请输入你的邮箱");
        String email=scanner.next();
        int at=email.indexOf("@");
        int dian=email.indexOf(".");
        boolean a=true;
        if (at==-1||dian==-1||dian>at){
            a=false;
            System.out.println(a);
        }else{
            System.out.println(a);
        }
    }
}
