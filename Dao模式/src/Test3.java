import Dao.UserDao;
import Dao.UserDaoImpl;
import entity.User;

import java.util.List;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        User user=new User(45,"大宝","qwe",java.sql.Date.valueOf("2019-9-6"));
        UserDao dao=new UserDaoImpl();
        int result=dao.Add(user);
        if (result>0){
            System.out.println("添加成功");
        }
        else {
            System.out.println("失败");
        }


    }
}
