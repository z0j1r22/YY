import entity.BaseDao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Test6 {
    public static void main(String[] args)throws SQLException {
        //提供的日期类型：java.util.Date
        Date date=new Date();
        //获取日期的毫秒值
        System.out.println(date.getTime());
        //转换成java.sql.Date
        java.sql.Date date1=new java.sql.Date(date.getTime());
        BaseDao baseDao=new BaseDao();
        List<Map> mapList=baseDao.executeQuery("select * from student",null);
        for (Map map : mapList) {
            System.out.print(map.get("id"));
            System.out.print("\t");
            System.out.print(map.get("name"));
            System.out.print("\t");
            System.out.println(map.get("stuno"));
            System.out.println();
        }
    }
}
