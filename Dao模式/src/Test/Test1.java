package Test;

import Dao.RoleDao;
import Dao.RoleDaoImpl;
import entity.Role;

import java.util.List;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
//            Role role=new Role(4,"贾宝",2,"红梦");
        Role role=new Role(1);
//        Role role=new Role("5");
        RoleDao dao=new RoleDaoImpl();
//        int result=dao.Add(role);
//        int result1=dao.delete(role);
//        int result=dao.update(role);
        int result=dao.delete(role);
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
