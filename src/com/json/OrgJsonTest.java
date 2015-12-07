package com.json;


import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root on 10/19/15.
 */
public class OrgJsonTest {
    // 构造json数据
    public static String buildJson() {
        JSONObject jo = new JSONObject();

        Map<String, String> map = new HashMap<>();
        map.put("name", "Alexia");
        map.put("sex", "female");
        map.put("age", "23");

        Map<String, String> map2 = new HashMap<>();
        map2.put("name", "Edward");
        map2.put("sex", "male");
        map2.put("age", "24");

        List<Map> list = new ArrayList<>();
        list.add(map);
        list.add(map2);

        Employee employee = new Employee();
        employee.setName("wjl");
        employee.setSex("female");
        employee.setAge(24);

        // 将Map转换为JSONArray数据
        JSONArray ja = new JSONArray();
        ja.put(map);
        ja.put(map2);
        System.out.println("JSONArray对象数据格式：");
        System.out.println(ja.toString());

        // 将JavaBean转换为Json数据
        JSONObject jo2 = JsonHelper.toJSON(employee);
        System.out.println("\n仅含Employee对象的Json数据格式：");
        System.out.println(jo2.toString());

        // 构造Json数据，包括一个map和一个含有Employee对象的Json数据
        jo.put("map", ja);
        jo.put("employee", jo2.toString());
        System.out.println("\n最终构造的JSON数据格式");
        System.out.println(jo.toString());

        return jo.toString();
    }

    // 解析JSON数据
    public static void parseJson(String jsonString) {
        JSONObject jo = new JSONObject(jsonString);
        JSONArray ja = jo.getJSONArray("map");
        System.out.println("\n将Json数据解析为Map:");
        System.out.println("name: " + ja.getJSONObject(0).getString("name") + ", sex: " + ja.getJSONObject(0).getString("sex") + ", age:" + ja.getJSONObject(0).getInt("age"));
        System.out.println("name: " + ja.getJSONObject(1).getString("name") + ", sex: " + ja.getJSONObject(1).getString("sex") + ", age:" + ja.getJSONObject(1).getInt("age"));
        String jsonStr = jo.getString("employee");
        Employee emp = new Employee();
        System.out.println(jsonStr);
        JsonHelper.toJavaBean(jsonStr, emp);
        System.out.println("\n将Json数据解析为Employee对象");
        System.out.println("name: " + emp.getName() + ", sex: " + emp.getSex() + ", age: " + emp.getAge());

    }

    public static void main(String[] args) {
        parseJson(buildJson());
    }
}
