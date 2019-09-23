package Stream;

import java.io.*;

public class Test7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Role role=new Role("卤蛋",15,"射手");
        String path="d:/啊Y/1.bin";
        ObjectOutputStream write=new ObjectOutputStream(new FileOutputStream(path));
        write.writeObject(role);
        System.out.println("OK");
        if (write!=null){
            write.close();
        }
        ObjectInputStream read=new ObjectInputStream(new FileInputStream(path));
        role= (Role) read.readObject();
        System.out.println(role);
        System.out.println(role.getName()+":"+role.getType());
        if (read!=null){
            read.close();
        }
    }
}
