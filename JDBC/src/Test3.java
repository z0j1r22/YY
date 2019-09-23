import entity.Student;

import java.sql.SQLException;

public class Test3 {
    public static void main(String[] args)throws SQLException {
        StudentDao2 studentDao2=new StudentDao2();

        Student student1=new Student("六宝","18","牛顿");
        int result1=studentDao2.addStudent(student1);
        if (result1>0){
            System.out.println("注册成功");
        }else {
            System.out.println("失败");
        }

    }

}
