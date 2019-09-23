import java.sql.*;
import java.util.Scanner;

public class Test9_4 {
    static final String URL="jdbc:mysql://localhost:3306/test1";
    static  final String USER="root";
    static final String PWD="yyk123";

    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入角色名");
        String rolename=scanner.next();
        Role role=new Role(rolename);
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        connection = DriverManager.getConnection(URL,USER,PWD);
        statement=connection.createStatement();
        String sql="insert  into t_role (rolename) values ('"+role.getRolename()+"');";
        int result=statement.executeUpdate(sql);
        String sql1="select * from t_role where state=1";
        resultSet=statement.executeQuery(sql1);
        if (result>0){
            System.out.println("添加成功");
        }else {
            System.out.println("失败");
        }
        while (resultSet.next()){
            int state=resultSet.getInt(3);
            System.out.println(state);
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
