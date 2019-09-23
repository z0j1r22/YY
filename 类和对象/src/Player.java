import java.util.Scanner;

public class Player {
    String name;
    int quantou;
    int score;
    public int Set(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请出：1：剪刀，2：石头，3：布");
        quantou=scanner.nextInt();
        switch (quantou){
            case 1:
                System.out.println("玩家"+name+"出:剪刀");
                break;
            case 2:
                System.out.println("玩家"+name+"出:石头");
                break;
            case 3:
                System.out.println("玩家"+name+"出:布");
                break;

        }
        return quantou;
    }
}
