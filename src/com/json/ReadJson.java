package com.json;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by root on 11/24/15.
 * author: zd
 */
public class ReadJson {
    public static void main(String[] args) {
        String file_path = "conf/package.json";
        JSONParser parser = new JSONParser();
        JSONObject jsObj;
        try {
            jsObj = (JSONObject)parser.parse(new FileReader(file_path));
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        Set keys = jsObj.keySet();
        //create new HashMap to store machines in config file
        Map<String, Map<String, Map<Integer, Count>>> newMap = new HashMap<>();
        for(Object key : keys) {
            JSONObject logAll = (JSONObject) jsObj.get(key.toString());
            Map<String, Map<Integer, Count>> mapAllType = new ConcurrentHashMap<>();
            for (Object log : logAll.keySet()) {
                Map<Integer, Count> mapInode = new ConcurrentHashMap<>();
                JSONObject log1 = (JSONObject)logAll.get(log);
                for (Object inode : log1.keySet()) {
                    Count count = new Count(Integer.parseInt(log1.get(inode).toString()));
                    mapInode.put(Integer.parseInt(inode.toString()), count);
                }
                mapAllType.put(log.toString(), mapInode);
            }
            newMap.put(key.toString(), mapAllType);
        }
        System.out.println(newMap.toString());
//        String str = newMap.toString();
//        Gson gson3 = new GsonBuilder().setPrettyPrinting().create();
//        JsonParser jp = new JsonParser();
//        JsonElement je = jp.parse(str);
//        String prettyJsonStr = gson3.toJson(je);
//
//        String filename = "conf/write.json";
//
//        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
//            writer.write(prettyJsonStr);
//            writer.flush();
//        } catch (Exception e) {
//           e.printStackTrace();
//        }
    }
}
