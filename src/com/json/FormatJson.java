package com.json;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 10/22/15.
 *
 */
public class FormatJson {
    public static void main(String[] args) throws Exception {
//        String jsonString = "{\"flumeAddr\":\"192.168.21.20\",\"machineStatusPath\":\"/opt/intellij_workspace/fakenode/data/linux_agent/conf/linuxMachineStatus.json\",\"localThriftServerPort\":9996,\"flumeBatchSize\":100,\"machineConfigPath\":\"/opt/intellij_workspace/fakenode/data/linux_agent/conf/remoteLinuxConfig.json\",\"readConfSeconds\":3,\"sshdNumThreshold\":30,\"sendCacheSize\":1000,\"flumePort\":5858,\"log4jConfPath\":\"/opt/intellij_workspace/fakenode/data/linux_agent/conf/log4j.properties\"}";
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        JsonParser jp = new JsonParser();
//        JsonElement je = jp.parse(jsonString);
//        String prettyString = gson.toJson(je);
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("test.json"))) {
//            bw.write(prettyString);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        JsonParser jp = new JsonParser();
//        JsonElement je = jp.parse(new FileReader("test.json"));
//        JsonObject object = je.getAsJsonObject();
//        System.out.println(object.toString());
//        String flumeAddr = object.get("flumeAddr").getAsString();
//        System.out.println(flumeAddr);
        Map<String, String> map = new HashMap<>();
        map.put("log", "Nov  2 12:38:45 localhost postfix/pickup[30803]: 4D0A6540A05: uid=0 from=<user@localhost>");
        map.put("sourcetype", "maillog");
        map.put("ip_str", "192.168.21.20");
        String str = JSONObject.toJSONString(map);
        System.out.println(str);
        JSONParser parser = new JSONParser();
        JSONObject object = (JSONObject)parser.parse(str);
        String log = object.get("log").toString();
        String sourcetype = object.get("sourcetype").toString();
        String ip_str = object.get("ip_str").toString();
        System.out.println("log = " + log);
        System.out.println("sourcetype = " + sourcetype);
        System.out.println("ip_str = " + ip_str);
    }
}
