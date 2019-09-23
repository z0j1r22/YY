public class Zuo1 {
    public static void main(String[] args) {
        for (int i=0;i<=20;i++){
            for (int j=0;j<=33;j++){
                int z=100-i-j;
                if (i*5+j*3+z/3==100&&z%3==0){
                    System.out.println("公鸡数"+i+"\t");
                    System.out.println("母鸡数"+j+"\t");
                    System.out.println("鸡雏数"+z+"\t");
                }
            }
        }
    }
}
