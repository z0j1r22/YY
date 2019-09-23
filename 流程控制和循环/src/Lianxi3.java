public class Lianxi3 {
    public static void main(String[] args) {
        int bs=0;
        for (int i=1;i<=100;i++){
            bs=3*i;
            if (bs>100){
                break;
            }
            System.out.println("3的倍数"+bs+"\t");
            if (i%7==0){
                System.out.println();
            }
        }

    }
}
