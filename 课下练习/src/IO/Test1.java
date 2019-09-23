package IO;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        String path="d:/啊Y/yyk";
        File file=new File(path);
        //判断是否存在着目录
        System.out.println(file.isDirectory());
        if (file.exists()){
            System.out.println("已经存在");
        }
        else {
//            添加新目录
            file.mkdirs();
            System.out.println("ojbk");
        }
        for (int i = 1; i <=5; i++) {
//            添加新File文件
            File file1=new File(path+"/"+"test"+i+".txt");
//            捕捉可能出现的异常
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        遍历输出文件
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName()+":"+file1.getPath());
        }
    }
}
