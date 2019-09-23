package Test;

import Dao.UserDao;
import Dao.UserDaoImpl;
import entity.User;

import java.util.List;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
//        User user=new User("18","234","123",java.sql.Date.valueOf("2018-1-1"));
//        User user=new User(19,"子宝","12121","aa");
        User user=new User(19);
        UserDao dao=new UserDaoImpl();
        int result=dao.delete(user);
        if (result>0){
            System.out.println("成功");
            List<Map> list=dao.queryAll();
            for (Map map : list) {
                System.out.println(map);
            }
        }else {
            System.out.println("无情无义");
        }
    }
}
