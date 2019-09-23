package Role;

import entity.Role;

import java.sql.*;
import java.util.Scanner;

public class Test1 {
    static final String URL = "jdbc:mysql://localhost:3306/test1";//地址
    static final String USER = "root";//用户名
    static final String PWD = "yyk123";//密码

    public static void main(String[] args)throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入角色姓名:");
        String rolename=scanner.next();
        System.out.println("请输入角色状态:");
        String state=scanner.next();
        System.out.println("请输入角色描述:");
        String remark=scanner.next();
        Connection connection = null;
        Statement statement = null;
        connection = DriverManager.getConnection(URL,USER,PWD);
        statement=connection.createStatement();
        Role role=new Role(rolename,state,remark);
        String sql="insert into t_role(rolename,state,remark) values('"+role.getRolename()+"','"+role.getState()+"','"+role.getRemark()+"')";
        int result=statement.executeUpdate(sql);
        if (result>0){
            System.out.println("添加成功");
        }else {
            System.out.println("失败");
        }
        if (statement!=null){
            statement.close();
        }
        if (connection!=null){
            connection.close();
        }
  }
}
