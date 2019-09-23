
import java.sql.*;
import java.util.Scanner;

public class Test5 {
    static final String URL="jdbc:mysql://localhost:3306/student";
    static final String USER="root";
    static final String PWD="yyk123";

    public static void main(String[] args)throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入录入的角色名称");
        String name=scanner.next();
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        int key=0;
        connection= DriverManager.getConnection(URL,USER,PWD);
        String sql="insert into student(name,stuno,address) values(?,?,2)";
        statement=connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        statement.setString(1,name);
        statement.setString(2,name);
        int result=statement.executeUpdate();
        resultSet=statement.getGeneratedKeys();
        if (resultSet.next()){
            key=resultSet.getInt(1);
            if (result>0){
                System.out.println("成功");
                System.out.println("最新id的值"+key);
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
}
