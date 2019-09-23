package Stream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Test5 {
    public static void main(String[] args)throws IOException {
        PrintWriter writer=new PrintWriter(new File("d:/啊Y/test2.txt"));
        writer.println("床前明月光");
        writer.println("疑是地上霜");
        writer.println("举头望明月");
        writer.println("低头思故乡");
        System.out.println("OK");
        if (writer!=null){
            writer.close();
        }
    }
}
