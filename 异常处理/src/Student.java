public class Student {
    private String name;
    private String sex;
    private int age;
    public  void setSex(String sex) throws Exception{
        if (sex.equals("男")||sex.equals("女")){
            this.sex=sex;
            System.out.println("学生性别为："+this.sex);
        }
        else {
            throw new Exception("性别设置错误");
        }
    }
    public  void setAge(int age) throws Exception{
        if (age<0||age>100){
            throw  new Exception("年龄输入有误");
        }
        else{
            this.age=age;
            System.out.println("学生年龄为："+this.age);
        }
    }
    public  void  setName(String name)throws Exception{
        if (name.length()<2||name.length()>5){
            throw  new Exception("姓名有误");
        }else{
            this.name=name;
            System.out.println("学生姓名为："+this.name);
        }
    }
}
