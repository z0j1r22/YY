package Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseDao2 {
    private final String URL="jdb:mysql://localhost/test1";
    private final String USER="root";
    private final String PWD="yyk123";

    protected Connection connection=null;
    protected PreparedStatement statement=null;
    protected ResultSet resultSet=null;

    public  Connection getConnection(){
        try {
            connection=statement.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public int executeUpdate(String sql,Object[]params)throws SQLException{
        int result=-1;
        connection=statement.getConnection();
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
    public List<Map>executeQuery(String sql,Object[]params)throws SQLException{
        List<Map>mapList=new ArrayList<>();
        connection=statement.getConnection();
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
          Map<String,Object> row=new HashMap<>();
          for (int i=0;i<=colCount;i++){
              row.put(metaData.getColumnLabel(1),resultSet.getObject(1));
          }
          mapList.add(row);
      }
      colseAll(connection,statement,resultSet);
      return mapList;
    }
    public void colseAll(Connection connection,Statement statement,ResultSet resultSet)throws SQLException{
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
