public class Test9 {
    public static void main(String[] args) {
        String[][]ary=new String[][]{{"张三","李四","王二"},{"麻子","李白","武松"}};
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                System.out.print(ary[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
