import java.util.Scanner;

public class Game {
    Player player;
    Computer computer;
    public void init(){
        player=new Player();
        computer=new Computer();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请选择玩家的名字");
        player.name=scanner.next();
        System.out.println("请选择电脑的名字");
        computer.name=scanner.next();
    }
    public void run(){
        int p1=player.Set();
        int c1=computer.set();
        if (p1==1&&c1==3||p1==2&&c1==1||p1==3&&c1==2){
            player.score+=10;
        }else if(p1==c1){

        }else
        {
            computer.score+=10;
        }
    }
    public void showResult()
    {
        System.out.println("双方的积分:玩家:"+player.name+":"+player.score+"VS"+computer.name+":"+computer.score);
    }
}
