import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //注册
        /*
         * 1、输入用户名    ：长度>=6 <=10   ;以qy106开头
         * 2、输入密码1，2；长度符合要求，一致；
         * 3、输入邮箱  ：@符号，.存在 ，并且@<.
         * 4、输入地址 : 从地址中截取出河南
         * */
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name=scanner.next();
        //判断所有不符合要求的内容
        if(name.length()<6||name.length()>10){
            System.out.println("长度不符合要求");
            //结束方法的运行:单独的return 只能用在void方法中
            return;
        }
        if(!name.toLowerCase().startsWith("qy106")){
            System.out.println("用户名不符合要求");
            return;
        }
        System.out.println("请输入密码1:");
        String pwd1=scanner.next();
        System.out.println("请输入密码2:");
        String pwd2=scanner.next();
        if(!pwd1.equals(pwd2)) {
            System.out.println("密码不符合要求");
            return;
        }
        System.out.println("请输入邮箱");


    }

}
