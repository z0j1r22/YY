import entity.BaseDao;
import entity.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao2 extends BaseDao {
    public Student login(String name,String stuno)throws SQLException{
        String sql="";
        Student student=null;
        connection=getConnection();
        statement=connection.prepareStatement(sql);
        statement.setString(1,name);
        statement.setString(2,stuno);
        ResultSet resultSet=statement.executeQuery();
        while (resultSet.next()){
            String name1=resultSet.getString(1);
            String stuno1=resultSet.getString(2);
            student=new Student(name1,stuno1);
        }
        closeAll(resultSet,statement,connection
        );
        return student;
    }
    public int addStudent(Student student) throws SQLException {
        String sql="insert into student(name,stuno,address) values(?,?,?)";
        int result=-1;
        Object[] params=new Object[]{student.getName(),student.getStuno(),student.getAddress()};
        result=executeUpdate(sql,params);
        return result;
    }
    public int editStudent(Student student)throws SQLException{
        String sql="update student set name=?,stuno=?,Address=? where id=?";
        int result=-1;
        Object[] parpams=new Object[]{student.getName(),student.getStuno(),student.getAddress(),student.getId()};
        result=executeUpdate(sql,parpams);
        return result;
    }
    public int deleteStudent(Student student)throws SQLException{
        String sql="delete from student where id=?";
        Object[]params=new Object[]{student.getId()};
        int result=-1;
        result=executeUpdate(sql,params);
        return result;
    }


}
