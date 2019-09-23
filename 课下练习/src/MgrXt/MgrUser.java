package MgrXt;

import javax.security.auth.login.AccountException;
import java.util.ArrayList;
import java.util.List;

public class MgrUser {
    public  static List<User>userList=new ArrayList<>();

    public void reg(User user){
        if (!isExists(user)){
            userList.add(user);
        }else {
            throw new AccountExistsException("该账户"+user.getName()+"已存在");
        }
    }

    private boolean isExists(User user) {
        if (user==null){
            throw new RuntimeException("不能查找null数据");
        }
        boolean result=false;
        for (User user1:userList){
            if (user.getName().equals(user1.getName())){
                result=true;
                break;
            }
        }
        return result;
    }
    public  void UserLogin(User user){
        for (User user1:userList){
            if (user.getName().equals(user1.getName())&& user.getPwd().equals(user1.getPwd())){
                System.out.println("登录成功");
            }else {
                throw new AccountExistsException("账号或密码不正确");
            }
        }
    }
    public void showUser(int state){
        System.out.println("用户\t类型\t状态");
        for (User user:userList){
            if (user.getState()==state){
                String sType=user.getType()==1?"管理员":"普通用户";
                String sState=user.getState()==1?"启用":"禁用";
                System.out.println(user.getName()+"\t"+sType+"\t"+sState);
            }
        }
    }

}
