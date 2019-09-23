import java.sql.*;

public class Test1 {

    public static void main(String args[]) {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序
//            System.out.println("成功加载数据库!");
//        }
//        catch (Exception e) {
//            System.out.print("加载失败!");
//            e.printStackTrace();
//        }
        try {
            Connection connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student","root","yyk123");
            //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码

            System.out.println("成功连接数据库!");
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student");
            //user 为你表的名称
            while (rs.next()) {
                System.out.println(rs.getString("name")+rs.getString("sex"));
            }
        }
        catch (Exception e) {
            System.out.print("获取数据失败!");
            e.printStackTrace();
        }
    }
}



