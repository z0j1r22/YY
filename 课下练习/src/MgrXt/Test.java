package MgrXt;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MgrUser mgrUser=new MgrUser();
        while (true){
            System.out.println("1，用户注册  2，用户登录  3，显示用户信息  0，退出系统");
            int choose=scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("请输入用户名");
                    String username=scanner.next();
                    System.out.println("请输入密码");
                    String pwd=scanner.next();
                    User user=new User(username,pwd);
                    try {
                       mgrUser.reg(user);
                        System.out.println("注册成功");
                    }catch (Exception e){
                        System.out.println("账号已经存在，请更换一个新的");
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("请输入用户名");
                    String username1=scanner.next();
                    System.out.println("请输入密码");
                    String pwd1=scanner.next();
                    User user1=new User(username1,pwd1);
                    try {
                        mgrUser.UserLogin(user1);
                        System.out.println("欢迎来到主页面");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                case 3:
                    System.out.println("请输入用户状态：1，启用  0，禁用");
                    int state=scanner.nextInt();
                    mgrUser.showUser(state);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
