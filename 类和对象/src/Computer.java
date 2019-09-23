import java.util.Random;

public class Computer {
    String name;
    int quantou;
    int score;
    public int set(){
        Random random=new Random();
        int n=random.nextInt(3);
        quantou=n+1;
        switch (quantou){
            case 1:
                System.out.println("电脑"+name+"出:剪刀");
                break;
            case 2:
                System.out.println("电脑"+name+"出:石头");
                break;
            case 3:
                System.out.println("电脑"+name+"出:布");
                break;

        }
        return quantou;
    }
}
