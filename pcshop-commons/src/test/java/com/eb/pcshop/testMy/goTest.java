/*package com.eb.pcshop.testMy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Constructor;

*//**
 * Created by 孔泽琦 on 2018/4/26.
 *//*
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class goTest {

    @Test
    public  void test1(){
        MyTest myTest=new MyTest();
        myTest.one();
        myTest.two();
        myTest.three();
    }
     @Test
    public  void test2(){
         ParentTest parentTest=new ParentTest();
         parentTest.one();
         parentTest.two();
    }

   @Test
    public  void test3(){
        ParentTest parentTest=new MyTest();
         parentTest.one();
         parentTest.two();
    }

     @Test
    public  void test4() throws ClassNotFoundException {
       Class student =  Student.class;

       Class sudent1 = Class.forName("com.eb.pcshop.testMy.Student");
        //获取所有的共有的构造方法
       Constructor[] constructors= sudent1.getConstructors();

     for (Constructor constructor : constructors) {
         System.out.println(constructor);
     }
    }

      @Test
    public  void test5() {

          Teacher teacher=new Teacher();


      }


}*/
