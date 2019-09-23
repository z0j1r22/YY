package service;

import Dao.UserDao;
import Dao.UserDaoImpl;
import com.alibaba.druid.sql.PagerUtils;
import entity.Message;
import entity.Page;
import entity.User;
import utils.PageUtil;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    UserDao userDao=new UserDaoImpl();

    @Override
    public Boolean checkUserExists(String userName) {
        return userDao.checkUserExists(userName);
    }

    @Override
    public Page ByPage(int PageNo) {
        int pagesize=PageUtil.PAGE_SIZE;
        return userDao.queryByPage(PageNo,pagesize);
    }

    @Override
    public Message update(User info) {
        Message message=new Message();
        int result=-1;
        //录入操作
        if(info.getId()==null||info.getId()==0){
            result= userDao.add(info);
            if(result>=1){
                message=new Message(200,"录入成功");
            }else
            {
                message=new Message(300,"录入失败");
            }
        }else{//修改操作
            result= userDao.Update(info);
            if(result>=1){
                message=new Message(200,"修改成功");
            }else
            {
                message=new Message(300,"修改失败");
            }
        }
        return message;
    }

    @Override
    public Map queryById(String id) {
        return userDao.queryById(Integer.parseInt(id));
    }

    @Override
    public Page queryByPages(int PageNo) {
        //设定每页的显示条数
        int  pageSize= PageUtil.PAGE_SIZE;
        return userDao.QueryByPages(PageNo,pageSize);
    }

    @Override
    public int reg(User info) {
        return userDao.add(info);
    }

    @Override
    public Map login(User info) {
        return userDao.checkLogin(info);
    }

    @Override
    public List<Map> queryALL() {
        return userDao.queryAll();
    }

    @Override
    public int delete(int id) {
        return userDao.delete(id);
    }

    @Override
    public int Delete(int id) {
        return userDao.Delete(id);
    }

    @Override
    public int Update(User info) {
        return userDao.Update(info);
    }
}
