package Dao;

import entity.Page;
import entity.User;

import java.util.List;
import java.util.Map;

public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public int add(User info) {

        String sql="insert into t_user(username,password,workno,phone,sex,birth)values(?,?,?,?,?,?) ";
        Object[] params=new Object[]{info.getUserName(),"123456",info.getWorkno(),info.getPhone(),info.getSex(),info.getBirth()};


        return executeUpdate(sql,params);
    }

    @Override
    public Map checkLogin(User info) {
        String sql="select* from t_user where username=? and password=? ";
        Object[] params=new Object[]{info.getUserName(),info.getPassword()};
        List<Map> mapList=this.executeQuery(sql,params);
        System.out.println(mapList);
        return mapList.size()>0?mapList.get(0):null;

    }
    @Override
    public int Update(User info) {
        String sql="update t_user set username=?,workno=?,phone=?,sex=?,birth=?where id=?";
        Object[]params=new Object[]{info.getUserName(),info.getWorkno(),info.getPhone(),info.getSex(),info.getBirth(),info.getId()};
        return executeUpdate(sql,params);
    }

    @Override
    public Boolean selname(String username) {
        String sql="select * from t_user where username=?";
        Object[] params=new Object[]{username};
        return this.executeQuery(sql,params).size()!=0?true:false;
    }

    @Override
    public Map queryById(int id) {
        String sql="select * from t_user where id=?";
        Object[] parms=new Object[]{id};
        List<Map> list=this.executeQuery(sql,parms);
        return list.size()>0?list.get(0):null;
    }

    @Override
    public Page QueryByPages(int PageNo, int PageSize) {
        String sql="select * from t_user limit ?,?";
        Object[]params=new Object[]{(PageNo-1)*PageSize,PageSize};
        List<Map>list=executeQuery(sql,params);
        Integer TotalCount=Integer.valueOf(queryCount().toString());
        Page page=new Page(PageNo,PageSize,TotalCount,list);
        return page;
    }

    @Override
    public boolean checkUserExists(String userName) {
        String sql="select count(*) cnt from t_user where username=?";
        Object[] params=new Object[]{userName};
//        this.executeQuery(sql,params):返回一个List<Map>集合
//        .get(0)：取集合中的第一个map
//        .get("cnt")：取map中的cnt对应的值 ：Object
        return (Long)this.executeQuery(sql,params).get(0).get("cnt")>0?true:false;
    }

    @Override
    public Page queryByPagetest(int PageNo, int PageSize) {
        String sql="select * from student limit ?,?";
        Object[]Params=new Object[]{(PageNo-1)*PageSize,PageSize};
        List<Map>list=executeQuery(sql,Params);
        Integer TotalCount=Integer.valueOf(queryCount().toString());
        Page page=new Page(PageNo,PageSize,TotalCount,list);
        return page;
    }

    @Override
    public Page queryByPage(int PageNo, int PageSize) {
        String sql="select * from student limit ?,?";
        Object[]Params =new Object[]{(PageNo-1)*PageSize,PageSize};
        List<Map>list=executeQuery(sql,Params);
        Integer totalCount=Integer.valueOf(queryCount().toString());
        Page pager=new Page(PageNo,PageSize,totalCount,list);
        return pager;
    }

    public Long queryCount(){
        String sql="select count(*) cnt from t_user";
        List<Map>list=executeQuery(sql,null);
        return (Long) list.get(0).get("cnt");
    }


    @Override
    public int delete(int id)  {
       String sql="delete from t_user where id=?";
       Object[] params=new Object[]{id};
       return this.executeUpdate(sql,params);
    }

    @Override
    public int Delete(int id) {
        String sql="delete from student where id=?";
        Object[] params=new Object[]{id};
        return executeUpdate(sql,params);
    }

    @Override
    public List<Map> queryAll() {
        String sql="select * from student";
        return  this.executeQuery(sql,null);
    }

}
