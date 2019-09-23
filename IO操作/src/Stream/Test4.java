package Stream;

import java.io.*;

public class Test4 {
    public static void main(String[] args)throws IOException {
      File file=new File("d:/啊Y/test1.txt");
      File file1=new File("c:/test1.txt");
//      读取流
        BufferedInputStream read=new BufferedInputStream(new FileInputStream(file));
//        写入流
        BufferedOutputStream write=new BufferedOutputStream(new FileOutputStream(file1));

        int b;
        while ((b=read.read())!=-1){
            write.write(b);
        }
        System.out.println("完毕");
        if (read!=null){
            read.close();
        }
        if (write!=null){
            write.close();
        }
    }
}
