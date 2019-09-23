package Stream;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        byte[] bytes=new byte[1];
        FileInputStream fileInputStream=new FileInputStream("d:/啊Y/test1.txt");
        FileOutputStream fileOutputStream=new FileOutputStream("d:/1.txt");
        BufferedInputStream bufferedInputStreamin=new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStreamos=new BufferedOutputStream(fileOutputStream);
        while (bufferedInputStreamin.read(bytes)!=1){
            bufferedOutputStreamos.write(bytes);
        }
        bufferedOutputStreamos.flush();
        bufferedInputStreamin.read();
        bufferedOutputStreamos.close();

    }
}
