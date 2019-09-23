package Student;

import entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Test2 {
    static final String URL = "jdbc:mysql://localhost:3306/student";//地址
    static final String USER = "root";//用户名
    static final String PWD = "yyk123";//密码

    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);

        System.out.println("请输入姓名:");
        String name=scanner.next();
        System.out.println("请输入学号:");
        String stuno=scanner.next();
        System.out.println("请输入地址:");
        String address=scanner.next();
        Student student=new Student(name,stuno,address);
        Connection connection = null;
        Statement statement = null;
        connection = DriverManager.getConnection(URL,USER,PWD);
        statement=connection.createStatement();
        String sql="insert into student(name,stuno,address) values('"+student.getName()+"','"+student.getStuno()+"','"+student.getAddress()+"')";
        int result =statement.executeUpdate(sql);
        if (result>0){
            System.out.println("录入成功");
        }else {
            System.out.println("失败");
        }
        System.out.println("请输入要删除的姓名:");
        String name1=scanner.next();
        String sql1="delete from student where name='"+name1+"'";
        int result1 =statement.executeUpdate(sql1);
        if (result1>0){
            System.out.println("删除成功");
        }else {
            System.out.println("失败");
        }
        if (statement != null) {
            statement.close();
        }

        if (connection != null)
            connection.close();

    }
}
