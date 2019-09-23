package Stream;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws IOException {
        File file=new File("d:/啊Y/1.doc");
        Writer out=new FileWriter(file);
        out.write("你好，Java");
        out.close();
        Reader reader=new FileReader(file);
        char c[]=new char[1024];
        int lenght=reader.read(c);
        System.out.println(new String(c,0,lenght));
        out.close();
        reader.close();
    }
}
