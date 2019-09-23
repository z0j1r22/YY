import com.mysql.jdbc.ResultSetRow;

import java.net.URL;
import java.sql.*;

public class Basedao1 {
    static final String URL="jdbc:mysql://localhost:3306/test1";
    static final String USER="root";
    static final String PWD="yyk123";
    static Connection connection=null;
    static PreparedStatement statement=null;
    static ResultSet resultSet=null;
    public static Connection getConnection(String sql)throws SQLException {
        connection=DriverManager.getConnection(URL,USER,PWD);
        return  connection;
    }
    public static int executeUpdate(String sql,Object[] params)throws SQLException{
        int result=-1;
//        获取连接
        connection=getConnection(sql);
//        获取预编译的preparestatement对象
        statement=connection.prepareStatement(sql);
//        判断参数是否为空
        if (params!=null){
            for (int i = 0; i < params.length; i++) {
                Object param = params[i];
//                绑定参数
                statement.setObject(i+1,param);
            }
        }
        result =statement.executeUpdate();
        return result;
    }
    public static void closeAll(Connection connection,PreparedStatement statement,ResultSet resultSet)throws SQLException{
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

