package Stream;

import java.io.*;


public class Test1 {
    public static void main(String[] args) throws IOException {
        File file=new File("d:/啊Y"+File.separator+"test1.txt");
        OutputStream os = new FileOutputStream(file, true);
        String str="你好，Java";
//        os.write(str.getBytes());
        System.out.println(str);
        os.close();
        FileInputStream inputStream=new FileInputStream(file);
        byte[]bytes=new byte[1024];
        int length=inputStream.read(bytes);
        System.out.println(new String(bytes,0,length));
        inputStream.close();
    }
}
