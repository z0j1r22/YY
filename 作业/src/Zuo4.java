public class Zuo4 {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                if (j==i){
                    continue;
                }
                for (int k=1;k<=4;k++){
                    if (k==i||k==j){
                        continue;
                    }
                    int m=10-i-j-k;
                    System.out.println(""+i+j+k+m);
                }
           }

        }
    }
}
