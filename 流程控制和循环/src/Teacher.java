public class Teacher {
    String name;
    char sex;
    int age;
    public void playGame(String score,int hour){
        if (hour<4) {
            System.out.println("讲课"+score);
        }
        else{
            System.out.println("指导"+score);
        }
    }
}
