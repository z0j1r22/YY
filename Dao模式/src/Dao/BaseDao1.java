package Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseDao1 {
    private final String URL="jdbc:mysql://localhost:3306/test1";
    private final String USER="root";
    private final String PWD="yyk123";

    Connection connection=null;
    PreparedStatement statement=null;
    ResultSet resultSet=null;

    public Connection getConnection(){
        try {
            connection= DriverManager.getConnection(URL,USER,PWD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public int executeUpdate(String sql, Object[] params)throws SQLException{
        int result=-1;
        connection=getConnection();
        statement=connection.prepareStatement(sql);
        if (params!=null){
            for (int i = 0; i < params.length; i++) {
                Object param = params[i];
                statement.setObject(i+1,param);
            }
        }
        result=statement.executeUpdate();
        return result;
    }
    public List<Map> execueQuery(String sql,Object[]params)throws SQLException{
        List<Map>list=new ArrayList<>();
        int result=-1;
        connection=getConnection();
        statement=connection.prepareStatement(sql);
        if (params!=null){
            for (int i = 0; i < params.length; i++) {
                Object param = params[i];
                statement.setObject(i+1,param);
            }
        }
        ResultSetMetaData metaData=null;
        int colCount=0;
        resultSet=statement.executeQuery();
        metaData=resultSet.getMetaData();
        colCount=metaData.getColumnCount();
        while (resultSet.next()){
            Map<String,Object>row=new HashMap<>();
            for (int i = 0; i <=colCount; i++) {
               row.put(metaData.getColumnLabel(1),resultSet.getObject(1));
            }
            list.add(row);
        }
        closeAll(resultSet,statement,connection);
       return list;
    }
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
