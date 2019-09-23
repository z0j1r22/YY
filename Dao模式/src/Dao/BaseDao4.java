package Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseDao4 {
    private final String URL="jdbc:mysql://localhost/test1";
    private final String UESR="root";
    private final String PWD="yyk123";
    protected Connection connection=null;
    protected ResultSet resultSet=null;
    protected PreparedStatement statement=null;

    public Connection getConnection()throws SQLException {
        connection=statement.getConnection();
        return connection;
    }
    public int execteUpdate(String sql,Object[]params)throws SQLException{
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
        int result=-1;
        List<Map> mapList=new ArrayList<>();
        connection=statement.getConnection();
        statement=connection.prepareStatement(sql);
        if (params!=null){
            for (int i = 0; i < params.length; i++) {
                Object param = params[i];
                statement.setObject(i+1,param);
            }
        }
        ResultSetMetaData metaData=null;
        int colCount= 0;
        try {
            resultSet=statement.executeQuery();
            metaData = resultSet.getMetaData();
            colCount = metaData.getColumnCount();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            while (resultSet.next()){
                Map<String,Object> row =new HashMap<>();
                for (int i=1;i<=colCount;i++){
                    row.put(metaData.getColumnLabel(i),resultSet.getObject(i));
                }
                mapList.add(row);
            }
        } catch (SQLException e) {

        }
        this.closeAll(connection,statement,resultSet);
        return mapList;
    }
    public  void closeAll(Connection connection, Statement statement,ResultSet resultSet)throws SQLException{
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
