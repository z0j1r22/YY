package Menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test2 {
    static final String URL = "jdbc:mysql://localhost:3306/test1";//地址
    static final String USER = "root";//用户名
    static final String PWD = "yyk123";//密码

    public static void main(String[] args)throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入权限姓名:");
        String menuname=scanner.next();
        Connection connection = null;
        Statement statement = null;
        connection = DriverManager.getConnection(URL,USER,PWD);
        statement=connection.createStatement();
        String sql="delete from t_menu where menuname='"+menuname+"'";
        int result=statement.executeUpdate(sql);
        if (result>0){
            System.out.println("删除成功");
        }else {

            System.out.println("失败");
        }
        if (connection!=null){
            connection.close();
        }
        if (statement!=null){
            statement.close();
        }
    }
}
