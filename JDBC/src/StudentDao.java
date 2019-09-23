import entity.BaseDao;
import entity.Student;


import java.sql.*;

public class StudentDao extends BaseDao  {
   public  Student login(String name,String stuno)throws SQLException {
       String sql="select name,stuno,sex,indate,address,phone "+
               "from student where name=? and stuno=?";
       Student student=null;
       connection=getConnection();
       statement=connection.prepareStatement(sql);
       statement.setString(1,name);
       statement.setString(2,stuno);
       resultSet=statement.executeQuery();
       while (resultSet.next()){
           String name1=resultSet.getString(1);
           String stuno2=resultSet.getString(2);
           student=new Student(name1,stuno2);
       }
       closeAll(null,statement,connection);
       return student;
   }
   public int addStudent(Student student)throws SQLException{
//       String sql="insert into student(name,stuno,address) values(?,?,?)";
       int result=-1;
//       connection=getConnection();
//       statement=connection.prepareStatement(sql);
//       statement.setString(1,student.getName());
//       statement.setString(2,student.getStuno());
//       statement.setString(3,student.getAddress());
//       result=statement.executeUpdate();
//       closeAll(resultSet,statement,connection);
       return result;

   }
   public int editStudent(Student student)throws SQLException{
       String sql="update student set name=?,stuno=?,Address=? where id=?";
       int result=-1;
       connection=getConnection();
       statement=connection.prepareStatement(sql);
       statement.setString(1,student.getName());
       statement.setString(2,student.getStuno());
       statement.setString(3,student.getAddress());
       statement.setInt(4,student.getId());
       result=statement.executeUpdate();
       closeAll(resultSet,statement,connection);
       return result;
   }
    public int deleteStudent(Student student)throws SQLException{
        String sql="delete from student where id=?";
        int result=-1;
        connection=getConnection();
        statement=connection.prepareStatement(sql);
        statement.setInt(1,student.getId());
        result=statement.executeUpdate();
        closeAll(resultSet,statement,connection);
        return result;


    }
    public void test()throws SQLException{
        //获取连接
        connection=getConnection();
        try {
            //关闭自动提交
            connection.setAutoCommit(false);
            //一系列数据操作（增、删、改）
            //第一次的数据操作
            String sql="insert into t_role(id,rolename,state,remark) values(?,?,1,?)";
            statement=connection.prepareStatement(sql);
            statement.setInt(1,5);
            statement.setString(2,"巡山总指挥");
            statement.setString(3,"巡山总指挥");
            statement.executeUpdate();
            //第二次的数据操作
            int id=6;
            statement=connection.prepareStatement(sql);
            statement.setInt(1,id);
            statement.setString(2,"总兵官");
            statement.setString(3,"总兵官");
            statement.executeUpdate();
//            if(id==6){
//                throw new RuntimeException("id不能是6");
//            }

            //第三次的数据操作
            sql="update t_role set rolename=? where id=?";
            statement=connection.prepareStatement(sql);
            statement.setString(1,"山大王");
            statement.setInt(2,4);
            statement.executeUpdate();
            //提交事务
            connection.commit();
        } catch (SQLException e) {
            try {
                //回滚
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            closeAll(null,statement,connection);
        }


    }

}
