package Test;

import java.util.*;

public class Test2Test {
    public static void main(String[] args) {
        Set<Test2> Test2s=new TreeSet<>();
        while(Test2s.size()<20){
            //创建学生对象
            Integer id=(int)(Math.random()*30+1);
            int grade=(int)(Math.random()*6+1);
            int score=(int)(Math.random()*100+1);
            Test2 Test2=new Test2(id,grade,score);
            Test2s.add(Test2);
        }

        //获取最高分对应的学生信息
        Test2 maxTest2=null;
        //获取最低分对应的学生信息
        Test2 minTest2=null;

        Iterator<Test2> iterator= Test2s.iterator();
        while(iterator.hasNext()){
            Test2 Test2=iterator.next();
            Test2 test2=iterator.next();
            if(maxTest2==null){
                maxTest2=Test2;
            }
            if (minTest2==null){
                minTest2=test2;
            }
            //比较取得最高的成绩
            if(maxTest2.getScore()<Test2.getScore()){
                maxTest2=Test2;
            }
            //比较取得最低的成绩
            if (minTest2.getScore()>test2.getScore()){
                minTest2=test2;
            }


            System.out.println(Test2);
            System.out.println(test2);
        }

        System.out.println("最高成绩："+maxTest2);
        System.out.println("最低成绩："+minTest2);


    }

}

