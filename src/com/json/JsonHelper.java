package com.json;

import org.json.JSONObject;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by root on 10/19/15.'
 * zd
 */
public class JsonHelper {

    /* 将javabean转换成map */
    public static Map toMap(Object javaBean) {
        Map<String, Object> result = new HashMap<>();
        Method[] methods = javaBean.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("get")) {
                String field = method.getName();
                field = field.substring(field.indexOf("get") + 3);
                field = field.toLowerCase().charAt(0) + field.substring(1);

                try {
                    Object value = method.invoke(javaBean, (Object[])null);
                    result.put(field, null == value ? "" : value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

    /* 将JsonObject转换成map */
    public static Map toMap(String jsonString) {
        JSONObject jo = new JSONObject(jsonString);
        Map<String, Object> result = new HashMap<>();
        Iterator iterator = jo.keys();
        String key;
        Object value;
        while (iterator.hasNext()) {
            key = (String)iterator.next();
            value = jo.get(key);
            result.put(key, value);
        }
        return result;
    }

    /* 将JavaBean转换成JSONObject (通过map转换)*/
    public static JSONObject toJSON(Object javaBean) {
        return new JSONObject(toMap(javaBean));
    }

    /* 将map转换成javabean */
    public static Object toJavaBean(Object javaBean, Map data) {
        Method[] methods = javaBean.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("set")) {
                String field = method.getName();
                field = field.substring(field.indexOf("set") + 3);
                field = field.toLowerCase().charAt(0) + field.substring(1);
                try {
                    method.invoke(javaBean, data.get(field));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return javaBean;
    }

    /* JSONObject 到 JavaBean */
    public static void toJavaBean(String jsonString, Object javaBean) {
        JSONObject jo = new JSONObject(jsonString);
        Map map = toMap(jo.toString());
        toJavaBean(javaBean, map);
    }
}
