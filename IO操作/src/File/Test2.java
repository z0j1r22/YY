package File;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        String path="d:/啊Y";
        File file=new File(path);
        show(file);
}
    public static  void show(File file){
        if (file.isDirectory()){
            System.out.println("<DIR>"+file.getName());
            File[]files=file.listFiles();
            for (File file1:files){
                show(file1);
            }
        }else {
            System.out.println("<FILE>"+file.getName());
        }
    }
//    public static  int fn(int n){
//        if (n==1||n==2){
//            return 1;
//        }
//        return fn(n-1)+fn(n-2);
//    }
}
