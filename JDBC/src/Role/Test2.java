package Role;

import java.sql.*;
import java.util.Scanner;

public class Test2 {
    static final String URL = "jdbc:mysql://localhost:3306/test1";//地址
    static final String USER = "root";//用户名
    static final String PWD = "yyk123";//密码

    public static void main(String[] args)throws SQLException {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入角色姓名:");
//        String rolename=scanner.next();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet=null;
        connection = DriverManager.getConnection(URL,USER,PWD);
        statement=connection.createStatement();
//        String sql="delete from t_role where rolename='"+rolename+"'";
        String sql1="select id,rolename,state,remark from t_role";
        resultSet=statement.executeQuery(sql1);
//        int result =statement.executeUpdate(sql);
        while (resultSet.next()){
            int id=resultSet.getInt(1);
            String rolename1 =resultSet.getString(2);
            String state=resultSet.getString(3);
            String remark=resultSet.getString(4);
            System.out.println(id+":"+rolename1+":"+state+":"+remark);
        }
//        if (result>0){
//            System.out.println("删除成功");
//        }else {
//            System.out.println("失败");
//        }
        if (connection!=null){
            connection.close();
        }
        if (statement!=null){
            statement.close();
        }
    }
}
