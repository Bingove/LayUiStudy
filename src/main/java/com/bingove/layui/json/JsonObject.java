package com.bingove.layui.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName LayUiStudy
 * @Author 常冬军
 * @Date 2019/5/18 0018上午 8:59
 * @title: JsonObject
 * @ToDo
 */
public class JsonObject {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setId(i);
            student.setAge(23+i);
            student.setName("刘淼 - " + i);
            student.setAddress("河南省郑州市金水区 - " + i);
            students.add(student);
        }
        JsonObject jsonObject = new JsonObject();
        String s = jsonObject.objectToString(students.get(0));
        System.out.println("对象转json  "+s);
        System.out.println("-------------------------------------------");
        String s1 = jsonObject.objectToString(students);
        System.out.println("list 转json --  " + s1);
        System.out.println("-___________________________________________");
        //Student o = (Student)jsonObject.stringToObject(s);
        Student student = JSONObject.parseObject(s, Student.class);
        System.out.println("json 转 对象  " + student);
        System.out.println("---------------------------------------");
        List<Student> students1 = JSONArray.parseArray(s1, Student.class);
        System.out.println(students1);
        System.out.println("???????????????????????????????????????");
        Student student1 = jsonObject.stringToObject(s, Student.class);
        System.out.println("stu111  " + student1);
    }
    public String objectToString(Object o) {
        String s = JSON.toJSONString(o);
        return s;
    }

   public <T> T stringToObject(String s,Class<T> tClass) {
       try {
           T t = tClass.newInstance();
       } catch (InstantiationException e) {
           e.printStackTrace();
       } catch (IllegalAccessException e) {
           e.printStackTrace();
       }
       return JSONObject.parseObject(s,tClass);
    }
}
