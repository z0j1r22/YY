package Stream;

import java.io.*;

public class Test8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Role role=new Role("吕布",15,"战士");
        String path="d:/啊Y/ 2.bin";
        ObjectOutputStream write=new ObjectOutputStream(new FileOutputStream(path));
        write.writeObject(role);
        System.out.println("OK");
        if (write!=null){
            write.close();
        }
        ObjectInputStream read=new ObjectInputStream(new FileInputStream(path));
        role= (Role)read.readObject();
        System.out.println(role);
        System.out.println(role.getName()+":"+role.getLevel()+":"+role.getType());
        if (read!=null){
            read.close();
        }
    }

}
