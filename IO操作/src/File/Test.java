package File;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        String path="d:/小奎仔/yyk";
        File file=new File(path);
        System.out.println(file.isDirectory());
        if (file.exists()){
            System.out.println("已经存在");
        }else {
            file.mkdirs();
            System.out.println("ojbk");
        }
        for (int i = 1; i <=5; i++) {
         File file1=new File(path +"/"+"test"+i+".txt");
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File[] files=file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName()+":"+file1.getPath());
        }

    }
}
