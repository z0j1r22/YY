import entity.Student;

import java.sql.SQLException;

public class Test2 {
    public static void main(String[] args)throws SQLException {
        StudentDao studentDao=new StudentDao();
//        Student student=studentDao.login("小宝","2");
//        if (student!=null){
//            System.out.println("登录成功");
//        }else {
//            System.out.println("失败");
//        }
//        Student student1=new Student("二宝","13","牛顿");
//        int result1=studentDao.addStudent(student1);
//        if (result1>0){
//            System.out.println("注册成功");
//        }else {
//            System.out.println("失败");
//        }
//        Student student=new Student(2,"三宝","234","阿萨");
//        int result=studentDao.editStudent(student);
//        if (result>0){
//            System.out.println("成功");
//        }else {
//            System.out.println("失败");
//        }
        Student student=new Student(2,"三宝","234","阿萨");
        int result2=studentDao.deleteStudent(student);
        if (result2>0){
            System.out.println("成功啦");
        }else {
            System.out.println("遗憾");
        }
    }

}
