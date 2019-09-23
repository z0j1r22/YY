import java.util.Scanner;

public class Ym {
    public void Ym1(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的域名");
        String ym1=scanner.next();
        if (ym1.endsWith(".com")){
            System.out.println("商业机构");
        }
        else if (ym1.endsWith(".cn")){
            System.out.println("国家机构");
        }
        else if (ym1.endsWith(".org")){
            System.out.println("公益机构");

        }
    }
}
