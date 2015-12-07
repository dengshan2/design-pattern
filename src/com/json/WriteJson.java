package com.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by root on 11/24/15.
 * author: zd
 */
public class WriteJson {
    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> logFileRead = new ConcurrentHashMap<>();
        logFileRead.put(1111, 1111);
        logFileRead.put(2222, 2222);
        logFileRead.put(3333, 3333);
        logFileRead.put(4444, 4444);
        Map<String, Map<Integer, Integer>> logType = new ConcurrentHashMap<>();
        logType.put("wtmp", logFileRead);
        logType.put("maillog", logFileRead);
        Map<String, Map<String, Map<Integer, Integer>>> logMachine = new ConcurrentHashMap<>();
        logMachine.put("192.168.21.20", logType);
        logMachine.put("192.168.22.110", logType);
        System.out.println(logMachine.toString());
        String str = logMachine.toString();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser parser = new JsonParser();
        JsonElement element = parser.parse(str);
        String prettyJsonStr = gson.toJson(element);
        String path = "conf/write.json";
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        writer.write(prettyJsonStr);
        writer.flush();
        writer.close();

    }
}
