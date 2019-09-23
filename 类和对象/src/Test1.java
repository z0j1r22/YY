import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("請選擇玩家的姓名");
        Player player=new Player();
        player.name=scanner.next();
        System.out.println("請選擇電腦的姓名");
        Computer computer=new Computer();
        computer.name=scanner.next();
        int p1=player.Set();
        int c1=computer.set();
        if (p1==1&&c1==3||p1==2&&c1==1||p1==3&&c1==2){
            player.score+=10;
        }else if(p1==c1){

        }else
        {
            computer.score+=10;
        }
        System.out.println("双方的积分:玩家:"+player.name+":"+player.score+"VS"+computer.name+":"+computer.score);
    }
}
