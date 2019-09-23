package Menu;

import java.sql.*;

public class Test3 {
    static final String URL = "jdbc:mysql://localhost:3306/test1";//地址
    static final String USER = "root";//用户名
    static final String PWD = "yyk123";//密码

    public static void main(String[] args)throws SQLException {
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        connection = DriverManager.getConnection(URL,USER,PWD);
        statement=connection.createStatement();
        String sql="select menuname,menuurl,type from t_menu";
        resultSet=statement.executeQuery(sql);
        while (resultSet.next()){
            String menuname=resultSet.getString(2);
            String menuurl=resultSet.getString(3);

            System.out.println(menuname+":"+menuurl);
        }
        if (connection!=null){
            connection.close();
        }
        if (statement!=null){
            statement.close();
        }
        if (resultSet!=null){
            resultSet.close();
        }
    }
}
