import java.sql.Connection;
import java.sql.SQLException;

public class Test4  {
    public static void main(String[] args)throws SQLException {
       StudentDao studentDao=new StudentDao();

        studentDao.test();
    }
}
