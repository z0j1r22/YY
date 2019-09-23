package Test8_26;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入目录");
        String path=scanner.next();
        File file=new File(path);
        if (file.exists()){
            show(file);
        }else {
            System.out.println("目录不存在");
        }

    }
    public static void show(File file){
        if (file.isDirectory()){
            System.out.println(file.getPath());
            File[] files = file.listFiles();
            for (File file1:files){
                show(file1);
            }
        }
    }
}
