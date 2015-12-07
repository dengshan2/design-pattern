package com.json;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Set;

/**
 * Created by root on 11/24/15.
 * author: zd
 */
public class ReadJson2 {
    public static void main(String[] args) {
        String file_path = "conf/package1.json";
        JSONParser parser = new JSONParser();
        JSONObject jsObj;
        try {
            jsObj = (JSONObject)parser.parse(new FileReader(file_path));
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        Set keys = jsObj.keySet();
        for (Object key : keys) {
            String startTime = jsObj.get(key).toString();
            System.out.println(startTime.length());
        }
    }
}
