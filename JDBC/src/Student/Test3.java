package Student;

import java.sql.*;

public class Test3 {
    static final String URL = "jdbc:mysql://localhost:3306/student";//地址
    static final String USER = "root";//用户名
    static final String PWD = "yyk123";//密码

    public static void main(String[] args)throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet =null;
        connection = DriverManager.getConnection(URL,USER,PWD);
        statement=connection.createStatement();
        String sql ="select id,name,stuno,sex,indate from student";
        resultSet=statement.executeQuery(sql);
        while (resultSet.next()){
            int id =resultSet.getInt(1);
            String name=resultSet.getString(2);
            int stuno =resultSet.getInt(3);
            Date indate=resultSet.getDate(5);
            System.out.println(id+":"+name+":"+stuno+":"+indate);
        }
        if (resultSet!=null){
            resultSet.close();
        }
        if (connection!=null){
            connection.close();
        }
        if (statement!=null){
            statement.close();
        }
    }

}
