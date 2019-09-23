package entity;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseDao {
    private static final String URl="jdbc:mysql://localhost:3306/student";
    private static final String USER="root";
    private static final String PWD="yyk123";

    protected Connection connection=null;
    protected PreparedStatement statement=null;
    protected ResultSet resultSet=null;

    public Connection getConnection()throws SQLException {
        connection= DriverManager.getConnection(URl,USER,PWD);
        return connection;
    }

    /**
     * 执行 增，删，改操作
     * @param sql 要执行的SQL命令
     * @param params 命令中要用到的参数集合
     * @return 受影响的行数
     * @throws SQLException
     */
    public int executeUpdate(String sql,Object[] params)throws SQLException{
        int result=-1;
//        获取连接
        connection=getConnection();
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

    public List<Map>executeQuery(String sql,Object[] params)throws SQLException{
        List<Map> mapList=new ArrayList<>();
        int result=-1;
//        获取连接
        connection=getConnection();
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
        resultSet=statement.executeQuery();
        ResultSetMetaData metaData=resultSet.getMetaData();
       int colCount=metaData.getColumnCount();
       while (resultSet.next()){
           Map<String,Object> row =new HashMap<>();
           for (int i=1;i<=colCount;i++){
                row.put(metaData.getColumnLabel(i),resultSet.getObject(i));
           }
           mapList.add(row);
       }
       this.closeAll(resultSet,statement,connection);
        return mapList;
    }
    /**
     * 关闭并释放资源
     * @param resultSet 结果集
     * @param statement 状态对象
     * @param connection 连接对象
     */
    public void closeAll(ResultSet resultSet,Statement statement,Connection connection){
        try {
            if(resultSet!=null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
