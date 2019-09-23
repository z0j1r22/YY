package Stream;
import java.io.*;

public class Test6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        序列化
    Role role=new Role("安琪拉",66,"法师");
        String path ="d:/啊Y/.bin";
        ObjectOutputStream write=new ObjectOutputStream(new FileOutputStream(path));
        write.writeObject(role);
        System.out.println("OK");
        if (write!=null){
            write.close();
        }
//        反序列化
        ObjectInputStream read=new ObjectInputStream(new FileInputStream(path));
        role= (Role)read.readObject();
        System.out.println(role);
//        System.out.println(role.getName()+":"+role.getType());
        if (read!=null){
            read.close();
        }
    }
}
